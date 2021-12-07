package folder;

public class Calculator {
    public static double sum(int a, double b){
        double result = a + b;
        return result;
    }
    public static double problema7MethodsFahrenheitToCelsius(int CelsiusTemp)
    {
        System.out.println(" " );
        System.out.println("***************************************************" );
        System.out.println("7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, \n"+
                           "care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. \n"+
                           "Formula de calcul este: C = 5/9 * (F -32)");
        double temp = (5f/9) * (CelsiusTemp - 32);
        return temp;
    }

    public static void problema4MethodsMedia3Numere(int a, int b, int c){
        System.out.println(" " );
        System.out.println("***************************************************" );
        System.out.println("Problema 4: Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.");
        double media =((float) a + b +c) / 3;
        System.out.println("Media numerelor: "+ a + ", "+ b + " si "+ c + " este: " + String.format("%.2f", media));
    }

    public static void problema6MethodsRestulImpartirii(){
        System.out.println(" " );
        System.out.println("***************************************************" );
        System.out.println("Problema 6: Scrieti o metoda java, care sa returneze restul impartirii a doua numere.");
        int a = (int)(Math.random() * 100) + 1;
        int b = (int)(Math.random() * 10) + 1;
        int rest = a % b;
        System.out.println("Restul impartirii lui : "+ a + " la "+ b + " este: " + String.valueOf(rest));
    }

    public static void problema8ConvertInchToM(float distanceInch){
        System.out.println(" " );
        System.out.println("***************************************************" );
        System.out.println("Problema 8: Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch\n"+
                           ", si sa returneze distanta in metrii");
        float distance = distanceInch * (float) 2.54 / 100;
        System.out.println(distanceInch + " in inchi reprezinta  : "+ distance + " metri sau cu 2 zecimale: " + String.format("%.2f", distance));
    }
    public static void problema9ComputeSpeed(int distanceMeters, int hours, int minutes, int seconds){
        System.out.println(" " );
        System.out.println("***************************************************" );
        System.out.println("Problema 9: Scrieti o metoda java, care primeste distanta (in metri) si \n " +
                           "timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in \n" +
                           "metri pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metri)");
        int totalSeconds = hours * 3600 + minutes * 60 + minutes;
        float viteza1 = (float) distanceMeters / totalSeconds;
        System.out.println("Viteza in m/s pentru " + distanceMeters + " metri parcursi in " + totalSeconds + "secunde este "+ String.format("%.2f", viteza1) + "m/s");
        float viteza2 = (((float) distanceMeters / 1000) / ((float) totalSeconds / 3600));
        System.out.println("Viteza in km/h pentru " + distanceMeters + " metri parcursi in " + totalSeconds + "secunde este "+ String.format("%.2f", viteza2) + "km/h");
        float viteza3 = (((float) distanceMeters / 1609) / ((float) totalSeconds / 3600));
        System.out.println("Viteza in miles/h pentru " + distanceMeters + " metri parcursi in " + totalSeconds + "secunde este "+ String.format("%.2f", viteza3) + "miles/h");

    }
}
