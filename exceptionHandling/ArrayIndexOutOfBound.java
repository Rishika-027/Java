package exceptionHandling;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        // int[] a = {1,2,3,4};
        // // System.out.println(a[2]);//3
        // System.out.println(a[5]);//java.lang.ArrayIndexOutOfBoundsException

        // String s = "Rishika";
        // int a = Integer.parseInt(s);
        // System.out.println(a);//java.lang.NumberFormatException

        // String s = "527";
        // int a = Integer.parseInt(s);
        // System.out.println(a);//527

        String s = "Rishika";
        // char ch = s.charAt(3);
        // System.out.println(ch);//h

        char ch = s.charAt(7);
        System.out.println(ch);//java.lang.StringIndexOutOfBoundsException
    }
}
