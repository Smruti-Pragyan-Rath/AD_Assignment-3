public class q6{
  // Array to store hexadecimal characters for remainders 10-15
    static char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    
    // Recursive function to convert decimal to hexadecimal
    static String decimalToHex(int num) {
        // Base case: when num is 0, return an empty string
        if (num == 0) {
            return "";
        }

        // Recursive call: divide the number by 16 and concatenate the remainder
        return decimalToHex(num / 16) + hexChars[num % 16];
    }

    public static void main(String[] args) {
        int decimal = 7562; // Example decimal number
        
        String hex = decimalToHex(decimal);
        
        // Handle the case where the decimal is 0
        if (hex.isEmpty()) {
            hex = "0";
        }

        System.out.println("The hexadecimal equivalent of " + decimal + " is: " + hex);
    }
}
