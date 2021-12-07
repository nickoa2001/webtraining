import com.sun.jdi.FloatValue;
import java.lang.Integer;

public class JavaIntro {
    public static void problema1(){
        System.out.println(" " );
        System.out.println("***************************************************" );
        System.out.println("Problema 1: Printati \"Hello\" in consola, iar pe rand nou, printati numele vostru." );
        System.out.println("Hello!");
        System.out.print("Nicu");
    }

    public static void problema2(){
        System.out.println(" " );
        System.out.println("***************************************************" );
        System.out.println("Problema 2: Suma a doua numere random intre 1 si 100!" );
        int a = (int)(Math.random() * 100) + 1;
        int b = (int)(Math.random() * 100) + 1;
        int sum = a + b;
        System.out.println("Suma numerelor "+ a + " si "+ b + " este:" + sum);
    }
    public static void problema3(){
        System.out.println(" " );
        System.out.println("***************************************************" );
        System.out.println("Problema 3: Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, \n " +
                            "sa afiseze si valorile dupa virgula." );
        int a = (int)(Math.random() * 100) + 1;
        int b = (int)(Math.random() * 10) + 1;
        double div =(float) a / b;
        System.out.println("Rezultatul impartirii celor doua numere "+ a + " si "+ b + " este:" + String.format("%.3f", div));
    }
    public static void problema4(){
        System.out.println(" " );
        System.out.println("***************************************************" );
        System.out.println("Problema 4: Printati rezultatul urmatoarelor operatiuni: \n "+
                            "a. -5 + 8 * 6 \n" +
                            "b. (55+9) % 9 \n" +
                            "c. 20 + -3*5 / 8 \n "+
                            "d. 5 + 15 / 3 * 2 - 8 % 3 \n");
        int a = -5 +8 * 6;
        System.out.println("Primul numar calculat este: "+ a);
        int b = (55+9) % 9;
        System.out.println("Al doilea numar calculat este: "+ b);
        float c = 20 + -3* (float) 5 / 8;
        System.out.println("Al treilea numar calculat este: "+ String.format("%.3f", c));
        float d = 5 + 15 / (float) 3 * 2 - (float) 8 % 3;
        System.out.println("Al patrulea numar calculat este: "+ String.format("%.3f", d));

    }

}

