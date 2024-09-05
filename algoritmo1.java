import java.util.Scanner;

public class algoritmo1 {
    public static boolean isFibonacci(int number) {
        int a = 0, b = 1, next = 0;

        if (number == 0 || number == 1) {
            return true;
        }

        while (next < number) {
            next = a + b;
            a = b;
            b = next;
        }

        return next == number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se está na sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}