import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

import bolsa.Cartera;
import bolsa.Paquete;

public class Main {

    public static void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            Cartera cartera = new Cartera(new LinkedBlockingQueue<>());
            int m = 0;

            do {
                System.out.println(
                        "Elige una opción:\n1. Comprar acciones\n2. Vender acciones\n3. Ganancia de capital hasta el momento\n4. Salir");

                m = scanner.nextInt();

                switch (m) {
                    case 1:
                        System.out.print("Número de acciones: ");
                        int a1 = scanner.nextInt();

                        System.out.print("Precio de las acciones: ");
                        int p1 = scanner.nextInt();

                        cartera.comprarPaquetes(new Paquete("Enero", a1, p1));

                        System.out.println(cartera.toString());
                        break;

                    case 2:
                        System.out.print("Número de acciones: ");
                        int a2 = scanner.nextInt();

                        System.out.print("Precio de las acciones: ");
                        int p2 = scanner.nextInt();

                        cartera.venderPaquetes(a2, p2);

                        System.out.println(cartera.toString());
                        break;

                    case 3:
                        System.out.println(cartera.getGananciaTotal() + "€");
                        break;

                    case 4:
                        System.out.println("Adiós ʕノ•ᴥ•ʔノ ︵ ┻━┻ ");
                        break;

                    default:
                        System.out.println("Opción inválida (⌐▀͡ ̯ʖ▀)\nAdiós ʕノ•ᴥ•ʔノ ︵ ┻━┻ ");
                        break;
                }
            } while (m != 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        Main.menu();
    }
}