import java.util.Scanner;
import java.text.DecimalFormat;

public class a11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double valorOriginal = scanner.nextDouble();
        double porcentagemDesconto = scanner.nextDouble();
        if (porcentagemDesconto < 0 || porcentagemDesconto > 100) {
            System.out.println("Desconto invalido");
        } else {
            double valorFinal = valorOriginal - (valorOriginal * porcentagemDesconto / 100);
            System.out.println(df.format(valorFinal));
        }
        
        scanner.close();
    }
}