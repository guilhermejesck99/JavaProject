public class a4 {
   public static void main(String[] args) {
    
    var value1 = 0107;
    var binary1 = Integer.toBinaryString(value1);
    System.out.printf("Primeiro número da operação %s (representação binaria %s) \n", value1, binary1); // Representação binária do primeiro número

    /* var value2 = 2;
    var binary2 = Integer.toBinaryString(value2);
    System.out.printf("Segundo número da operação %s (representação binaria %s) \n", value2, binary2); // Representação binária do segundo número
   
    var result = value1 ^ value2;
    var binaryResult = Integer.toBinaryString(result);
    System.out.printf("%s ^ %s = %s (representação binaria %s) \n" , value1, value2, result, binaryResult); // Operador bitwise OR (|) entre os dois números */

    var result = ~value1;
    var binaryResult = Integer.toBinaryString(result);
    
    System.out.printf(" ~%s = %s (representação binaria %s) \n" , value1, result, binaryResult); // Operador bitwise OR (|) entre os dois números

    /*
     * 0 = false
     * 1 = true
     *
     * && = AND lógico
     * || = OR lógico
     * ^ = XOR lógico
     * ~ = Complemento de um número
     * 
     * 00000000000000000000000001101011
     * 11111111111111111111111110010100
     */
    }
}
