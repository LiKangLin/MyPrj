package MultiConsumerAndProduct1;



/**
 * Created by LKL on 2017/2/23.
 */
public class Producer1 {
    private Depot1 depot;

    public Producer1(Depot1 depot) {
        this.depot = depot;
    }
    //消费产品：新建一个线程向仓库中生产商品
    public void produce1(final int val){
        new Thread(){
            public void run() {
                depot.produce1(val);
            }
        }.start();
    }
}
