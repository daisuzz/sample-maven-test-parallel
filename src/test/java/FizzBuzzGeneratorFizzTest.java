import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FizzBuzzGeneratorFizzTest {

    FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    @ParameterizedTest
    @ValueSource(ints = {3, 6})
    public void generateFizzWhenNumberIsThree(int num) throws InterruptedException {
        Thread.sleep(1000L);
        assertEquals("Fizz", fizzBuzzGenerator.generateStr(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    public void notGenerateFizzWhenNumberIs(int num) throws InterruptedException {
        Thread.sleep(1000L);
        assertNotEquals("Fizz", fizzBuzzGenerator.generateStr(num));
    }
}
