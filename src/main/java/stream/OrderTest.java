package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

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

        orders.forEach(p->{

        });

        orders.forEach(new Consumer<Order>() {
            @Override
            public void accept(Order order) {

            }
        });
    }
}
