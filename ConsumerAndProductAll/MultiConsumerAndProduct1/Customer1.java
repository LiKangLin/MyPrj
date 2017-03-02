package MultiConsumerAndProduct1;



/**
 * Created by LKL on 2017/2/23.
 */
public class Customer1 {
    private Depot1 depot;

    public Customer1(Depot1 depot) {
        this.depot = depot;
    }
    //消费产品：新建一个线程从仓库中消费产品
    public void consume1(final int val){
        new Thread(){
            public void run(){
                depot.consume1(val);
            }
        }.start();
    }
}
