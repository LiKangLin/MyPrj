package MultiConsumerAndProduct1;

import MultiConsumerAndProduct.Customer;
import MultiConsumerAndProduct.Producer;

/**
 * Created by LKL on 2017/2/23.
 */
public class TestLock1 {
    public static void main(String[] args){
        //仓库中总量设置为100
        Depot1 mDepot1 = new Depot1(100);
        Producer1 mPro = new Producer1(mDepot1);
        Customer1 mCus = new Customer1(mDepot1);

        mPro.produce1(60);
        mPro.produce1(120);
        mCus.consume1(90);
        mCus.consume1(150);
        mPro.produce1(110);

    }
}
