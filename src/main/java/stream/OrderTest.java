package stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description:
 * @author: MoXingwang 2018-07-24 15:16
 **/
public class OrderTest {
    public static void main(String[] args) {

        // 将Stream转换成容器或Map
        Stream<String> stream = Stream.of("I", "love", "you", "too");

        List<String> list = stream.collect(Collectors.toList()); // (1)
//        Set<String> set = stream.collect(Collectors.toSet()); // (2)
//        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length)); // (3)


        List<Order> orders = new ArrayList<>();
        Collections.sort(orders);
        orders.sort((o1, o2) -> {
            return 1;
        });

        orders.forEach(p -> {

        });

//        Function

        orders.forEach(new Consumer<Order>() {
            @Override
            public void accept(Order order) {

            }
        });
        List<BigDecimal> bigDecimals = Arrays.asList(BigDecimal.ONE,BigDecimal.TEN);

        bigDecimals.stream().reduce(BigDecimal::add).get();
        bigDecimals.stream().collect(Collectors.toList());
//        bigDecimals.stream().collect(Collectors::toList);
//        orders.stream().flatMap()
//        orders.stream().reduce()

        Consumer<String> consumer = System.out::println;
        consumer.accept("This is Major Tom");

        IFunctionInterface<String> functionInterface = System.out::println;

        functionInterface.apply("1111111111111111");
    }

    public void tt(IFunctionInterface iFunctionInterface) {

    }
}
