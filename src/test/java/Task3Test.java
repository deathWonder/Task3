import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.programm.Task3;

import java.util.stream.Stream;

public class Task3Test {

    Task3 task3 = new Task3();

    @ParameterizedTest
    @MethodSource("sourceTestIsPowerOfTwo")
    public void testIsPowerOfTwo(int[] expected, int[] range){
        Assertions.assertArrayEquals(expected, task3.getPrimeNumbers(range));
    }

    public static Stream<Arguments> sourceTestIsPowerOfTwo(){
        return Stream.of(
                Arguments.of(new int[]{11, 13 , 17, 19}, new int[]{11, 20}),
                Arguments.of(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                        41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}, new int[]{1, 100})
        );
    }
}
