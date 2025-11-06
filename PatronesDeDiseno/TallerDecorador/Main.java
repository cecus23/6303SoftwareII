package PatronesDeDiseno.TallerDecorador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza miPizza = null;

        System.out.println("=== BIENVENIDO A LA PIZZERÍA ===");
        System.out.println("Selecciona el tipo de pizza base:");
        System.out.println("1. Pizza Margarita ($8.0)");
        System.out.println("2. Pizza Hawaiana ($9.0)");
        System.out.print("Opción: ");
        int opcionPizza = sc.nextInt();

        switch (opcionPizza) {
            case 1:
                miPizza = new PizzaMargarita();
                break;
            case 2:
                miPizza = new PizzaHawaiana();
                break;
            default:
                System.out.println("Opción inválida. Se selecciona Pizza Margarita por defecto.");
                miPizza = new PizzaMargarita();
                break;
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n¿Deseas agregar ingredientes extra?");
            System.out.println("1. Queso Extra (+$1.5)");
            System.out.println("2. Pepperoni (+$2.0)");
            System.out.println("3. Champiñones (+$1.0)");
            System.out.println("4. Borde Relleno (+$2.5)");
            System.out.println("5. No agregar más ingredientes");
            System.out.print("Opción: ");
            int opcionExtra = sc.nextInt();

            switch (opcionExtra) {
                case 1:
                    miPizza = new QuesoExtra(miPizza);
                    System.out.println("➡ Queso extra agregado.");
                    break;
                case 2:
                    miPizza = new Pepperoni(miPizza);
                    System.out.println("➡ Pepperoni agregado.");
                    break;
                case 3:
                    miPizza = new Champiñones(miPizza);
                    System.out.println("➡ Champiñones agregados.");
                    break;
                case 4:
                    miPizza = new BordeRelleno(miPizza);
                    System.out.println("➡ Borde relleno agregado.");
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        System.out.println("\n=== TU PEDIDO FINAL ===");
        System.out.println("Descripción: " + miPizza.getDescripcion());
        System.out.println("Total a pagar: $" + miPizza.costo());
        System.out.println("¡Gracias por tu compra!");

        sc.close();
    }
}
