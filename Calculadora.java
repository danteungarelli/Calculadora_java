import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma (+)");
        System.out.println("2. Subtração (-)");
        System.out.println("3. Multiplicação (x)");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                Soma.executar();
                break;
            case 2:
                Subtracao.executar();
                break;
            case 3:
                Multiplicacao.executar();
                break;
            default:
                System.out.println("Opção inválida");
        }
        
        scanner.close();
    }
}
