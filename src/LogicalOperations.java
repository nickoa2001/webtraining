public class LogicalOperations {
    public void checkNumberInterval(int number) {
        if (number >= 2 && number <= 8)
            System.out.println(number);
    }

    public int checkThreeNumbers(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        System.out.print("Cel mai mare numar este: " + max);
        return max;
    }

    public int checkThreeNumbersWithIf(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c)
            max = a;
        else if (a > b && a < c)
            max = c;
        else if (b > a && b > c)
            max = b;
        else if (b > a && b < c)
            max = c;

        //int max = Math.max(Math.max(a,b),c);
        System.out.print("Cel mai mare numar este: " + max);
        return max;
    }

    public void stars(int nr) {
        for (int i = nr; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void fib() {
        int n1 = 1;
        System.out.println(n1);
        int n2 = 2;
        System.out.println(n2);
        int j = 2;
        int fib = 0;
        while (j <= 20) {
            fib = n1 + n2;
            System.out.println(fib);
            n1 = n2;
            n2 = fib;
            j++;
        }
    }

    public void CozaLozaWoza() {
        int i = 1;
        while (i < 110) {
            if ((i % 3 == 0 && i % 5 == 0 && i % 7 == 0))
                System.out.print("WozaLoza ");
            else if ((i % 3 == 0 && i % 5 == 0))
                System.out.print("CozaLoza ");
            else if ((i % 3 == 0 && i % 7 == 0))
                System.out.print("CozaWoza ");
            else if ((i % 5 == 0 && i % 7 == 0))
                System.out.print("WozaLoza ");
            else if (i % 3 == 0)
                System.out.print("Coza ");
            else if (i % 5 == 0)
                System.out.print("Loza ");
            else if (i % 7 == 0)
                System.out.print("Woza ");
            else
                System.out.print(i+ " ");

            if (i % 11 == 0)
                System.out.println(" ");
            i++;
        }


    }
}