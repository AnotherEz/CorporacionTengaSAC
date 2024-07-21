
package Clases;
 public class Empresa {
     private String ruc;
    private String nombre;
    private String estado;
    private String condicion;
    private String direccion;
    private String direccionCompleta;
    private String departamento;
    private String provincia;
    private String distrito;
    private String ubigeoSunat;
    private String[] ubigeo;
    private Boolean esAgenteDeRetencion;
    private Boolean esBuenContribuyente;

    // Getters y Setters
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionCompleta() {
        return direccionCompleta;
    }

    public void setDireccionCompleta(String direccionCompleta) {
        this.direccionCompleta = direccionCompleta;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getUbigeoSunat() {
        return ubigeoSunat;
    }

    public void setUbigeoSunat(String ubigeoSunat) {
        this.ubigeoSunat = ubigeoSunat;
    }

    public String[] getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String[] ubigeo) {
        this.ubigeo = ubigeo;
    }

    public Boolean getEsAgenteDeRetencion() {
        return esAgenteDeRetencion;
    }

    public void setEsAgenteDeRetencion(Boolean esAgenteDeRetencion) {
        this.esAgenteDeRetencion = esAgenteDeRetencion;
    }

    public Boolean getEsBuenContribuyente() {
        return esBuenContribuyente;
    }

    public void setEsBuenContribuyente(Boolean esBuenContribuyente) {
        this.esBuenContribuyente = esBuenContribuyente;
    }
    
    
    
     public static void ImprimirDatosE(Empresa empresa) {
        System.out.println("RUC: " + empresa.getRuc());
        System.out.println("Nombre o razón social: " + empresa.getNombre());
        System.out.println("Estado: " + empresa.getEstado());
        System.out.println("Condición: " + empresa.getCondicion());
        System.out.println("Dirección: " + empresa.getDireccion());
        System.out.println("Dirección completa: " + empresa.getDireccionCompleta());
        System.out.println("Departamento: " + empresa.getDepartamento());
        System.out.println("Provincia: " + empresa.getProvincia());
        System.out.println("Distrito: " + empresa.getDistrito());
        System.out.println("Ubigeo SUNAT: " + empresa.getUbigeoSunat());
        System.out.println("Ubigeo: " + String.join(", ", empresa.getUbigeo()));
        System.out.println("Es agente de retención: " + (empresa.getEsAgenteDeRetencion() != null ? empresa.getEsAgenteDeRetencion() : "No disponible"));
        System.out.println("Es buen contribuyente: " + (empresa.getEsBuenContribuyente() != null ? empresa.getEsBuenContribuyente() : "No disponible"));
    }
 }