public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Tipo: " +tipo);
        System.out.println("Activo: " +activo);
    }
    void mostrarEstado(){
        String estado = activo?"activo":"inhabilitado";
        System.out.println("Nombre: " +nombre+ "\nEstado: " +estado);
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
