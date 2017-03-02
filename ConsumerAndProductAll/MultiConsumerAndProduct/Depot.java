package MultiConsumerAndProduct;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Created by LKL on 2017/2/23.
 */
public class Depot {
    private int size;
    private Lock lock;
    public Depot(){
        this.size=0;    //仓库的数量刚开始为0
        this.lock = new ReentrantLock(); //独占锁

    }

    public void produce(int val){
        lock.lock();
        try {
            size +=val;
            System.out.printf("%s produce(%d) --> size=%d\n",Thread.currentThread().getName(),val,size);
        }finally{
            lock.unlock();
        }
    }
    public void consume(int val) {
        lock.lock();
        try {
            size -= val;
            System.out.printf("%s produce(%d) --> size=%d\n", Thread.currentThread().getName(), val, size);
        } finally {
            lock.unlock();
        }


    }
}

