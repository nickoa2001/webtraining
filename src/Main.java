import folder.Calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JavaIntro.problema1();
        JavaIntro.problema2();
        JavaIntro.problema3();
        JavaIntro.problema4();
        /*
        System.out.println("Hello");
        int x = 2;
        x+=x+=x++ + ++x;
        System.out.println(x+=x+=x++ + ++x);
        System.out.println("Rezultatul este: " + x + 2);
        System.out.println(sum(2,3.32));
        Calculator calc = new Calculator();
        System.out.println(Math.round(calc.FahrenheitToCelsius(92)));
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Introdu numar nou:");
        int readInt = scan1.nextInt();
        System.out.println("valoare:" + calc.FahrenheitToCelsius(readInt));*/
        LogicalOperations op = new LogicalOperations();
        Scanner scan = new Scanner(System.in);
        //int number = scan.nextInt();
        //op.checkNumberInterval(number);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Enter text: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.print("Cel mai mare numar este: ");
        op.checkThreeNumbers(a, b, c);

    }

}
