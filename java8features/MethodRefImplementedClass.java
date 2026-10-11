package java8features;

public class MethodRefImplementedClass {
    
    

    public static void main(String[] args) {

        //static method
        // MethodRefInterface mri = MethodRefClss::test;
        // mri.methodInterface();//static method

        //instance method
        // MethodRefClss mrc = new MethodRefClss();
        // MethodRefInterface mri2 = mrc::demo;
        // mri2.methodInterface();//constructor method(because, object is created mrc so constructor is also exceuted)
                               //instance method

        //constructor method
        MethodRefInterface mri3 = MethodRefClss::new;
        mri3.methodInterface();//constructor method

    }
}
