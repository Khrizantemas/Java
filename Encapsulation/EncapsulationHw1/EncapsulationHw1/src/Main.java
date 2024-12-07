public class Main{
    public static void main(String[] args){

//        1) შექმენით ახალი კლასი ამინდის პროგნოზი, რომელსაც ექნება შემდეგი ატრიბუტები.
//        ქალაქის სახელი, ქარის სიჩქარე, ტერიტორიის რამდენ პროცენტზე იქნება წვიმა, იქნება თუ
//        არ აწვიმა, იქნება თუ არა მოღრუბლული ამინდი, იქნება თუ არა მზიანი ამიდნი. შექმენით
//        საჭიროების მიხედვით კონსტრუქტორი ან კონსტრუქტორები. უზრუნველყავით, რომ
//        ინკაპსულაციის პრინციპები იყოს დაცული. შექმენით get და set მეთოდები. შექმენით
//        მეთოდი, რომელიც მთლიან ამინდის პროგნოზს დაბეჭდავს კონსოლზე. ასევე შექმენით
//        მეთოდი, ბულეანის ტიპის, რომელიც აბრუნებს მნიშვნელობას ურჩევთ თუ არა
//        მომხმარებელს სასეირნოდ წასვლას. ამის ლოგიკა თქვენით შეიმუშავეთ ინტუიციური და
//        ლოგიკურია


//        Wether wether = new Wether("Marneuli",10,22,false,false,true);
//
//        wether.shouldGo();
//        System.out.println();
//
//        wether.setWindspeed(50);
//        wether.shouldGo();
//
//        System.out.println();
//        System.out.println();
//
//
//        wether.setCity("tbilisi");
//        wether.setIsrain(true);
//        wether.wetherinfo();





//        2) შექმენით სტუდენტის კლასი, რომელსაც ექნება შემდეგი ატრიბუტები. სახელი, გვარი,
//                ასაკი, კურსი (int), საშუალო ქულა. უზრუნველყავით, რომ დაცული იყოს ინკაპსულაციის
//        პრინციპები. შექმენით კონსტრუქტორი. დაამატეთ getter და setter მეთოდები. Main
//        კლასში main მეთოდში შექმენით სტუდენტების მასივი. დაამატეთ 5 სტუდენტი

//        3) წინა დავალებას რომ შეასრულებთ შემდეგ მეინ კლასში დაამატეთ ახალი ფუნქცია,
//        რომელიც პარამეტრად მიიღებს სტუდენტების მასივს, და დააბრუნებს იმ სტუდენტის
//        სახელს და გვარს, რომელსაც ყველაზე მაღალი ქულა აქვს.


        Student[] students = new Student[5];

        students[0] = new Student("umar","sada",23,2,53F);
        students[1] = new Student("niangi","crock",999,1,92.444F);
        students[2] = new Student("zvigeni","bneli",5,6,2.3F);
        students[3] = new Student("vaja","limba",10,5,78.3F);
        students[4] = new Student("babka","bruh",99,4,4.3F);
        

        String mvp  = "";
        float max = 0;
        for (Student student : students){
            student.display();
            if (student.getAvrgresult()>max){
                max = student.getAvrgresult();
                mvp = student.getName();
            }
        }

        System.out.println("Mvps name is : " + mvp );
         System.out.println("Score : " + max);


    }
}