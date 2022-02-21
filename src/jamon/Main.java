/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 * Clase principal.
 * Programa para comprar y vender jamones

 * @author portatil_profesorado
 * @author José manuel Delgado Garrido
 */



/**
 * Es el método principal del programa
 
  */
 
 
public class Main {
    
    public static void main(String[] args) {
        JamonDelgadoGarridoJoseManuel2122 miJamonDelgadoGarridoJoséManuel2122;
        int stockActual;
        
        miJamonDelgadoGarridoJoséManuel2122 = new JamonDelgadoGarridoJoseManuel2122("5Jotas",580,100);
        vendeJamDelgadoGarridoJoséManuel2122(miJamonDelgadoGarridoJoséManuel2122);
        
        compraJamDelgadoGarridoJoséManuel2122(miJamonDelgadoGarridoJoséManuel2122);
    }
    /**
     * Método Compra
     * Sirve para comprar jamones
     * @param miJamonDelgadoGarridoJoséManuel2122 objeto de la clase jamon
     */
     
     

    private static void compraJamDelgadoGarridoJoséManuel2122(JamonDelgadoGarridoJoseManuel2122 miJamonDelgadoGarridoJoséManuel2122) {
        int stockActual;
        try
        {
            System.out.println("Compra de Jamones");
            miJamonDelgadoGarridoJoséManuel2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
        stockActual = miJamonDelgadoGarridoJoséManuel2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    /**
     * Método vende
     * Sirve para vender jamones
     * @param miJamonDelgadoGarridoJoséManuel2122 objeto de la clase jamon
     
    
     */
    private static void vendeJamDelgadoGarridoJoséManuel2122(JamonDelgadoGarridoJoseManuel2122 miJamonDelgadoGarridoJoséManuel2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonDelgadoGarridoJoséManuel2122.vender(80,"España");
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
