import java.util.Scanner;

public class Main {

    public static void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "Elige una opción:\n1. Comprar acciones\n2. Vender acciones\n3. Ganancia de capital hasta el momento\n4. Salir");

            switch (scanner.nextInt()) {
                case 1:

                    break;

                case 2:
                
                    break;

                case 3:
                    
                    break;

                case 4:
                    System.out.println("Adiós ʕノ•ᴥ•ʔノ ︵ ┻━┻ ");
                    break;

                default:
                    System.out.println("Opción inválida (⌐▀͡ ̯ʖ▀)\nAdiós ʕノ•ᴥ•ʔノ ︵ ┻━┻ ");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        Main.menu();
    }
}