package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description:
 * @author: MoXingwang 2018-07-15 15:11
 * https://blog.csdn.net/jiangmingzhi23/article/details/78927552
 **/
public class SpliteratorTest {
    public static void main(String[] args) {
        ArrayList<String> arrays = new ArrayList<String>();

        arrays.add("a");
        arrays.add("b");
        arrays.add("c");
        arrays.add("d");
        arrays.add("e");
        arrays.add("f");
        arrays.add("g");
        arrays.add("h");
        arrays.add("i");
        arrays.add("j");

        arrays.remove("j");

        Spliterator<String> p = arrays.spliterator();

        Spliterator<String> s1 = p.trySplit();

        Spliterator<String> s2 = p.trySplit();

        System.out.println("p.consume :");
        p.forEachRemaining(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("s1.consume");
        s1.forEachRemaining(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("s2.consume");
        s2.forEachRemaining(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
