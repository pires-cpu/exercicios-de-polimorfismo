/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg3;

/**
 *
 * @author aluno.saolucas
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Instrumento objviolao = new Violao("Violão", "Cordas", "eagle", 9, "Cedro", false);
        Instrumento objpiano = new Piano("Piano", "Teclas", "Steinway", 23, "Bösendorfer", false);
        Instrumento objbateria = new Bateria("Bateria", "Percussão", "odery", 12, "Madeira", false);
        
        objviolao.tocar();
        objpiano.tocar();
        objbateria.tocar();
      
    }
    
}