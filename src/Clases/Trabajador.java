package Clases;
public class Trabajador extends Usuario {
    private float sueldoBasico;
    private float asignacionFamiliar;
    private float cts; // Compensación por Tiempo de Servicios
    private float gratificaciones; // Gratificaciones de julio y diciembre
    private float descuentosAFP; // Descuento por AFP
    private float descuentosONP; // Descuento por ONP
    private float seguroSalud; // Seguro de salud

    // Constructor
    public Trabajador(String nombress, String dni, float sueldoBasico) {
        dni=super.DNI;
        nombress=super.nombres;
        this.sueldoBasico = sueldoBasico;
        this.asignacionFamiliar = calcularAsignacionFamiliar();
        this.cts = calcularCTS();
        this.gratificaciones = calcularGratificaciones();
        this.descuentosAFP = calcularDescuentosAFP();
        this.descuentosONP = calcularDescuentosONP();
        this.seguroSalud = calcularSeguroSalud();
    }

    // Métodos para calcular los diferentes beneficios y descuentos
    private float calcularAsignacionFamiliar() {
        // Ejemplo: 10% del sueldo básico
        return sueldoBasico * 0.10f;
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

    public String informacionTrabajador(Trabajador trabajador) {
        
        
        
        return "El empleado "+nombreCompleto+" identificado con el DNI "+
                 DNI + "con sueldo basico de S/"+sueldoBasico+
                " con asignacion familiar de" + asignacionFamiliar +
                ", con cts=" + cts +
                ", con gratificaciones=" + gratificaciones +
                ", con descuentosAFP=" + descuentosAFP +
                ", con descuentosONP=" + descuentosONP +
                ", con seguroSalud=" + seguroSalud;
    }
}