import java.util.Scanner;

public class a9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.printf("Digite um numero");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++){

            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }


        /*int resultado = (numero * 1)
        int resultado2 = (numero * 2);
        int resultado3 = (numero * 3);
        int resultado4 = (numero * 4);
        int resultado5 = (numero * 5);
        int resultado6 = (numero * 6);
        int resultado7 = (numero * 7);
        int resultado8 = (numero * 8);
        int resultado9 = (numero * 9);
        int resultado10 = (numero * 10);
        */

        // System.out.printf("A tabuada do número %s que escolheu é: %s \n", numero, resultado);
                
        



    scanner.close();

    }
}
