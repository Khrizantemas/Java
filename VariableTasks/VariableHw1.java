import java.util.Scanner;
public class VariablesHv1{
    public static void main(String[] args){





//  1) გაუცვალეთ ორ მთელ რიცხვს ადგილები დამატებითი ცვლადის გამოყენებით
//  a) ახლა ცადეთ დმატებითი ცვლადის გამოყენების გარეშე

//  1)
//        int a = 10;
//        int b = 20;
//        int c;
//
//        c = a;
//        a = b;
//        b = c;
//
//        System.out.println("int a swch = " + a );
//        System.out.println("int b swch = " + b );


//  a)
//        int a = 10;
//        int b = 20;
//
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println("a : " + a );
//        System.out.println("b : " + b );





//  2) მოცემული გაქვთ არამთელი რიცხვი, დაბეჭდეთ ამ არამთელი რიცხვის მხოლოდ არამთელი
//       ნაწილი. მაგალითად თუ შემოგივიდათ 10.234 მაშინ უნდა დაბეჭდოთ 0.234.
//
//          float a = 10.234f;
//          int b = (int)a;
//          float fraction = a - b;
//
//          System.out.println("Additional nums of 10,234 : " + fraction);





//  3) მოცემული გაქვთ მთელი რიცხვი, დაადგინეთ არის თუ არა ეს რიცხვი სამნიშნა. (რიცხვი
//     რის მთელი)
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter three digit number : ");
//        int a = scanner.nextInt();
//
//        if (a/100 >=1 && a/100 <10){
//                System.out.println("There are three digits in the num");
//            }else {
//                System.out.println("There are more or less than 3 digits in num");
//            }




//  4) მოცემული გაქვთ სიმბოლო (char) რომელიც არის პატარა მაგ: a, b, c… თქვენი მიზანია ეს
//     რიცხვი გადაიყვანოთ თავის დიდ ფორმაში მაგ: A, B, C… გამოიყენეთ რიცხვები და არ
//     გამოიყენოთ ჯავაში ჩაშენებული მეთოდები. ანუ თუ შემოგივიდათ r დაბეჭდეთ R


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter lower case char : ");
//        char lowerChar = scanner.next().charAt(0);
//        char capitalChar;
//
//        switch (lowerChar) {
//            case "a":
//                capitalChar = "A";
//                break;
//            case "b":
//                capitalChar = "B";
//                break;
//            case "c":
//                capitalChar = "C";
//                break;
//            case "d":
//                capitalChar = "D";
//                break;
//            case "e":
//                capitalChar = "E";
//                break;
//            case "f":
//                capitalChar = "F";
//                break;
//            case "g":
//                capitalChar = "G";
//                break;
//            case "h":
//                capitalChar = "H";
//                break;
//            case "i":
//                capitalChar = "I";
//                break;
//            case "j":
//                capitalChar = "J";
//                break;
//            case "k":
//                capitalChar = "K";
//                break;
//            case "l":
//                capitalChar = "L";
//                break;
//            case "m":
//                capitalChar = "M";
//                break;
//            case "n":
//                capitalChar = "N";
//                break;
//            case "o":
//                capitalChar = "O";
//                break;
//            case "p":
//                capitalChar = "P";
//                break;
//            case "q":
//                capitalChar = "Q";
//                break;
//            case "r":
//                capitalChar = "R";
//                break;
//            case "s":
//                capitalChar = "S";
//                break;
//            case "t":
//                capitalChar = "T";
//                break;
//            case "u":
//                capitalChar = "U";
//                break;
//            case "v":
//                capitalChar = "V";
//                break;
//            case "w":
//                capitalChar = "W";
//                break;
//            case "x":
//                capitalChar = "X";
//                break;
//            case "y":
//                capitalChar = "Y";
//                break;
//            case "z":
//                capitalChar = "Z";
//                break;
//            default:
//                capitalChar = lowerChar;
//                break;
//        }
//
//        System.out.println("Capital char : " + capitalChar);




//  5) მოცემული გაქვთ არამთელი რიცხვი, თქვენი მიზანია დაამრგვალოთ ის უახლოეს მთელ
//     რიცხვამდე. თუ შემოგდით 14.4 -> 14 ხოლო 11.5 -> 12

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter float : ");
//        float a = scanner.nextFloat();
//        int b = Math.round(a);
//
//        System.out.print("From Float to Int : " + b);




//  6) მოცემული გაქვთ სამი რიცხვი a,b და k. დაადგინეთ რამდენი k სიგრძის გვერდიანი
//     კვადრატია საკმარისი იმისთვის, რომ მთლიანად დაიფაროს a * b ზომის ფართობი.
//     (თავისთავად შესაძლებელია გადაცდეს კვადრატები ფართობს)


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the length of rectangle : ");
//        int a = scanner.nextInt();
//
//        System.out.print("Enter the height of rectangle : ");
//        int b = scanner.nextInt();
//
//        System.out.print("Enter length of cube k : ");
//        int k = scanner.nextInt();
//
//        int MainArea = a * b;
//        int kArea = (int) Math.pow(k,2);
//        int Numofcubes = MainArea/kArea;
//
//        System.out.println("Amount of k cubes that can fill a,b area are : " + Numofcubes);


//  7) მოცემული გაქვთ რაიმე დადებითი რიცხვი რომელიც წარმოადგენს წამებს. თქვენი მიზანია
//     ეს წამები გადაიყვანოთ საათებში, წუთებსა და წამებში. მაგალითად თუ გაქვთ 2665 მაშინ
//     უნდა დაბეჭდოთ “1:1:5”


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter seconds : ");
//        int sec = scanner.nextInt();
//
//        int hour = 0;
//        int min = 0;
//        int remainingSeconds = sec;
//
//
//        if (remainingSeconds >= 3600) {
//            hour = remainingSeconds / 3600;
//            remainingSeconds = remainingSeconds % 3600;
//        }
//
//        if (remainingSeconds >= 60) {
//            min = remainingSeconds / 60;
//            remainingSeconds = remainingSeconds % 60;
//        }
//
//        System.out.println(hour + "H " + min + "M " + remainingSeconds + "S");





//  8) შეასრულეთ იგივე რაც 7 სავარჯიშოში if-ების გარეშე


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter seconds : ");
            int sec = scanner.nextInt();
            int hour = sec / 3600;
            int remainingSeconds = sec % 3600;
            int min = remainingSeconds / 60;
            int remainingSec = remainingSeconds % 60;

            System.out.print(hour + "H " + min + "M "+ remainingSec+"S ");

    }
}