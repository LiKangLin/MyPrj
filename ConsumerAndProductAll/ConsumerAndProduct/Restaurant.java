package ConsumerAndProduct;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by LKL on 2017/2/22.
 */
public class Restaurant {
    Meal meal;
    //线程池的概念
    ExecutorService exec = Executors.newCachedThreadPool();
    WaitPerson waitPerson = new WaitPerson(this);
    Chef chef =new Chef(this);
    public Restaurant(){
        exec.execute(chef);
        exec.execute(waitPerson);
    }
    public static void main(String[] args){
        new Restaurant();
    }
}
