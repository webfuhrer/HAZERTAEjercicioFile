/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofile;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EntradaSalida {

    static int pedirOpcionMenu() {
        //1-Crear fichero
    //2-Borrar fichero
    //3-Ver tamaño fichero
    //4-Ver ruta
    //5-Salir
    Scanner sc=new Scanner(System.in);
    String[] opciones={"1-Crear fichero", "2-Borrar fichero", 
    "3-Ver tamaño fichero", "4-Ver ruta", "5-Salir"};
    for (String opcion: opciones)
        {
            System.out.println(opcion);
        }
    int opcion=sc.nextInt();
    return opcion;
    
    }

    static String pedirNombreFichero() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Escriba la ruta del fichero");
        String ruta=sc.nextLine();
        return ruta;
    }
    
}
