void main()
{
    Dispositivo d1 = new Dispositivo();
    Dispositivo d2 = new Dispositivo();
    /*
    d1.nombre = "Teléfono";
    d1.tipo = "Comunicación";
    d1.activo = true;

    d2.nombre = "Impresora";
    d2.tipo = "Recurso";
    d2.activo = false; */

    d1.setNombre("Laptop");
    d1.setTipo("Lenovo");
    d1.setActivo(true);

    System.out.println(d1.getNombre());
    System.out.println(d1.getTipo());
    System.out.println(d1.isActivo());

    d1.setNombre((""));
    System.out.println(d1.getNombre());
}

