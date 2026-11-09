
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        double num1, num2, resultado;

        // Repete o menu ate o usuario sair
        do {
            System.out.println("\n===== CALCULADORA JAVA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Potencia");
            System.out.println("6 - Raiz quadrada");
            System.out.println("7 - Porcentagem");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            // Verifica se foi digitado um numero inteiro
            if (!scanner.hasNextInt()) {
                System.out.println("Opcao invalida!");
                scanner.nextLine();
                continue;
            }

            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando calculadora...");
                break;
            }

            if (opcao < 1 || opcao > 7) {
                System.out.println("Opcao invalida!");
                continue;
            }

            System.out.print("Digite o primeiro numero: ");
            num1 = scanner.nextDouble();

            // Raiz quadrada precisa de apenas um numero
            if (opcao != 6) {
                System.out.print("Digite o segundo numero: ");
                num2 = scanner.nextDouble();
            } else {
                num2 = 0;
            }

            switch (opcao) {

                case 1:
                    resultado = num1 + num2;
                    break;

                case 2:
                    resultado = num1 - num2;
                    break;

                case 3:
                    resultado = num1 * num2;
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Erro! Divisao por zero.");
                        continue;
                    }
                    resultado = num1 / num2;
                    break;

                case 5:
                    resultado = Math.pow(num1, num2);
                    break;

                case 6:
                    if (num1 < 0) {
                        System.out.println("Erro! Raiz negativa.");
                        continue;
                    }
                    resultado = Math.sqrt(num1);
                    break;

                case 7:
                    resultado = num1 * num2 / 100;
                    break;

                default:
                    continue;
            }

            System.out.println("Resultado: " + resultado);

        } while (true);

        scanner.close();
    }
}

