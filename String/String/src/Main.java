import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enterstring : ");
        String input = sc.nextLine();

        // Task 1
//        int dCount = countDigits(input);
//        System.out.println("Total digits found : " + dCount);

        // Task 2
//        int sCount = countSentences(input);
//        System.out.println("Total sentances found : " + sCount);

        // Task 3
//        boolean isPal = isPalindrome(input);
//        System.out.println("Is the input a palindrome ? " + isPal);

        // Task 4
//        System.out.println("Please enter another string (s2) : ");
//        String s2 = sc.nextLine();
//        boolean isSub = isSubstring(input, s2);
//        System.out.println("Is s2 a substring of s1 ? " + isSub);

        // Task 5
//        checkEnding(input);

        // Task 6
//        System.out.println("Please enter the modified word from Nita : ");
//        String modWord = sc.nextLine();
//        String origWord = recoverOriginal(modWord);
//        System.out.println("Recovered original word : " + origWord);

        // Task 7
        System.out.println("Please enter a word to check if its huge : ");
        String hugeWord = sc.nextLine();
        generateAbbreviation(hugeWord);

        sc.close();
    }

    //1. დაადგინეთ მოცემულ სტრიქონში ციფრების რაოდენობა

//    public static int countDigits(String str) {
//        int count = 0;
//        for (char c : str.toCharArray()) {
//            if (Character.isDigit(c)) {
//                count++;
//            }
//        }
//        return count;
//    }

    //2. დაადგინეთ რამდენი წინადადებისგან შედგება მოცემული სტრიქონი (წინადადებად
    //ჩათვალეთ [. ? ; და !] დამთავრებული სიტყვათა მიმდევრობა).

//    public static int countSentences(String str) {
//        String[] sentences = str.split("[.!?;]");
//        return sentences.length;
//    }

    //3. დაადგინეთ მოცემული სტრიქონი არის თუ არა პალინდრომი (სტრიქონი პალინდრომია,
    //თუ ის ერთნაირად იკითხება მარცხნიდან და მარჯვნიდან).

//    public static boolean isPalindrome(String str) {
//        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        String rev = new StringBuilder(clean).reverse().toString();
//        return clean.equals(rev);
//    }

    //4. მოცემულია ორი String s1 , s2; დაადგინეთ s2 არის თუ არა s1-ს ქვესტრიქონი(შეიცავს თუ
    //არა s1 მთლიანად s2-ს).

//    public static boolean isSubstring(String s1, String s2) {
//        return s1.contains(s2);
//    }

    //5. დაწერეთ პროგრამა, რომელიც დაადგენს კლავიატურიდან შეტანილი სტრიქონი ხმოვნით
    //მთავრდება თუ თანხმოვნით და კონსოლის ფანჯარაზე დაწერს შესაბამის შეტყობინებას.

//    public static void checkEnding(String str) {
//        char lastChar = str.charAt(str.length() - 1);
//        if ("aeiouAEIOU".indexOf(lastChar) != -1) {
//            System.out.println("The string ends with a vowel");
//        } else {
//            System.out.println("The string ends with a consonant");
//        }
//    }

    //6. ნიტას კომპიუტერთან ჯდომა აუკრძალეს და დიდი ხნის უსაქმურობის შემდეგ ახალი
    //გასართობი იპოვა. სახლში აღმოაჩინა ფურცელი, რომელზეც მისთვის უცნობი სიტყვა ეწერა
    //და თან არც ერთი სიმბოლო გვერდიგვერდ არ მეორდებოდა. ნიტა ირჩევს რომელიმე ასოს
    //სიტყვიდან და ამატებს იმავე ასოს სიტყვაში ზუსტად მის გვერდით, უკვე გაორმაგებულ
    //სიმბოლოს კი აღარ ეხება. თქვენ შემოგდით ნიტას ჩარევის შედეგად მიღებული სიტყვა და
    //თქვენი ამოცანაა ეკრანზე დაბეჭდოთ თავდაპირველი სიტყვა.


//    public static String recoverOriginal(String mod) {
//        StringBuilder orig = new StringBuilder();
//        for (int i = 0; i < mod.length(); i++) {
//            orig.append(mod.charAt(i));
//            if (i < mod.length() - 1 && mod.charAt(i) == mod.charAt(i + 1)) {
//                i++;
//            }
//        }
//        return orig.toString();
//    }

    //7. ზოგიერთი სიტყვა იმდენად გრძელია, რომ მათი ხშირი წერა ძალიან მომაბეზრებელია.
    //მაგალითად „ლოკალიზაცია“ ან „ინტერნაციონალიზაცია“. სიტყვას დავარქვათ
    //უზარმაზარი, თუ მასში 10 სიმბოლოზე მეტია. ყველა უზარმაზარი სიტყვა უნდა
    //შევცვალოთ მისი აბრევიატურით. სიტყვის აბრევიატურა იგება შემდეგნაირად: ვიღებთ
    //სიტყვის პირველ და ბოლო ასოს, მათ შორის კი ვწერთ რამდენი სიმბოლო იყო მათ შორის.
    //მაგალითად სიტყვა „ლოკალიზაცია“-ს აბრევიატურა იქნება ლ9ა, ხოლო
    //„ინტერნაციონალიზაცია“- სი ი17ა. კლავიატურიდან შეიტანეთ სიტყვა დაადგინეთ არის თუ
    //არა უზარმაზარი და თუ არის დააგენერირეთ მისი აბრევიატურა. წინააღმდეგ შემთხვევაში
    //დაბეჭდეთ შესაბამისი გზავნილი

    public static void generateAbbreviation(String word) {
        if (word.length() > 10) {
            String abbr = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
            System.out.println("Abbreviation : " + abbr);
        } else {
            System.out.println("The word is not huge");
        }
    }
}
