import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzzGenerator generator = new FizzBuzzGenerator();

        IntStream.rangeClosed(1, 100).forEach(n -> System.out.println(generator.generateStr(n)));
    }
}
