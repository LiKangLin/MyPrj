package ConsumerAndProduct;

/**
 * Created by LKL on 2017/2/22.
 */
public class Meal {
    private final int orderNum;

    public Meal(int orderNum) {
        this.orderNum = orderNum;
    }
    @Override
    public String toString() {
        return "Meal" +
                + orderNum ;
    }
}
