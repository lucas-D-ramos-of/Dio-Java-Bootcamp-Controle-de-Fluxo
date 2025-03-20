import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int quantidadeSubtracao = entrada.nextInt();

        System.out.println("Digite um segundo valor inteiro: ");
        int quantidadeSoma = entrada.nextInt();

        try {
            iterarQuantidade(quantidadeSubtracao, quantidadeSoma);
        } catch (ParametrosInvalidosException e){
            e.setStackTrace(null);
        }
        

    }

    public static void iterarQuantidade(int quantidadeSubtracao, int quantidadeSoma) throws ParametrosInvalidosException{

        if (quantidadeSubtracao > quantidadeSoma){
            throw new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo.\n\n");
        } else {
            for (int i = 0; i < (quantidadeSoma - quantidadeSubtracao); i++){
                System.out.printf("Iteração: %d \n", (i+1));
            }
        }
    }
}
