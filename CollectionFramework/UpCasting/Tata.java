package UpCasting;

//upcasting
// public class Tata extends Car{
//     public void price(){
//         System.out.println("10 lakhs price");
//     }

//     public static void main(String[] args) {
//         Vehicle v = new Car();
//         // v.engine();//Engine in vehicle
//         // v.tyre();//error(downcasting)
//         // v.price();//error(downcasting)

//         Car c = new Tata();
//         // c.engine();//Engine in vehicle
//         // c.tyre();//tyres in car
//         // c.price();//error(downcasting)

//         Tata t = new Tata();
//         t.engine();//Engine in vehicle
//         t.tyre();//tyres in car
//         t.price();//10 lakhs price
//     }
// }


//downcasting
public class Tata extends Car{
    public void price(){
        System.out.println("10 lakhs price");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();//upcasting
        Car c = (Car)v;//downcasting
        // c.engine();
        // c.tyre();
        // c.price();//error

        Car c1 = new Tata();//upcasting
        Tata t = (Tata)c1;//downcasting 
        t.engine();
        t.tyre();
        t.price();
    }
}
