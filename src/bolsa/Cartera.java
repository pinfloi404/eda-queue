package bolsa;

import java.util.Queue;

public class Cartera {
    private Queue acciones;

    public Cartera(Queue acciones) {
        this.acciones = acciones;
    }

    public Queue getAcciones() {
        return acciones;
    }

    public void setAcciones(Queue acciones) {
        this.acciones = acciones;
    }

    public int ganancia() {
        return 0;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}