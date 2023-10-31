package Methodoveeiding24;

public class Test {
    public static void main(String args[]){
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate Of Interest: " +s.getRateOfInterest());
        System.out.println("ICICI Rate Of Interest: " +i.getRateOfInterest());
        System.out.println("AXIS Rate OF Interest : " + a.getRateOfInterest());
    }

}
