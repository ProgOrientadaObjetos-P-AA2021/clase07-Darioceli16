/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Smart
 */
public class EscrituraArchivoSecuencial {
   
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private hospital registro;
    private ArrayList<hospital> lista;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerLista(); 
        
        try 
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } 
    }

    EscrituraArchivoSecuencial(String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    public void establecerRegistro(hospital p) {
        registro = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro); 
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    
    public void establecerLista() {
        LecturaArchivoSecuencial l = new LecturaArchivoSecuencial
        (obtenerNombreArchivo());
        l.establecerListahospital();
        lista = l.obtenerListahospital();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<hospital> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try 
        {
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } 
    } 

}