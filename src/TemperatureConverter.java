import java.util.Scanner;

public class TemperatureConverter {
     public static float F,C;
    public static void main(String[] args) {


        System.out.println("-----------------------------------Welcome------------------------------------------");
        System.out.println("--------Celsius-Fahrenheit/Fahrenheit-Celsius converter----------------------------- ");
        int ot;
        do{
          System.out.println("choose the conversion mode:");
          System.out.println("1- Celsius-Fahrenheit");
          System.out.println("2- Fahrenheit-Celsius");

           //allows the user to enter the conversion mode
           Scanner sc = new Scanner(System.in);
           int cm;

               cm = sc.nextInt();
           while((cm !=1) &&(cm !=2)){
               System.out.println("Please enter 1 or 2");
                cm = sc.nextInt();
            }

           Scanner sc3 = new Scanner(System.in);

            //allows the user to enter the temperature to convert
            System.out.println("Please enter the temperature to convert:");

            Scanner sc2 = new Scanner(System.in);
            int tc = sc2.nextInt();
            //check the conversion mode entered by the user
            if (cm == 1) {
                F = (tc * (float) 9 / 5) + 32;
                System.out.println(tc + "°C --------> " + F + " °F");
            } else if (cm == 2) {
                C = (tc - 32) * (float) 5 / 9;
                System.out.println(tc + "°F --------> " + C + " °C");
            } else {
                System.out.println("you must enter 1 or 2 ");
            }


            System.out.println("do you want to convert other temperatures?");
            System.out.println("1- Yes");
            System.out.println("2- No");
            ot = sc3.nextInt();
            while((ot !=1) &&(ot !=2)){
                System.out.println("Please enter 1 or 2");
                ot = sc.nextInt();
            }

        } while (ot == 1);
        System.out.println("-----------------------------Goodbye, see you soon-------------------------");


    }
}
