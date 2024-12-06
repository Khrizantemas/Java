public class Car {

    String Mark;
    String Model;
    int Year;
    String Nomeri;

Car(String mark , String model,int year,String number){
        this.Mark = mark;
        this.Model = model;
        this.Year = year;
        this.Nomeri = number;
    }

    public void info(){
        System.out.println("Mark : " + Mark);
        System.out.println("Model : " + Model);
        System.out.println("Year: " + Year);
        System.out.println("Number: " + Nomeri);
    }

}
