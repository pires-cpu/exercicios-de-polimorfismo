/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg2;

/**
 *
 * @author aluno.saolucas
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Veiculo objcarro = new Carro("Toyota", "Corolla", 2022, 4, "Gasolina", true);
        Veiculo objmoto = new Moto("Honda", "CB500", 2021, 500, "Esportiva", true);
        Veiculo objbici = new Bicicleta("Caloi", "Elite", 2023, 21, "Disco", false);
        Veiculo objaviao = new Aviao("Boeing", "737", 2018, 2, 180, "LATAM");
        Veiculo objbarco = new Barco("Yamaha", "WaveRunner", 2020, "Lancha", 6, true);

        objcarro.mover();
        objmoto.mover();
        objbici.mover();
        objaviao.mover();
        objbarco.mover();
    }
    
}