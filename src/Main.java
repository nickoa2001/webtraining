import folder.Calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JavaIntro.problema1();
        JavaIntro.problema2();
        JavaIntro.problema3();
        JavaIntro.problema4();

        int a = (int)(Math.random() * 100) + 1;
        int b = (int)(Math.random() * 100) + 1;
        int c = (int)(Math.random() * 100) + 1;
        Calculator.problema4MethodsMedia3Numere(a, b, c);
        Calculator.problema6MethodsRestulImpartirii();
        System.out.println("Temperatura in grade Celsius pentru "+ a +" Fahrenheit este: "+ Math.round(Calculator.problema7MethodsFahrenheitToCelsius(a)));
        int d = (int)(Math.random() * 10000) + 1;
        Calculator.problema8ConvertInchToM(d);
        Calculator.problema9ComputeSpeed(34569, 1, 10, 13);

        System.out.println("Add number of stars:");
        LogicalOperations op = new LogicalOperations();
        Scanner scan = new Scanner(System.in);
        //op.stars(scan.nextInt());
        System.out.println("***************************************************");
        System.out.println("Fibonacci:");
        op.fib();
        System.out.println("***************************************************");
        System.out.println("CozaLozaWoza:");
        op.CozaLozaWoza();
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
//        LogicalOperations op = new LogicalOperations();
//        Scanner scan = new Scanner(System.in);
//        op.stars(scan.nextInt());
        //int number = scan.nextInt();
        //op.checkNumberInterval(number);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Enter text: ");
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int c1 = scan.nextInt();
        System.out.print("Cel mai mare numar este: ");
        op.checkThreeNumbers(a1, b1, c1);

    }

    public static void printMyName(){
    System.out.println("Hello \n Nicu");

    }

}
