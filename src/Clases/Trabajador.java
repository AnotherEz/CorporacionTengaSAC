package Clases;
public class Trabajador extends Usuario {
    String username;
    String pass;
    String cargo;
    String fechaIngreso;
    float sueldoBasico;
    float asignacionFamiliar;
    float cts; // Compensación por Tiempo de Servicios
    float gratificaciones; // Gratificaciones de julio y diciembre
    float descuentosAFP; // Descuento por AFP
    float descuentosONP; // Descuento por ONP
    float seguroSalud; // Seguro de salud

public Trabajador(){
}    // Constructor
   

    // Métodos para calcular los diferentes beneficios y descuentos
    private float calcularAsignacionFamiliar() {
        // Ejemplo: 10% del sueldo básico
        return sueldoBasico * 0.10f;
    }
     public String getUserName() {
        return username;
    }
    public void setUserName(String usernam) {
        this.username = usernam;
    }
     public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
     public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String cargo) {
        this.fechaIngreso = cargo;
    }
    
    private float calcularCTS() {
        // Ejemplo: 8.33% del sueldo básico, acumulado semestralmente
        return sueldoBasico * 0.0833f;
    }

    private float calcularGratificaciones() {
        // Ejemplo: un sueldo básico por gratificación de julio y diciembre
        return sueldoBasico * 2;
    }

    private float calcularDescuentosAFP() {
        // Ejemplo: 10% del sueldo básico
        return sueldoBasico * 0.10f;
    }

    private float calcularDescuentosONP() {
        // Ejemplo: 13% del sueldo básico
        return sueldoBasico * 0.13f;
    }

    private float calcularSeguroSalud() {
        // Ejemplo: 9% del sueldo básico
        return sueldoBasico * 0.09f;
    }

    // Getters y setters
    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
        this.asignacionFamiliar = calcularAsignacionFamiliar();
        this.cts = calcularCTS();
        this.gratificaciones = calcularGratificaciones();
        this.descuentosAFP = calcularDescuentosAFP();
        this.descuentosONP = calcularDescuentosONP();
        this.seguroSalud = calcularSeguroSalud();
    }

    public float getAsignacionFamiliar() {
        return asignacionFamiliar;
    }

    public void setAsignacionFamiliar(float asignacionFamiliar) {
        this.asignacionFamiliar = asignacionFamiliar;
    }

    public float getCts() {
        return cts;
    }

    public void setCts(float cts) {
        this.cts = cts;
    }

    public float getGratificaciones() {
        return gratificaciones;
    }

    public void setGratificaciones(float gratificaciones) {
        this.gratificaciones = gratificaciones;
    }

    public float getDescuentosAFP() {
        return descuentosAFP;
    }

    public void setDescuentosAFP(float descuentosAFP) {
        this.descuentosAFP = descuentosAFP;
    }

    public float getDescuentosONP() {
        return descuentosONP;
    }

    public void setDescuentosONP(float descuentosONP) {
        this.descuentosONP = descuentosONP;
    }

    public float getSeguroSalud() {
        return seguroSalud;
    }

    public void setSeguroSalud(float seguroSalud) {
        this.seguroSalud = seguroSalud;
    }

    public static void informacionTrabajador(Trabajador trabajador) {
            System.out.println("El empleado " + trabajador.nombreCompleto + " identificado con el DNI " + trabajador.DNI + " con cargo de " + trabajador.cargo);
            System.out.println("con sueldo básico de S/" + trabajador.sueldoBasico + " con asignación familiar de " + trabajador.asignacionFamiliar +
            ", con CTS=" + trabajador.cts + ", con gratificaciones=" + trabajador.gratificaciones);
            System.out.println(", con descuentos AFP=" + trabajador.descuentosAFP +
            ", con descuentos ONP=" + trabajador.descuentosONP +
            ", con seguro de salud=" + trabajador.seguroSalud);
                
    }
}