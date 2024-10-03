public class q4 {
    //objective write a reccursive program to find the sum of even digits in a number
   

        // Recursive function to find the sum of even digits in a number
        public static int sumEvenDigits(int number) {
            // Base case: when the number becomes 0, stop recursion
            if (number == 0) {
                return 0;
            }

            // Extract the last digit
            int lastDigit = number % 10;

            // Check if the digit is even
            if (lastDigit % 2 == 0) {
                return lastDigit + sumEvenDigits(number / 10); // Add the even digit and recurse
            } else {
                return sumEvenDigits(number / 10); // Skip the odd digit and recurse
            }
        }

        public static void main(String[] args) {
            int number = 482536;
            int result = sumEvenDigits(number);
            System.out.println("The sum of even digits in " + number + " is: " + result);
        }
    




}

