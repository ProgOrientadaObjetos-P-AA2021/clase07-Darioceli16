/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author Smart
 */
public class ejecutor {
   public static void main(String[] args) {

        
        hospital h1 = new hospital("Hospital Básico San Gregorio", 15, 1234.56);
        hospital h2 = new hospital("Hospital Clínica San Agustín", 12, 123.123);
        hospital h3 = new hospital("Clínica Hospital San José", 14, 1223.12);

        String nombreArchivo = "hospital.txt";

        hospital[] lista = {h1, h2, h3};

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
    }

}

