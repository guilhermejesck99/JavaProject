import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
    // Barras duplas para comentário simples em Java
     
    /*   Comentário de múltiplas linhas em Java
       Este é um exemplo de código Java que demonstra o uso de comentários.
       Comentários são úteis para explicar o código e torná-lo mais legível.         
    */
    Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
    System.out.println("Olá, informe o seu nome"); // Imprime uma mensagem no console
    String name = scanner.next(); // Lê o nome do usuário / ou podemos mudar a variavel para "var" ou "int" se preferir
    System.out.println("Qual sua idade?"); // Imprime uma mensagem no console
    var age = scanner.nextInt(); // Lê a idade do usuário / ou podemos mudar a variavel para "var" ou "int" se preferir
    System.out.printf("Olá %s, você tem %d anos.\n", name, age); // Formata e imprime uma mensagem com o nome e a idade do usuário

    scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos

    }
}