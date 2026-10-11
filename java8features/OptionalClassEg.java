package java8features;

import java.util.Optional;

public class OptionalClassEg {
    // public static void main(String[] args) {
    //     // String str1 = null;
    //     // System.out.println(str1.length());//java.lang.NullPointerException

    //     //optional class
    //     String str2 = "Rishika";

    //     Optional opt = Optional.ofNullable(str2);
    //     System.out.println(opt);//Optional[Rishika]
    //     System.out.println(opt.get());//Rishika

    //     String name = null;

    //     Optional opt2 = Optional.ofNullable(name);
    //     System.out.println(opt2.get());//java.util.NoSuchElementException
    // }

    public static void main(String[] args) {
        String str2 = "Rishika";
        Optional<String> opt = Optional.ofNullable(str2);
        // System.out.println(opt.isPresent());//true

        // if(opt.isPresent()){
        //     System.out.println(opt.get());//Rishika
        // }else{
        //     System.out.println("Element is not present");
        // }

        String name = null;
        Optional<String> opt2 = Optional.ofNullable(name);
        // System.out.println(opt2.isPresent());//false

        if(opt2.isPresent()){
            System.out.println(opt2.get());
        }else{
            // System.out.println("Element is not present");//Element is not present
            String str3 = opt2.orElse("Rishika Vadlagatta");
            System.out.println(str3);//Rishika Vadlagatta
            // System.out.println(opt2.get());//java.util.NoSuchElementException
        }
    }
}
