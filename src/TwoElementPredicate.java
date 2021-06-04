
@FunctionalInterface
public interface TwoElementPredicate<T>{

	boolean isFirstBetterThanSecond(T first,T second);
}
