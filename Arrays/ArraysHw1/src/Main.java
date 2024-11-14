import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] b = new int[12];

        //1) შეადგინეთ პროგრამა, რომელიც int b[12] მასივის ელემენტებს მიანიჭებს მთელი
        //რიცხვის ნებისმიერ მნიშვნელობებს და დაბეჭდავს მათ.

//        System.out.println(" Array elements");
//        for (int i = 0; i < b.length; i++) {
//            b[i] = random.nextInt(100 ) ;
//            System.out.print(b[i] + " ,  ");
//        }


////        2) იპოვეთ წინა ამოცანაში შედგენილი მასივის ელემენტების ჯამი ნამრავლი და
////        საშუალო არითმეტიკული.
//
//        int sum = 0;
//        int multi = 1;
//        for (int num : b) {
//            sum += num;
//            multi *= num;
//        }
//        double avarage = (double) sum / b.length;
//        System.out.println("Sum = " + sum + ", multiplies = " + multi + ", Average = " + avarage);


//        3) შეადგინეთ მასივი int b[20] და შეავსეთ შემთხვევითი რიცხვებით [0;20]
//        შუალედიდან . დაბეჭდეთ მასივის ყველა ელემენტი. იპოვეთ ელემენტებს შორის
//        მაქსიმალური და მინიმალური, დაბეჭდეთ ორივე რიცხვი.


//        int[] array = new int[20];
//        System.out.println("Array elements:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(21);
//            System.out.print(array[i] + " , ");
//        }
//
//
//
//        System.out.println();
//
//        int max = array[0];
//        int min = array[0];
//        for (int num : array) {
//            if (num > max) max = num;
//            if (num < min) min = num;
//        }
//        System.out.println("Maximum = " + max + ", Minimun = " + min);


//        4) შეადგინეთ 15 ელემენტიანი მასივი და შეავსეთ მთელი რიცხვებით ისე რომ
//        თითოეული ელემენტის მნიშვნელობა იყოს მის იდექსზე ერთით მეტი.
//        მაგალითად 0 ინდექსზე მდგომი ელემენტის მნიშვნელობა უნდა იყოს 1, 1
//        ინდექსზე მგომის 2.

//        int[] array = new int[15];
//        System.out.println("Array elements : ");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();


//        5) იპოვეთ წინა ამოცანაში შედგენილი მასივის ელემენტების ჯამი, ნამრავლი და
//                საშუალო

//        int sum = 0;
//        int multi = 1;
//        for (int num : array) {
//            sum += num;
//            multi *= num;
//        }
//        double avarage = (double) sum / array.length;
//        System.out.println("Sum = " + sum + ", multiplied = " + multi + ", avarage= " + avarage);


//        6) დაადგინეთ მასივში გვხვდება თუ არა რაიმე მოცემული x რიცხვი.

//        int[] array = {1, 2, 3, 4, 5};
//        System.out.print("Enter a number to finde : ");
//        int x = scanner.nextInt() ;
//        boolean finde = false;
//        for (int num : array) {
//            if (num == x) {
//                finde = true;
//                break;
//            }
//        }
//        if (finde==true){
//            System.out.print("your number is in the array");
//        }
//        if (!finde){
//            System.out.print("Number not fouund");
//        }
//        System.out.println("Does the number " + x + " exist in the array? " + exists);


//        7) მოცემული გაქვთ მასივი თქვენი სასურველი ტიპის (int, String, float რომელიც
//        გაგიხარდებათ) ეს მასივი დაბეჭდეთ კონსოლზე და მომხმარებელს თხოვეთ
//        იმავე ტიპის ნებისმიერი ელემენტი და შემდეგ ეს ელემენტი ჩაამატეთ მასივის
//        პირველ ელემენტად. დამატებითი სავარჯიშოა რომ ჩაამატოთ ბოლო
//                ელემენტად


//                String[] array = {"niangi", "babu", "cigani"};
//                for (String item : array) {
//                    System.out.print(item + " ");
//                }
//                System.out.println();
//                System.out.print("Enter a new element: ");
//                String newwords = scanner.next();
//
//                String[] newArray = new String[array.length + 1];
//                newArray[0] = newwords;
//                for (int i = 1; i < newArray.length - 1; i++) {
//                    newArray[i] = array[i - 1];
//                }
//                newArray[newArray.length - 1] = newwords;
//
//                for (String item : newArray) {
//                    System.out.print(item + " ");
//                }
//                System.out.println();
//            }
//        }


//        8) მოცემული გაქვთ მთელი რიცხვების მასივი და ცალკე ცვლადში შენახული ერთი
//რიცხვი. იპოვე მასივიდან ორი რიცხვი, რომელთა ჯამიც ემთხვევა ცალკე
//ცვლადში შენახული რიცხვის ტოლია. გაითვალისწინეთ, რომ არ შეიძლება ერთი
//და იგივე ელემენტის ორჯერ გამოყენება. მაგალითად თუ გაქვთ [3, 4, 5] და ცალკე
//რიცხვი გაქვთ 8 თქვენ არ გაქვთ უფლება დააბრუნოთ 4, 4 არამედ სწორი პასუხია
//3, 5

//        int[] array = {3, 4, 5};
//        System.out.print("Enter number that is sum of this array n,ms : ");
//        int num = scanner.nextInt();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == num) {
//                    System.out.println("nums in array  that are equaial to num " + array[i] + ", " + array[j]);
//                }
//            }
//        }



//        9) მოცემული გაქვთ რიცხვების მასივი რომელიც თავდაპირველად უნდა
//        დაბეჭდოთ კონსოლზე. შემდეგ მომხმარებელმა უნდა აარჩიოს მასივში
//        არსებული რიცხვი და თქვენ უნდა მოაშოროთ ეს რიცხვი მასივიდან და ისე
//        დაბეჭდოთ ეს ერეი

        int[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        while (true) {
            System.out.print("Choose number to remove : " );
            int removeNum = scanner.nextInt();
            if (removeNum == 0) {
                break;
            }

            int count = 0;
            for (int num : array) {
                if (num == removeNum) {
                    count++;
                }
            }

            int[] newArray = new int[array.length - count];
            int index = 0;
            for (int num : array) {
                if (num != removeNum) {
                    newArray[index++] = num;
                }
            }
            array = newArray;

            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            if (array.length == 0) {
                System.out.println("All arrey is empty no elements");
                break;
            }
        }


//        10) მოცემული გაქვთ რიცხვების ერეი რომელიც უნდა დაბეჭდოთ და მომხმარებელი
//        რა რიცხვსაც შეიყვანს ირ რიცხვი უნდა გაანულოთ. ასე გააგრძელეთ, სანამ
//        მასივის ყველა წევრი ნულის ტოლი არ გახდება.



//        int[] array = {1, 2, 3,4,5};
//        for (int num : array) {
//
//            System.out.print(num + " ");
//        }
//
//        System.out.println();
//        while (true) {
//            System.out.print("Enter num to become zore  : ");
//            int zero = scanner.nextInt();
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] == zero) {
//                    array[i] = 0;
//                }
//            }
//            for (int num : array) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//            boolean allZero = true;
//            for (int num : array) {
//                if (num != 0) {
//                    allZero = false;
//                    break;
//                }
//            }
//            if (allZero) {
//                break;
//            }
//        }

    }
}