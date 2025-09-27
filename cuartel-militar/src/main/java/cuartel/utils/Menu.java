package cuartel.utils;

import cuartel.militares.*;
import java.util.Scanner;

public class Menu {
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el tipo de militar:");
        System.out.println("1. Soldado");
        System.out.println("2. General");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese rango: ");
        String rango = sc.nextLine();
        Militar militar;
        if (opcion == 1) {
            militar = new Soldado(nombre, rango);
        } else {
            militar = new General(nombre, rango);
        }
        militar.entrenar();
        militar.reportar();
    }
}
