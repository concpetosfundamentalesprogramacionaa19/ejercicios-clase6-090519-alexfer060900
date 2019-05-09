/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

/**
 *
 * @author reroes

    /**
     */
import java.util.Scanner;
public class CicloWhile3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensajeFinal = "";
        String nombre;
        String apellido;
        String profesion;
        String opcion;
        int contador = 1;
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        
        mensajeFinal = String.format("%s%s\n\n%s\n\n", mensajeFinal, "Informe"
                + " de la ciudad de Loja", "Listado de personas");
        while(bandera == true){
            System.out.println("Ingrese sus nombres:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese sus apellidos:");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su profesion:");
            profesion = entrada.next();
            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n", 
                    mensajeFinal, contador, nombre, apellido, profesion);
            contador = contador + 1;
            
            System.out.println("Digite <n> para salir");
            opcion = entrada.next();
            if (opcion.equals("n")){
                bandera = false; 
            } 
        }
        System.out.printf("%s", mensajeFinal);
    
    }
}
