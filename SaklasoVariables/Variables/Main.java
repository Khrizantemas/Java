public class Main{
    public static void main (String[] args ){

        //1 if num is even or odd

//        int a = 16;
//        if (a % 2 ==0){
//            System.out.println("It is even");
//        }
//        else{
//            System.out.println("It is odd");
//        }



        //2 if num is positive negative or zero


//        int a = 0;
//
//        if (a > 0){
//            System.out.println("Positive");
//        }
//        else if (a == 0) {
//            System.out.println("Zero");
//        }
//        else{
//            System.out.println("Negative");
//        }



        //3 check if year is with 29 feb


//        int a = 2000;
//
//        if ((a % 4 == 0 && a % 100 != 0 ) || (a % 400 == 0)){
//            System.out.println("366 Days");
//        }
//        else{
//            System.out.println("365 Days");
//        }



        //4 Grade tester program


//        int a = 35;
//
//        if (a >=90){
//            System.out.println("A");
//        }
//        else if (a>=80){
//            System.out.println("B");
//        }
//        else if (a >=70){
//            System.out.println("C");
//        }
//        else{
//            System.out.println("F");
//        }



        //5 find lowest num in three


//        int a = 5;
//        int b = 10;
//        int c = 15;
//
//        if(a < b && a < c ){
//            System.out.println(a + " is lowest num");
//        }
//        if(b < c && b < a ){
//            System.out.println(b + " is lowest num");
//        }
//        if(c < b && c < a ){
//            System.out.println(c + " is lowest num");
//        }
//        else {
//            System.out.println("There are same numbers");
//        }



        //6 mass height

        //BMI mass / height ^2
        //if BMI < 18.5 NOOB
        //if BMI < 25 MEDIUM
        //if BMI < 30 FAT
        //if more caseoh

        double m = 60;
        double h = 1.73;
        double bmi = m / (h * h);

        if (bmi < 18.5){
            System.out.println("Noob");
        } else if (bmi < 25) {
            System.out.println("MEDIUM");
        } else if (bmi  < 30) {
            System.out.println("FAT");
        }
        else {
            System.out.println("Caseoh bro");
        }

    }
}
