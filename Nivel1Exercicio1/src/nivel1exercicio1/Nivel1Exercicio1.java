
package nivel1exercicio1;

import java.util.Scanner;


public class Nivel1Exercicio1 {

    
    public static void main(String[] args) {
       
         Scanner leia = new Scanner(System.in);
        System.out.println ("Informe um Número para saber se é Positivo ou Negativo");
        double positivoNegativo = leia.nextDouble();
        
        if (positivoNegativo >= 0) {
        System.out.println("Positivo");
    } else {
        System.out.println("Negativo");
        }

    }
    
}
