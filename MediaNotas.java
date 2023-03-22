// importação da classe Scanner, que permite a leitura de dados do teclado
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        // criação de um objeto Scanner para ler dados do teclado
        Scanner input = new Scanner(System.in);

        //solicita ao usuário a primeira nota
        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        // solicita ao usuário a segunda nota
        System.out.print("Digite a segunda nota: ");
        // leitura da segunda nota digitada pelo usuário e armazenamento na variável nota2
        double nota2 = input.nextDouble();

        // cálculo da média das notas informadas pelo usuário e armazenamento na variável media
        double media = (nota1 + nota2) / 2.0;
        // exibição do resultado da média das notas, com duas casas decimais
        System.out.printf("A média das notas é %.2f", media);
    }

}