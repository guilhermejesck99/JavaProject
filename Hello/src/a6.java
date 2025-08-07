import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7");
        var option = scanner.nextInt();
        scanner.close();
        // Switch Case é uma expressão de opções, de seleção, situações. Essa é uma opção sem utilizar o Break
        var mensagem = switch(option){
           case 1, 7 -> "Final de semana";
           case 2 -> "Segunda";
           case 3 -> "Terça";
           case 4 -> "Quarta";
           case 5 -> "Quinta";
           case 6 -> "Sexta";
           default -> "Opção invalida";
        };
        
        System.out.printf("Foi escolhido o : %s", mensagem);

           /*case 1, 7 -> System.out.println("Final de semana");
           case 2 -> System.out.println("Segunda");
           case 3 -> System.out.println("Terça");
           case 4 -> System.out.println("Quarta");
           case 5 -> System.out.println("Quinta");
           case 6 -> System.out.println("Sexta");
        default -> System.out.println("Opção invalida");
        */
           
            /* Switch case "Padrão"
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
            */

        }
   }
