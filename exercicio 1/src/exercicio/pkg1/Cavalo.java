/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg1;

/**
 *
 * @author aluno.saolucas
 */
public class Cavalo extends Animal{
  private String raca;
    private String cor;
    private double velocidade;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo relincha: Hiiii!");
    }
}