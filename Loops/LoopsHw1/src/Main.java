public class Main {
    public static void main(String[] args) {

//        1. დათვალეთ 10-დან 100-მდე 5-ის ჯერადი რიცხვების ჯამი.

//        int sum = 0;
//
//        for (int i = 10; i<100 ; i++){
//            if (i % 5 == 0){
//                sum +=i;
//            }
//            else{
//                continue;
//            }
//        }
//        System.out.println(sum);



//        2. დაადგინეთ რამდენნიშნაა მოცემული მთელი რიცხვი.

//        int number = 8648;
//        int digit = 1;
//
//        while (number > 10){
//            number /= 10;
//            digit++;
//        }
//        System.out.println(digit);



//       3. დაადგინეთ რიცხვი არის თუ არა მარტივი.

//
//        int number = 11;
//        for (int i = 2; i < number; i++){
//            if (number % i == 0){
//                System.out.println("Normal Num");
//                break;
//            }
//            else {
//                System.out.println("Simple Num");
//                break;
//            }
//        }





//        4. დაადგინეთ ორი რიცხვის უდიდესი საერთო გამყოფი.

//        int a = 5;
//        int b = 14;
//
//        while (a != b) {
//            if (a > b) {
//                a -= b;
//            } else {
//                b -= a;
//            }
//        }
//        System.out.printf("Biggest multip of a and b is : %d%n", a);



//        5. შეადგინეთ პროგრამა, რომელიც წარმოადგენს ყველა სამნიშნა რიცხვს,
//           რომელი ცუნაშთოდ იყოფა თავისცი ფრთა ჯამზე

//        for (int num = 100; num < 1000; num++) {
//            int sum = 0;
//            int current = num;
//
//            while (current != 0) {
//                sum += current % 10;
//                current /= 10;
//            }
//
//            if (num % sum == 0) {
//                System.out.println(num);
//            }
//        }



//        6. შექმენით პროგრამა რომელიც დაწერს ფიბონაჩის მიმდევრობის პირველ 10
//        წევრს. მიმდევრობის პირველი წევრია 0 მეორე წევრია 1. არ გამოიყენოთ
//        რეკურსია

        int count = 10;
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        for (int i = 0; i < count - 2; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;


        }













    }

}