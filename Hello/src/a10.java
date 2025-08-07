import java.util.Scanner;

public class a10 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite sua altura");
        float altura = scanner.nextFloat();
        System.out.println("Digite seu peso");
        float peso = scanner.nextFloat();
        float imc = (peso/(altura*altura));

        System.out.printf("Seu IMC é de: %s \n",imc);
        
        if (imc <= 18.5) {
            System.out.printf("Você está abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) 
            System.out.printf("Você está com o peso normal");
          else if (imc >= 25 && imc <= 29.9) 
            System.out.printf("Você está acima do peso");
          else if (imc >= 30 && imc <= 34.4) 
            System.out.printf("Você está com obesidade N1");
          else if (imc >= 35 && imc <= 39.9) {
            System.out.printf("Você está com obsedidade N2");                           
        } else {
            System.out.printf("Você vai morrer amanhã");
        }
    
        scanner.close();
        


        
}
}
