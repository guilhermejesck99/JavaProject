import java.util.Scanner;

public class a8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        while (!name.equals("exit")) {
            System.out.println("Informe um nome:");
            name = scanner.next();
            System.out.println(name);
        }
        scanner.close();

    }
}
