package com.creaciondechallenge;

import com.creaciondechallenge.service.ConsumoAPI;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Scanner;

public class Conversor {

    private final String URL_API = "https://v6.exchangerate-api.com/v6/";
    private final String API_KEY = "2af5d634e8802e113764bb59";

    public void convertidor(ConsumoAPI consumoAPI, String monedaBase, String monedaAConvertir, Scanner teclado) {
        System.out.println("Digite el valor a convertir: ");
        double valor = teclado.nextDouble();
        var json = consumoAPI.obtenerDatos(URL_API+API_KEY+"/pair/"+monedaBase + "/"+ monedaAConvertir);

        try{
            double tasa =  extrayendoTasa(json);
            double resultado = valor * tasa;
            System.out.println("El valor convertido es: " + resultado + monedaAConvertir);
        }catch (Exception e){
            System.out.println("Error al obtener el valor para convertir");
        }
    }

    private static double extrayendoTasa(String json) {
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        if (jsonObject.has("conversion_rate")){
            return jsonObject.get("conversion_rate").getAsDouble();
        }else {
            throw new IllegalArgumentException("La respueta JSON no es correcta");
        }
    }
}
