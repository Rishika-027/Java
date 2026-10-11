package OOPs.Abstract;

public class JioSim extends OppoMobile{
    public void sendSms(){
        System.out.println("sms from Jio sim");
    }

    public static void main(String[] args) {
        JioSim js = new JioSim();
        js.playYoutube();//Playing youtube
        js.sendSms();//sms from Jio sim
    }
}
