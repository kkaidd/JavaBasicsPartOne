public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        double dd = 5.5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (a--));
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d) + "\n");

        double sum = a + dd;
        double difference = a - dd;
        double product = a * dd;
        double quotient = a / dd;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient + "\n");

        boolean lessThan = a < b;
        boolean greaterThan = a > b;
        boolean greaterThanOrEqual = a >= b;
        boolean lessThanOrEqual = a <= b;

        System.out.println("Less than: " + lessThan);
        System.out.println("Greater than: " + greaterThan);
        System.out.println("Greater than or equal: " + greaterThanOrEqual);
        System.out.println("Less than or equal: " + lessThanOrEqual + "\n");

        int integerMax = Integer.MAX_VALUE;
        int integerMin = Integer.MIN_VALUE;

        System.out.println("Max int value: " + integerMax);
        System.out.println("Min int value: " + integerMin);

        int overflowMax = integerMax + 1;
        System.out.println("Overflow max integer value: " + overflowMax);
        int overflowMin = integerMax - 1;
        System.out.println("Overflow min integer value: " + overflowMin + "\n");

        System.out.println("Float max value: " + Float.MAX_VALUE);
        System.out.println("Float min value: " + Float.MIN_VALUE);
        System.out.println("Double max value: " + Double.MAX_VALUE);
        System.out.println("Double min value: " + Double.MIN_VALUE);
    }
}