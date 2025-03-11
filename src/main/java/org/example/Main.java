package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Auto> listaAutos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args ){
        int opcion;

        do {
            System.out.println("TALLER DE AUTOS");
            System.out.println("1. Agregar Auto");
            System.out.println("2. Mostrar detalles del auto");
            System.out.println("3. Actualizar Kilometraje");
            System.out.println("4. Verificar si un auto es antiguo");
            System.out.println("5. Verificar si el auto necesita mantenimiento");
            System.out.println("6. Calcular consumo de combustible en el trayecto");
            System.out.println("7. Calcular combustible restante despues de un viaje");
            System.out.println("8. Cambiar el estado de un auto");
            System.out.println("9. Mostrar todos los autos");
        }

    }

}