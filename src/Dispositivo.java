public class Dispositivo {

    private String nombre;
    private String tipo;
    private boolean activo;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {

        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " +nombre); // Muestra los demás atributos
        System.out.println("tipo: " +tipo); // Muestra los demás atributos
        System.out.println("activo: " +activo); // Muestra los demás atributos
    }

    void mostrarEstado(){

        String estado = activo?"activo":"inactivo";
        System.out.println("Nombre: "+nombre+"\n Estado: "+estado);

    }


}
