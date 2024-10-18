public class Main {
    public static void main(String[] args) {

        //1. დაწერეთ პროგრამა, რომელიც გადაიყვანს ცელსიუსებს ფარენჰეიტებში.

//        double C = 30;
//        double fahrenheit = (C * 9/5) + 32;
//
//        System.out.println(C + " celsius in fahrenheits would be : f " + fahrenheit);


        //2. დაწერეთ პროგრამა, რომელიც გადაიყვანს ფარენჰეიტებს ცელსიუსებში.

//        double f = 86;
//        double celsius = (f - 32) * 5/9;
//
//        System.out.println(f + " - fahrenheits in celsius would be : c " + celsius);


        //3. დაწერეთ პროგრამა, რომელიც ამოწმებს არის თუ არა მითითებული
        //წელიწადი ნაკიანი (თევერვალში არის თუ არა 29 დღე) თუკი წელიწადი
        //თან ნაკიანია და თან 100-ზე იყოფა მაშინ დაბეჭდეთ, რომ ნაკიანი არ
        //არის, მაგრამ თუ 400-ზე იყოფა ისევ ნაკიანად ჩათვალეთ.


//        int year = 2025;
//
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + " is a leap year");
//        } else {
//            System.out.println(year + " is not a leap year");
//        }


        //4. დაწერეთ პროგრამა, რომელსაც შემოსდის ორი ნებისმიერი რიცხვი და
        //თქვენმა პროგრამამ უნდა დაადგინოს საკოორდინატო სიბრტყის რომელ
        //მეოთხედშია მოთავსებული ეს წერტილი.


//        double x = -3.0;
//        double y = 2.0;
//
//               if (x > 0 && y > 0) {
//                   System.out.println("The point is in Quadrant I");
//               }else if (x < 0 && y > 0) {
//                   System.out.println("The point is in Quadrant II");
//               }else if (x < 0 && y < 0) {
//                   System.out.println("The point is in Quadrant III");
//               }else if (x > 0 && y < 0) {
//                   System.out.println("The point is in Quadrant IV");
//               }else if (x == 0 && y != 0) {
//                   System.out.println("The point is on the Y-axis");
//               }else if (y == 0 && x != 0) {
//                   System.out.println("The point is on the X-axis");
//               }else {
//                   System.out.println("The point is at the origin");
//               }


        //5. დაწერეთ პროგრამა, რომელსაც სტრინგის სახით შემოსდის ოთხი
        //სიმბოლოდან რომელიმე + - * / და დამატებით 2 რიცხვი. თქვენმა
        //პროგრამამ უნდა გაიაზროს რა ოპერაციას გულისხმობს მომხმარებელი
        //და შეასრულოს მოქმედება მოცემულ ორ რიცხვზე და დაბეჭდოს პასუხი.


        String operator = "/";
        double num1 = 10;
        double num2 = 5;
        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed");
                    return;
                }
                break;
            default:
                System.out.println("Error");
                return;
        }
        System.out.println(result);


    }
}