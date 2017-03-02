package MultiConsumerAndProduct;

/**
 * Created by LKL on 2017/2/23.
 */
public class TestLock {
    public static void main(String[] args){
        Depot mDepot =new Depot();
        Producer mPro = new Producer(mDepot);
        Customer mCus = new Customer(mDepot);

        mPro.produce(60);
        mPro.produce(120);
        mCus.consume(90);
        mCus.consume(200);
        mPro.produce(110);
    }
}
