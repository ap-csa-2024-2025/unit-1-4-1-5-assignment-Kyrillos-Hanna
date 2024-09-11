public class Problem3 {
    public static void main(String[] args) {
        int integer = 1258;
        System.out.println("The 4 digit number is " + integer);
        System.out.println("Here are the digits");
        System.out.println(integer % 10);
        System.out.println(integer / 10 % 10);
        System.out.println(integer % 1000 / 100);
        System.out.println(integer / 1000);
    }
}
