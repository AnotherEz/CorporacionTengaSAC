package Clases;

public class Usuario {
    String DNI;
    int codigoVerificacion;
    String firstName;
    String secondName;
    String nombres;
    String firstLastName;
    String secondLastName;
    String nombreCompleto;

    public Usuario() {
    }

    public String getNombreCompleto() {
        return nombres + " " + firstLastName + " " + secondLastName;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = stringPropio(nombreCompleto);
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = stringPropio(DNI);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = stringPropio(firstName);
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = stringPropio(secondName);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = stringPropio(nombres);
        // Asignar el primer nombre y el resto de la cadena formateados
        String[] nombresSeparados = separarNombres(nombres);
        this.firstName = stringPropio(nombresSeparados[0]);
        this.secondName = stringPropio(nombresSeparados[1]);
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = stringPropio(firstLastName);
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = stringPropio(secondLastName);
    }

    public int getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(int codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    // Método que separa el primer nombre y el resto de la cadena
    public static String[] separarNombres(String nombres) {
        if (nombres == null || nombres.isEmpty()) {
            return new String[]{"", ""};
        }

        String[] partes = nombres.split(" ", 2); // Separa en dos partes máximo
        String primerNombre = partes[0];
        String restoNombres = partes.length > 1 ? partes[1] : "";

        return new String[]{primerNombre, restoNombres};
    }

    // Método para formatear una cadena: primera letra de cada palabra en mayúscula
    public static String stringPropio(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }

        String[] palabras = texto.toLowerCase().split(" ");
        StringBuilder textoFormateado = new StringBuilder();

        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                textoFormateado.append(Character.toUpperCase(palabra.charAt(0)))
                               .append(palabra.substring(1))
                               .append(" ");
            }
        }

        return textoFormateado.toString().trim();
    }
}
