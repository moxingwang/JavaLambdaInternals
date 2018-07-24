package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: MoXingwang 2018-07-24 15:16
 **/
public class OrderTest {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Collections.sort(orders);
        orders.sort((o1,o2)->{
            return 1;
        });
    }
}
