import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner klavye = new Scanner(System.in);
                //kullanıcının sayı girmesini isteyiniz.
                System.out.print("fibonacci serisinin eleman sayısı: ");
                int n = klavye.nextInt();
                klavye.close();

                System.out.println("Fibonacci Serisi:");
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacciRecursive(i) + " ");
                }
            }

            public static int fibonacciRecursive(int n) {
                if (n <= 1) {
                    return n;
                } else {
                    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
                }
            }
        }





