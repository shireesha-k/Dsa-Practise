package java_internal;
class Airplane{
    int flightN0;
    String destination;
    int deparTime;
    boolean isDelayed=true;
    void set(int f,String d,int t){
        flightN0=f;
        destination=d;
        deparTime=t;
    }
    void checkStatus(){
        System.out.println("Flight " + flightN0 + " to " + destination);
        System.out.println("Scheduled Departure: " + deparTime);
    }
    void checkDelay(){
        if(isDelayed){
            System.out.println("Flight is delayed");
        }
        else{
            System.out.println("Flight is on time");
        }
    }
}
public class nine {
    public static void main(String[] args){
        Airplane a=new Airplane();
        a.set(123,"Hyderabad",12);
        a.checkStatus();
        a.checkDelay();
    }
}
