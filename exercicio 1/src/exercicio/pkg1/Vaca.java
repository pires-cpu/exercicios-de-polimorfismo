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
public class Vaca extends Animal {

    private String raca;
    private String cor;
    private boolean produzLeite;

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

    public boolean isProduzLeite() {
        return produzLeite;
    }

    public void setProduzLeite(boolean produzLeite) {
        this.produzLeite = produzLeite;
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaca faz: Muuu!");
    }
}