public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)²
        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int sum1 = calc.add(part1, part2);
        int result1 = calc.square(sum1);

        // Expression 2: (4 + 7)² + (8 + 3)²
        int sumA = calc.add(4, 7);
        int sumB = calc.add(8, 3);
        int result2 = calc.add(calc.square(sumA), calc.square(sumB));

        // Display results
        System.out.println("Result of (3 * 4 + 5 * 7)² = " + result1);
        System.out.println("Result of (4 + 7)² + (8 + 3)² = " + result2);
    }
}
