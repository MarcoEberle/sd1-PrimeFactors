/**
 * This class represents the prime factorization algorithm.
 * The divider starts with 2 and each time it doesnt divide the input value without remainder it gets incremented by 1.
 * Example: 1668 = 2 * 834 = 2 * 2 * 417 = 2 * 2 * 3 * 139. 139 cannot get more divided because it is a prime number.
 */
public class PrimeFactors {
    public static void main(String[] args) {

        final int inputValue = Integer.parseInt(args[0]);
        int divider = 2;
        int dividedValue = inputValue;

        while (divider <= dividedValue) {
            if (dividedValue % divider == 0) {
                System.out.println(divider);
                dividedValue = dividedValue / divider;
            } else {
                divider += 1;
            }
        }
    }
}
