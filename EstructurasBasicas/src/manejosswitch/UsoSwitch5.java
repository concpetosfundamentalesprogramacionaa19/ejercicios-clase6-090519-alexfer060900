/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String placa;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la placa.");
        placa = entrada.next();
        char valor = placa.charAt(0);
                
        switch(valor){
            case 'o':
            case'O':
                System.out.printf("Placa %s de la provincia de %s.",
                        placa, "El Oro.");
                break;
            
            case 'e':
            case 'E':
                System.out.printf("Placa %s de la provincia de %s.",
                        placa, "Esmeraldas");
                break;    
            
            case 'g':
            case 'G':
                System.out.printf("Placa %s de la provincia de %s.",
                        placa, "Guayas");
                break;
            
            case 'r':
            case 'R':
                System.out.printf("Placa %s de la provincia de %s.",
                        placa, "Los Rios.");
                break;
            
            case 'm':
            case 'M':
                System.out.printf("Placa %s de la provincia de %s.",
                        placa, "Manabi");
                break;
            
            case 'y':
            case 'Y':
                System.out.printf("Placa %s de la provincia de %s.",
                        placa, "Santa Elena.");
                break;
             
            case 'j':
            case 'J':
                System.out.printf("Placa %s de la provincia de %s.",
                        placa, "Santo Domingo.");
                break;
                
            default:
                System.out.println("No es provincia de la costa.");
                
        }
        
    }
}
