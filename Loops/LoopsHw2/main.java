import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. შექმენით პროგრამა, რომელსაც შემოსდის რიცხვი n და პირველი n ცალი
        // ნატურალური რიცხვის საშუალო არითმეტიკულს ითვლის

//        System.out.print("enter a number n to get the average  : ");
//        int n = scanner.nextInt();
//        double average = (n * (n + 1)) / 2.0 / n;
//        System.out.println("Avarage : " + average);

        // 2. წარმოადგინეთ მოცემული n რიცხვი ორის ხარისხების ჯამად, ისე რომ
        // შესაკრებთა რაოდენობა მინიმუმი იყოს

//        System.out.print("Enter a number n as a sum of powers of two : ");
//        n = scanner.nextInt();
//        System.out.print("Power of two : ");
//        for (int i = 31; i >= 0; i--) {
//            int power = 1 << i;
//            if (n >= power) {
//                System.out.print(power + " ");
//                n -= power;
//            }
//        }
//        System.out.println();

        // 3. შეადგინეთ პროგრამა, რომელიც con&nue ოპერატორის გამოყენებით
        // ერთიდან 15-ის ჩათვლით დაბეჭდავს ყველა კენტ რიცხვს 5-ის, 7-ის და 11-ის
        // გარდა. ერთ if-ზე მეტი არ გამოიყენოთ.


//        System.out.println("Odd numbers from 1 to 15 (becides 5, 7, and 11) : ");
//        for (int i = 1; i <= 15; i++) {
//            if (i % 2 != 0 && i != 5 && i != 7 && i != 11) {
//                System.out.println(i);
//            }
//        }

        // 4. დაწერეთ პროგრამა, რომელსაც კონსოლიდან შემოსდის ორბით სისტემაში
        // ჩაწერილი რიცხვი და უნდა გამოიტანოს ათობით ჩანაწერში.


//        System.out.print("enter a number : ");
//        String binary = scanner.next();
//        int decimal = Integer.parseInt(binary, 2);
//        System.out.println("dacimal value : " + decimal);

        // 5. დაწერეთ პროგრამა, რომელსაც კონსოლიდან შემოსდის ათობით სისტემაში
        // ჩაწერილი რიცხვი და უნდა გამოიტანოს ორობით ჩანაწერში.

//        System.out.print("enter a dacimal number : ");
//        int decimalInput = scanner.nextInt();
//        String output = Integer.toBinaryString(decimalInput);
//        System.out.println("binary value: " + output);

        // 6. დაწერეთ პატარა თამაში. თავდაპირველად ვქმნით ცვლადს, რომელშიც
        // ვინახავთ 1-დან 100მდე random(შემთხვევით) მნიშვნელობას.
        // მომხმარებელმა კონსოლიდან უნდა შეიყვანოს რამე რიცხვი, რათა გამოიცნოს
        // კომპოუტერის მიერ ,,ჩაფიქრებული” რიცხვი.


        System.out.println("guess the num btw 1 and 100 :");

        int numGuess = (int) (Math.random() * 100) + 1;

        int guess = 0;

        while (guess != numGuess) {
            guess = scanner.nextInt();
            if (guess < numGuess) {
                System.out.println("Your guess is low" );
            } else if (guess > numGuess) {
                System.out.println("Your guess is high ");
            } else {
                System.out.println("You guessed the number :3 "   ) ;
            }
        }

    }
}
