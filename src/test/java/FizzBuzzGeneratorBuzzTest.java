import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FizzBuzzGeneratorBuzzTest {

    FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    public void generateBuzzWhenNumberIs(int num) throws InterruptedException {
        Thread.sleep(1000L);
        assertEquals("Buzz", fizzBuzzGenerator.generateStr(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6})
    public void notGenerateBuzzWhenNumberIs(int num) throws InterruptedException {
        Thread.sleep(1000L);
        assertNotEquals("Buzz", fizzBuzzGenerator.generateStr(num));
    }
}
