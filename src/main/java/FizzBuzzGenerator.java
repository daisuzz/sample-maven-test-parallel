public class FizzBuzzGenerator {

    public String generateStr(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        if (n % 5 == 0) {
            return "Buzz";
        }

        if (n % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(n);
    }
}
