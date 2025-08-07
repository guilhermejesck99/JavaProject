import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Quantos anos você tem? ");
        var age = scanner.nextInt(); 

        System.out.print("Você é emancipado? (true/false): ");
        var isEmancipated = scanner.nextBoolean();

        var canVote = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Você pode votar? %s%n", canVote ? "Sim" : "Não");
        scanner.close();
    }
}
