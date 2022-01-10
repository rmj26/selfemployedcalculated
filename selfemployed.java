import java.util.Scanner;
public class selfemployed {

    public static  void main(String[] args)
    {
        wagesystem1();

    }

    public static  void wagesystem1()
    {
        Scanner input = new Scanner(System.in); // a new Scanner class for the wagesystem()
        double hoursdone; // amount of hours done
        double totalearning;

        System.out.println("Enter the number of hours done "); // output on the screen

        hoursdone= input.nextInt(); // user input

        System.out.println("Enter your earning for the week");

        totalearning=input.nextInt();

        double netearning;

        netearning=totalearning-((totalearning/100)*25);

        System.out.println("Your net earning after commision is " + netearning); // after paying 25% comission

        double hourlyrate;

        hourlyrate=netearning/hoursdone; // to calculate hourly rate

        System.out.println("Your hourly wage based on your income is " + hourlyrate);



    }
}
