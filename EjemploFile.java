/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EjemploFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    int opcion=EntradaSalida.pedirOpcionMenu();
    File fichero=null;
    while(opcion!=5)
    {
        switch (opcion)
        {
            case 1:
                //Crear fichero
                String nombre_fichero=EntradaSalida.pedirNombreFichero();
            
                try {
                    fichero=crearFichero(nombre_fichero);
                } catch (IOException ex) {
                    Logger.getLogger(EjemploFile.class.getName()).log(Level.SEVERE, null, ex);
                }
           
                break;

            case 2:
                //Borrar fichero
                if (fichero!=null)
                {
                fichero.delete();
                }
                else
                {
                System.out.println("No se puee borrar un fichero que no existe");
                }
                break;
            case 3:
                //Ver longitud fichero
                if (fichero!=null)
                {
                System.out.println(fichero.length());
                }
                else
                {
                    System.out.println("El fichero está a null");
                }
                break;
            case 4:
                if(fichero!=null)
                {
                System.out.println(fichero.getAbsolutePath());
                }
                else
                {
                    System.out.println("\"El fichero está a null\"");
                }
                break;
        }
        opcion=EntradaSalida.pedirOpcionMenu();
    }
    
   
    }

    private static File crearFichero(String nombre_fichero) throws IOException {
       File fichero=new File(nombre_fichero);
                fichero.createNewFile();
                return fichero;
    }
    
}
