package MultiConsumerAndProduct;

/**
 * Created by LKL on 2017/2/23.
 */
public class Customer {
    private Depot depot;

    public Customer(Depot depot) {
        this.depot = depot;
    }
    //消费产品：新建一个线程从仓库中消费产品
    public void consume(final int val){
        new Thread(){
            public void run(){
                depot.consume(val);
            }
        }.start();
    }
}
