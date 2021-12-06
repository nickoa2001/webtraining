package folder;

public class Calculator {
    public static double sum(int a, double b){
        double result = a + b;
        return result;
    }
    public static double FahrenheitToCelsius(int CelsiusTemp)
    {
        double temp = (5f/9) * (CelsiusTemp - 32);
        return temp;
    }
}
