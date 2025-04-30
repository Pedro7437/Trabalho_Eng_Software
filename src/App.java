import java.util.Scanner;

public class App {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Qual será o primeiro termo da PA:");
            int primeiroTermo = sc.nextInt();

            System.out.print("E qual será a razão:");
            int razao = sc.nextInt();
            
            System.out.print("Por fim, quantos elementos devem ser exibidos:");
            int quantidadeTermos = sc.nextInt();
    
            System.out.println("Progressão Aritmética (PA) de razão " + razao + " com" + quantidadeTermos + " termos, iniciando de " + primeiroTermo + ":");

            for (int i = 0; i < quantidadeTermos; i++) {

                int termo = primeiroTermo + i * razao;
                System.out.print(termo + " ");

            }

            sc.close();
        }
}
