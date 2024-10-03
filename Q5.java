public class q5{
    static int sumofdigits(String s1, int index){
        if(index<0) return 0;

        return (s1.CharAt(index)-'0') + sumofdigits(s1, index-1);
    }

    static boolean isdivisible(String s1){
        int sum=sumofdigits(s1, s1.length()-1);

        if(sum%3==0) return true;
        return false;
    }

     public static void main(String[] args) {
        String num = "123456"; // Example input number as a string

        if (isDivisibleBy3(num)) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }
    }
}
