package bolsa;

public class Paquete {
    private String mes;
    private int acciones, precio;
    
    public Paquete(String mes, int acciones, int precio) {
        this.mes = mes;
        this.acciones = acciones;
        this.precio = precio;
    }

    public String getMes() {
        return mes;
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Mes de compra: " + mes + ", número de acciones: " + acciones + ", precio de compra " + precio + "€";
    }
}