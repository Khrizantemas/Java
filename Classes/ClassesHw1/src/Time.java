public class Time {

    int hour;
    int min;
    int sec;

    Time(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    void time(){
        System.out.println(hour + " h " + min + " m " + sec + " s ");
    }

}
