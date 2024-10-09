import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        System.out.print("Digite um número inteiro para verificar se é fibonaci -> ");

        var x = readLine.nextInt();

        if (eFibonacci(x)) {
            System.out.printf("O número %d pertence a sequência de Fibonacci!",x);
        }
        else if (!eFibonacci(x)) {
            System.out.printf("O número %d não pertence a sequência de Fibonacci",x);
        }

        readLine.close();

    }

    public static boolean eFibonacci(long x){
        return quadradoPerfeito(5*x*x+4) || quadradoPerfeito(5*x*x-4);
    }

    public static boolean quadradoPerfeito(long x)
    {
        long n = (long)Math.sqrt(x);
        return (n * n == x);
    }
}
