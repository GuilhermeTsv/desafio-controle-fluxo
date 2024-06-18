import java.util.Scanner;

// Definição da exceção personalizada ParametrosInvalidosException


public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem de exceção capturada
            System.out.println("O segundo parâmetro precisa ser maior que o primeiro");
        }

        scan.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção, se necessário
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = parametroUm; i < parametroDois; i++) {
            System.out.println(contagem);
            contagem++;
        }
    }
}
