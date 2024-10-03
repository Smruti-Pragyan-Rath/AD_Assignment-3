public class q3  {
    public static void main(String[] args) {
        //objective-To find out if the number is a prime number or not using reccursion
        int number = 29; // Example number to check
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Recursive method to check if a number is prime
    public static boolean isPrime(int num, int divisor) {
        // Base cases
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (divisor * divisor > num) {
            return true; // No divisors found, so it is prime
        }
        if (num % divisor == 0) {
            return false; // Found a divisor, so it is not prime
        }
        // Recursive call
        return isPrime(num, divisor + 1); // Check next divisor
    }
}
