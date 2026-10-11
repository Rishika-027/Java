package OOPs.Abstract;

public class AirtelSim extends OppoMobile {
    
    public void sendSms(){
        System.out.println("sms from Airtel sim");
    }

    public static void main(String[] args) {
        AirtelSim as = new AirtelSim();
        as.playYoutube();//Playing youtube
        as.sendSms();//sms from Airtel sim
    }
}
