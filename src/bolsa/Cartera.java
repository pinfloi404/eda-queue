package bolsa;

import java.util.Queue;

public class Cartera {
    private Queue<Paquete> paquetes;
    private int gananciaTotal;

    public Cartera(Queue<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public Queue<Paquete> getpaquetes() {
        return paquetes;
    }

    public void comprarPaquetes(Paquete paquete) {
        paquetes.add(paquete);
        System.out.println("Se ha introducido el paquete: " + paquete.toString());
    }

    public void venderPaquetes(int acciones, int precio) {
        if (paquetes.size() != 0) {
            int a = acciones;

            while (a != 0) {
                Paquete paquete = paquetes.peek();

                if (paquete.getAcciones() < a) {
                    a -= paquete.getAcciones();

                    System.out.println("Se ha vendido el paquete: " + paquete.toString());

                    paquetes.remove();
                } else {
                    paquete.setAcciones(paquete.getAcciones() - a);

                    a -= paquete.getAcciones();

                    System.out.println("Se ha vendido parcialmente el paquete: " + paquete.toString());
                }

                gananciaTotal += ((precio - paquete.getPrecio()) * paquete.getAcciones());
            }
        } else {
            System.out.println("La cartera está vacía.");
        }
    }

    public int getGananciaTotal() {
        return gananciaTotal;
    }

    @Override
    public String toString() {
        return paquetes.toString();
    }
}