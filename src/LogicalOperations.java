public class LogicalOperations {
    public void checkNumberInterval(int number){
        if (number >= 2 && number <=8)
            System.out.println(number);
    }

    public int checkThreeNumbers(int a, int b, int c)
    {
        int max = Math.max(Math.max(a,b),c);
        System.out.print("Cel mai mare numar este: "+ max);
        return max;
    }

    public int checkThreeNumbersWithIf(int a, int b, int c)
    {
        int max;
        if (a > b && a > c)
            max = a;
        else if (a>b && a < c)
            max = c;
        else if (b>a && b > c)
            max = b;
        else if (b>a && b < c) {
            System.out.print("Cel mai mare numar este: " + c);
            max = c;
        }


        int max = Math.max(Math.max(a,b),c);
        System.out.print("Cel mai mare numar este: "+ max);
        return max;
    }
}
