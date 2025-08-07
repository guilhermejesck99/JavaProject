import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Infome seu nome");
        var name = scanner.nextLine();
        System.out.println("Infome sua idade");
        var age = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.nextLine().equalsIgnoreCase("s");

        scanner.close();

        if (age >= 18) { //Expressão de "if" tem que ser passada entre parenteses 
            System.out.printf("Olá %s, você é maior de idade", name);
        } else if (age <= 18 && isEmancipated) { // Expressão "elseif" trata um segundo parametro booleano
            System.out.printf("%s apesar de ser menor de idade, você pode dirigir", name);
        } else { // Expressão "else" trata a opção restante 
            System.out.printf("Olá %s, você é menor de idade", name);
        }
    }
}