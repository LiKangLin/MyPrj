package ConsumerAndProduct;

/**
 * Created by LKL on 2017/2/22.
 * 服务员，消费者
 */
public class WaitPerson implements Runnable{
    private Restaurant restaurant;

    public WaitPerson(Restaurant r) {
        restaurant = r;
    }
    public void run(){
        try {
         while(!Thread.interrupted()){

                synchronized (this) {
                    while (restaurant.meal == null){
                        wait();
                    }
                }
                System.out.println("WaitPerson got" + restaurant.meal);
                synchronized (restaurant.chef){
                    restaurant.meal=null;
                    restaurant.chef.notifyAll();
                }
            }
        }catch (InterruptedException e) {
            System.out.println("WaitPerson interrupted");
            }
    }
}

