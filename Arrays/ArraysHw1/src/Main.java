import java.util.Scanner;
import  java.util.Random;
public class Main {
    public static void main(String[] args) {

        //1) შეადგინეთ პროგრამა, რომელიც int b[12] მასივის ელემენტებს მიანიჭებს მთელი
        //რიცხვის ნებისმიერ მნიშვნელობებს და დაბეჭდავს მათ

//        Scanner scanner = new Scanner(System.in);
//        int[] b = new int[12];
//
//        for (int i = 0; i < b.length;i++){
//            System.out.print("Enter element " + i +" : ");
//            b[i] += scanner.nextInt();
//        }
//
//        System.out.print("new elements of array b \n");
//
//        for (int j = 0; j < b.length;j++) {
//                System.out.print(b[j] + " ,");
//        }


//        2) იპოვეთ წინა ამოცანაში შედგენილი მასივის ელემენტების ჯამი ნამრავლი და
//        საშუალო არითმეტიკული

//        Scanner scanner = new Scanner(System.in);
//        int[] b = new int[12];
//
//        int sum = 0;
//        int mult= 1;
//
//
//        for (int i = 0; i < b.length;i++){
//            System.out.print("Enter element " + i +" : ");
//            b[i] += scanner.nextInt();
//            sum += b[i];
//            mult *= b[i];;
//        }
//        float avrg = (float) sum/b.length;
//        System.out.print("new elements of array b \n");
//
//        for (int j = 0; j < b.length;j++) {
//                System.out.print(b[j] + " , ");
//        }
//
//        System.out.print("\n"+ "Total sum of array b " + sum);
//        System.out.print("\n"+ "Total multiplication of array b " + mult);
//        System.out.print("\n"+ "Average of array b " + avrg);


//        3) შეადგინეთ მასივი int b[20] და შეავსეთ შემთხვევითი რიცხვებით [0;20]
//        შუალედიდან . დაბეჭდეთ მასივის ყველა ელემენტი. იპოვეთ ელემენტებს შორის
//        მაქსიმალური და მინიმალური, დაბეჭდეთ ორივე რიცხვი.

//        int[] b = new int [20];
//        int max =0;
//        int low=20;
//        Random random = new Random();
//
//        for (int i = 0; i < b.length;i++){
//            b[i] += random.nextInt(21);
//        }
//
//        System.out.print("Array numbers : \n");
//        for (int i = 0; i < b.length;i++){
//            System.out.print(b[i] + " , ");
//            if (b[i] > max) {
//                max = b[i];
//            }
//            if (b[i]< low){
//                low = b[i];
//            }
//        }
//
//        System.out.print("\n"+ "Max num : " + max );
//        System.out.print("\n" + "Min num : " + low );


//        4) შეადგინეთ 15 ელემენტიანი მასივი და შეავსეთ მთელი რიცხვებით ისე რომ
//        თითოეული ელემენტის მნიშვნელობა იყოს მის იდექსზე ერთით მეტი.
//        მაგალითად 0 ინდექსზე მდგომი ელემენტის მნიშვნელობა უნდა იყოს 1, 1
//        ინდექსზე მგომის 2.


//        int[] array = new int[15];
//
//        for (int i = 0 ; i < array.length ; i ++ ){
//            array[i] = i + 1;
//            System.out.print("array index " + i + " equals to : " +array[i] + "\n");
//
//        }


//        5) იპოვეთ წინა ამოცანაში შედგენილი მასივის ელემენტების ჯამი, ნამრავლი და
//        საშუალო.

//            int[] array = new int[15];
//
//            int sum = 0;
//            long mult = 1;
//
//            for (int i = 0 ; i < array.length ; i ++ ){
//            array[i] = i + 1;
//            System.out.print("array index " + i + " equals to : " +array[i] + "\n");
//            sum += array[i];
//            mult *= array[i];
//
//        }
//
//            float avrg = (float) sum/array.length;
//
//
//            System.out.print("Sum of array ; " + sum + "\n");
//            System.out.print("mult of array ; " + mult + "\n");
//            System.out.print("average of array ; " + avrg + "\n");


//        6) დაადგინეთ მასივში გვხვდება თუ არა რაიმე მოცემული x რიცხვი

//        int[] array = {10, 5, 4, 2, 3, 4, 1, 7};
//        System.out.print("Enter the number you are searching  : ");
//
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        boolean found = false;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == num) {
//                System.out.println("Num that you want is in the array");
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Num not found");
//        }


//        7) მოცემული გაქვთ მასივი თქვენი სასურველი ტიპის (int, String, float რომელიც
//        გაგიხარდებათ) ეს მასივი დაბეჭდეთ კონსოლზე და მომხმარებელს თხოვეთ
//        იმავე ტიპის ნებისმიერი ელემენტი და შემდეგ ეს ელემენტი ჩაამატეთ მასივის
//        პირველ ელემენტად. დამატებითი სავარჯიშოა რომ ჩაამატოთ ბოლო
//        ელემენტად


//        int[] nums = new int[5];
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("If you want your num to be 1 write : 1  , if you want it last write 0 : \n");
//        byte input = scanner.nextByte();
//        System.out.print("number you want : ");
//        int numin = scanner.nextInt();
//
//        if (input == 1){
//            for (int i = 0 ; i < nums.length ; i ++) {
//                if (i == 0) {
//                    nums[i] = numin;
//                    break;
//                }
//            }
//        }
//        else if (input == 0) {
//            nums[nums.length -1 ] = numin;
//        }
//        else {
//            System.out.print("Please enter normal input : ");
//            System.exit(0);
//        }
//
//        System.out.print("Array : ");
//        for (int i = 0 ; i < nums.length; i++){
//            System.out.print(nums[i] + " , ");
//        }


//        8) მოცემული გაქვთ მთელი რიცხვების მასივი და ცალკე ცვლადში შენახული ერთი
//        რიცხვი. იპოვე მასივიდან ორი რიცხვი, რომელთა ჯამიც ემთხვევა ცალკე
//        ცვლადში შენახული რიცხვის ტოლია. გაითვალისწინეთ, რომ არ შეიძლება ერთი
//        და იგივე ელემენტის ორჯერ გამოყენება. მაგალითად თუ გაქვთ [3, 4, 5] და ცალკე
//        რიცხვი გაქვთ 8 თქვენ არ გაქვთ უფლება დააბრუნოთ 4, 4 არამედ სწორი პასუხია
//        3, 5.


//        int[] array = {3 , 4 , 5 , 7 ,  9};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int num = scanner.nextInt();
//        boolean found = false;
//
//        for (int i = 0 ; i < array.length ; i ++) {
//            for(int j =i +1;j < array.length; j ++){
//                if(array[i] + array[j] ==num ){
//                    System.out.print("Numbers that sum are equal to " + num + " are : " + array[i]+ " and " + array[j] );
//                    found = true;
//                }
//            }
//        }
//        if (!found){
//            System.out.print("Pair not found in array ");
//        }


//        9) მოცემული გაქვთ რიცხვების მასივი რომელიც თავდაპირველად უნდა
//        დაბეჭდოთ კონსოლზე. შემდეგ მომხმარებელმა უნდა აარჩიოს მასივში
//        არსებული რიცხვი და თქვენ უნდა მოაშოროთ ეს რიცხვი მასივიდან და ისე
//        დაბეჭდოთ ეს ერეი.


//        int[] originalArray = {4,3,6,8,7,1};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter index to remove : ");
//        int indexToRemove = scanner.nextInt();
//
//        int[] newArray = new int[originalArray.length - 1];
//
//        for (int i = 0, j = 0; i < originalArray.length; i++) {
//            if (i != indexToRemove) {
//                newArray[j++] = originalArray[i];
//            }
//        }
//
//        System.out.println("New array after removing element at index " + indexToRemove + " : ");
//        for (int num : newArray) {
//            System.out.print(num + " ");
//        }


//        10) მოცემული გაქვთ რიცხვების ერეი რომელიც უნდა დაბეჭდოთ და მომხმარებელი
//        რა რიცხვსაც შეიყვანს ირ რიცხვი უნდა გაანულოთ. ასე გააგრძელეთ, სანამ
//        მასივის ყველა წევრი ნულის ტოლი არ გახდება.


        int[] array = {1, 2, 3, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Here is the array : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        while (true) {
            System.out.print("Enter a number from the array to nullify number : " );
            int enter = scanner.nextInt();
            boolean found = false;

            for (int i = 0; i < array.length; i++) {
                if (enter == array[i]) {
                    array[i] = 0;
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Number nullified\n ") ;
            } else {
                System.out.println("Number not found\n " );
            }

            System.out.println("Updated array : \n");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            boolean allNullified = true;
            for (int num : array) {
                if (num != 0) {
                    allNullified = false;
                    break;
                }
            }

            if (allNullified) {
                System.out.println("All numbers have been nulified  ");
                break;
            }
        }

    }
}







