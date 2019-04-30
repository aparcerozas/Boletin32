/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

/**
 *
 * @author aparcerozas
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1 = new Alumno("Pedro",8,"García Barbón",12);
        System.out.println(a1.amosar());
        a1.cambiarNota(9);
        System.out.println(a1.amosar());
    }
    
}
