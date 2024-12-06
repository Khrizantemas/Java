import  java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        1) შექმენით კლასი მანქანისთვის (Car) რომელსაც ექნება შემდეგი ველები: მანქანის მარკა,
//        მანქანის მოდელი, გამოშვების წელი და ავტომობილის სახელმწიფო ნომერი. ასევე ექნება
//        მეთოდი printInfo() რომელიც ბეჭდავს ინფორმაციას ავტომობილის შესახებ. Main ში
//        შექმენით Car კლასის ორი ობიექტი. გააკეთეთ ველების ინიციალიზაცია და printInfo()
//        მეთოდის გამოყენებით დაბეჭდეთ ინფორმაცია თითოეული ობიექტის შესახებ


//        Car car = new Car("Bmw" , "e39",2001, "gg - 000 - gb");
//        car.info();
//
//        System.out.println();
//
//        Car car1 = new Car("Lada", "jiguli",1990,"ff - 900 - ff");
//        car1.info();



//        2) .დაწერეთ რეკურსიული ფუნქცია, რომელიც მიწოდებული a,b და k-სთვის დაითვლის [a,b]
//        შუალედში k-ს ჯერადების ჯამს. გამოიძახეთ ფუნქცია main()-ში კლავიატურიდან შეტანილი
//        მონაცემებისთვის და საბოლოო შედეგი გამოიტანეთ ეკრანზე.

//        System.out.print("Enter a :  ");
//        int a = scanner.nextInt();
//        System.out.print("Enter  b : ");
//        int b = scanner.nextInt();
//        System.out.print("Enter k : ");
//        int k = scanner.nextInt();
//
//        Rec calc = new Rec();
//        int result = calc.sumofmults(a, b, k);
//        System.out.println("Sum of multipes of k in the range [a, b] is : " + result);


//        3) დაწერეთ რეკურსიოული ფუნქცია რომელიც გამოითვლის 1 დან n მდე ნატურალური
//        რიცხვების ჯამს


//        System.out.print("Enter n : ");
//        int n = scanner.nextInt();
//        SumCalc calc= new SumCalc();
//        int result = calc.sum(n);
//        System.out.println("from 1 to "+ n + " natural numbers sum eqiuals : " + result);



//        4) დაწერეთ რეკურსიული ფუნქცია რომელიც იპოვის დადებითი მთელი a რიცხვის n
//        ნატურალურ ხარისხს.(an)

//        System.out.print("Enter positive int a : ");
//        int a = scanner.nextInt();
//        System.out.print("Enter  n for power : ");
//        int n = scanner.nextInt();
//
//        PowCalc calc = new PowCalc();
//        int result = calc.power(a, n);
//        System.out.println(a + " ^ " + n + " = " + result);


//        5) დაწერეთ რეკურსიული ფუნქცია, რომელიც მიწოდებული რიცხვისთვის დაადგენს რამდენ
//        0-ანს შეიცავს. დაწერეთ მეორე ფუ-ენქცია რომელიც გამოიძახებს პირველს მიწოდებული
////        რიცხვისთვის და გაარკვევს 0ბის რაოდენობა კენტია თუ ლუწი და დაბეჭდავ2ს შესაბამის
//        შეტყობინებას. გამოიძახეთ მეორე ფუნქცია main()-ში სხვადასხვა მონაცემებისთვის.

        ZeroCount zeroCounter = new ZeroCount();

        System.out.print("Enter num  : ");
        int num = scanner.nextInt();
        zeroCounter.checkZero(num);

        System.out.print("Enter other num : ");
        num = scanner.nextInt();
        zeroCounter.checkZero(num);

    }
}