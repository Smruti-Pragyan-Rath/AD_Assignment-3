public class q2 {
    public static void main(String[] args) {
        String num1 = "12345678901234567890";
        String num2 = "98765432109876543210";
        String result = addLargeNumbers(num1, num2);
        System.out.println("Sum: " + result); // Output: Sum: 111111111011111111100
    }

    public static String addLargeNumbers(String num1, String num2) {
        // Reverse both numbers
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        sb1.reverse();
        sb2.reverse();

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int maxLength = Math.max(sb1.length(), sb2.length());

        // Add each digit
        for (int i = 0; i < maxLength; i++) {
            int digit1 = (i < sb1.length()) ? sb1.charAt(i) - '0' : 0; // Get digit or 0 if out of bounds
            int digit2 = (i < sb2.length()) ? sb2.charAt(i) - '0' : 0; // Get digit or 0 if out of bounds
            int sum = digit1 + digit2 + carry; // Sum of digits and carry
            carry = sum / 10; // Update carry for the next digit
            result.append(sum % 10); // Append the last digit of the sum
        }

        // If there's a carry left at the end, append it
        if (carry > 0) {
            result.append(carry);
        }

        // Reverse the result to get the final sum
        return result.reverse().toString();
    }
}

