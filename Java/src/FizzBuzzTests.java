import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTests {
    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    public void when_is_multiple_of_5_and_3_then_return_FizzBuzz(int i) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.doIt();

        assertEquals("FizzBuzz", result[i - 1]);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100})
    public void when_is_multiple_of_5_then_return_Buzz(int i) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.doIt();

        assertEquals("Buzz", result[i - 1]);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51})
    public void when_is_multiple_of_3_then_return_Fizz(int i) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.doIt();

        assertEquals("Fizz", result[i - 1]);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23, 26})
    public void when_is_not_multiple_of_3_or_5_then_return_number(int i) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] result = fizzBuzz.doIt();

        assertEquals(String.valueOf(i), result[i - 1]);
    }

}
