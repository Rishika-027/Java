package exceptionHandling;

public class ThrowEg {
    public void ageStatus(int age){
        if(age >= 18){
            System.out.println("eligible");
        }
        else{
            //custom exception
            throw new InvalidAgeException("not eligible");
        }
    }

    public static void main(String[] args) {
        ThrowEg te = new ThrowEg();
        // te.ageStatus(20);//eligible
        te.ageStatus(2);//exceptionHandling.InvalidAgeException: not eligible
    }
}
