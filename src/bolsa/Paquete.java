package bolsa;

public class Paquete {
    private String mes;
    private int nAcciones, precio;
    
    public Paquete(String mes, int nAcciones, int precio) {
        this.mes = mes;
        this.nAcciones = nAcciones;
        this.precio = precio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getnAcciones() {
        return nAcciones;
    }

    public void setnAcciones(int nAcciones) {
        this.nAcciones = nAcciones;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void comprarAcciones(int acciones, int precio) {

    }

    public void venderAcciones(int acciones, int precio) {

    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}