/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capa_Presentacion;

/**
 *
 * @author USER
 */
public class UtilValidacion {
    
    public static boolean esValidoSoloLetras(String texto) { // Valida un texto solo con letras
        return texto.matches("^[A-Za-z\s]+$");
    }
    
    public static boolean esValidoTextoComb(String texto) { // Valida texto con letras y numeros
        return texto.matches("^[A-Za-z0-9\s]+$");
    }
    
    public static boolean esEntero(String numero) { // Valida si es un numero entero 
        return numero.matches("^[0-9]+$");
    }
}
