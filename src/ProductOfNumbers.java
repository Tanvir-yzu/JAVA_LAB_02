public class ProductOfNumbers {
    public static void main(String[] args) {
        long product = 1; // Initialize product to 1
        for (int i = 1; i <= 10; i++) {
            product *= i; // Multiply product by each number from 1 to 100
        }
        System.out.println("The product of integers from 1 to 10 is: " + product);
    }
}
