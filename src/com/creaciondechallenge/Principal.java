package com.creaciondechallenge;

import com.creaciondechallenge.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        var consumoApi  = new ConsumoAPI();
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("**** Menu del conversor de monedas **** \n");
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

                    System.out.println("Has seleccionado la opción de convertir de dólar a peso argentino.");
                    Conversor.convertidor(consumoApi,"USD","ARS",teclado);
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción de convertir de peso argentino a dólar.");
                    Conversor.convertidor(consumoApi,"ARS","USD",teclado);
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción de convertir de dólar a real brasileño");
                    Conversor.convertidor(consumoApi,"USD","BRL",teclado);
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción de convertir de real brasileño a dolar");
                    Conversor.convertidor(consumoApi,"BRL","USD",teclado);

                    break;
                case 5:
                    System.out.println("Has seleccionado la opción de convertir de dólar a peso colombiano");
                    Conversor.convertidor(consumoApi,"USD","COP",teclado);

                    break;
                case 6:
                    System.out.println("Has seleccionado la opción de convertir de peso colombiano a dolar");
                    Conversor.convertidor(consumoApi,"COP","USD",teclado);
                    break;

                case 7:
                    System.out.println("¡Gracias por usar nuestro programa!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción del 1 al 7.");
            }
        } while (opcion != 7);
        teclado.close();
    }
}
