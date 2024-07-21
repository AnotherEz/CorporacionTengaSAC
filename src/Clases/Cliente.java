package Clases;

import EstructurasDatos.CarritoDeCompras;

public class Cliente extends Usuario {
    CarritoDeCompras Carrito;
    
     public Cliente(){
    }
    public static void ImprimirDatosC(Cliente cliente){
            System.out.println("Su dni es: " + cliente.getDNI());
            System.out.println("Con digito verificador: " + cliente.getCodigoVerificacion());
            System.out.println("Primer nombre es: " + cliente.getFirstName());
            System.out.println("Segundo nombre es: " + cliente.getSecondName());
            System.out.println("Primer apellido es: " + cliente.getFirstLastName());
            System.out.println("Segundo apellido es: " + cliente.getSecondLastName());
    }
}