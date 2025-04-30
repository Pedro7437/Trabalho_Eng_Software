public class App {
        public static void main(String[] args) {
            int primeiroTermo = 0;  // Você pode alterar o valor inicial se quiser
            int razao = 7;
            int quantidadeTermos = 10;
    
            System.out.println("Progressão Aritmética (PA) de razão 7 com 10 termos:");
            for (int i = 0; i < quantidadeTermos; i++) {
                int termo = primeiroTermo + i * razao;
                System.out.print(termo + " ");
            }
        }

    
}
