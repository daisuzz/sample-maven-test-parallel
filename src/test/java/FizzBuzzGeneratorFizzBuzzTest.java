import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FizzBuzzGeneratorFizzBuzzTest {

    FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    public void generateBuzzWhenNumberIsThree(int num) throws InterruptedException {
        Thread.sleep(1000L);
        assertEquals("FizzBuzz", fizzBuzzGenerator.generateStr(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5})
    public void notGenerateBuzzWhenNumberIsThree(int num) throws InterruptedException {
        Thread.sleep(1000L);
        assertNotEquals("FizzBuzz", fizzBuzzGenerator.generateStr(num));
    }
}
