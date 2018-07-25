package stream;

/**
 * @description:
 * @author: MoXingwang 2018-07-25 12:46
 **/
@FunctionalInterface
public interface IFunctionInterface<T> {
    void apply(T t);
}
