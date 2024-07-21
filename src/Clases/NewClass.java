package Clases;

import static Clases.Cliente.ImprimirDatosC;
import static Clases.Empresa.ImprimirDatosE;
import static Conexion.ConsultasApiReniec.consultarDni;
import static Conexion.ConsultasApiReniec.consultarRUC;
import java.io.IOException;

public class NewClass {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        String DNI="74389393";
        Empresa empresa= new Empresa();
        String RUC= "20610419772";
        try {
            consultarDni(DNI, cliente);
            ImprimirDatosC(cliente);
            
            consultarRUC(RUC, empresa);
            ImprimirDatosE(empresa);
            
            // Imprimir otros atributos según sea necesario
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
