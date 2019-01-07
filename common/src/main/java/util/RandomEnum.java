package util;

import java.util.Random;

public class RandomEnum<E extends Enum<E>> {
    private final Random RANDOM = new Random();
    private final E[] values;

    public RandomEnum(Class<E> input) {
        values = input.getEnumConstants();
    }

    public E random(){
        return values[RANDOM.nextInt(values.length)];
    }
}
