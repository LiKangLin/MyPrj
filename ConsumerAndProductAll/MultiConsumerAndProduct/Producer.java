package MultiConsumerAndProduct;

/**
 * Created by LKL on 2017/2/23.
 */
public class Producer {
    private Depot depot;

    public Producer(Depot depot) {
        this.depot = depot;
    }
    //消费产品：新建一个线程向仓库中生产商品
    public void produce(final int val){
        new Thread(){
            public void run() {
                depot.produce(val);
            }
        }.start();
    }
}
