package com.creaciondechallenge;

import com.creaciondechallenge.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        var consumoApi  = new ConsumoAPI();
        var json = consumoApi.obtenerDatos("https://v6.exchangerate-api.com/v6/2af5d634e8802e113764bb59/pair/EUR/GBP");
        System.out.println(json);

        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("**** Menu del conversor de monedas **** \n");
        do {
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir\n");
            System.out.print("Elija una opción válida: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para convertir de dólar a peso argentino
                    System.out.println("Has seleccionado la opción de convertir de dólar a peso argentino.");
                    // Aquí iría el código para realizar la conversión
                    break;
                case 2:
                    // Lógica para convertir de peso argentino a dólar
                    System.out.println("Has seleccionado la opción de convertir de peso argentino a dólar.");
                    // Aquí iría el código para realizar la conversión
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción de convertir de dólar a real brasileño");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción de convertir de real brasileño a dolar");
                    break;
                case 5:
                    System.out.println("Has seleccionado la opción de convertir de dólar a peso colombiano");
                    break;
                case 6:
                    System.out.println("Has seleccionado la opción de convertir de peso colombiano a dolar");
                case 7:
                    System.out.println("¡Salir!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción del 1 al 7.");
            }
        } while (opcion != 7);
    }
}
