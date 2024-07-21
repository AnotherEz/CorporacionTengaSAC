package Clases;
public class Usuario {
    String DNI;
    int codigoVerificacion;
    String firstName;
    String secondName;
    String firstLastName;
    String secondLastName;
    
    
    public static String GetNombreCompleto(Usuario usuario){
        String NombreCompleto=usuario.firstName+" "+ usuario.secondName+" "+usuario.firstLastName+" "+usuario.secondLastName;
        return NombreCompleto;
    }
    
     public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
     
     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public int getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(int codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }
    
    
    
    
    public static String[] NombresSeparados(String nombres) {
        if (nombres == null || nombres.isEmpty()) {
            return null;
        }

        String[] partes = nombres.split(" ");
        if (partes.length != 2) {
            return null; // La cadena no contiene exactamente dos palabras
        }

        return partes;
    }
}
