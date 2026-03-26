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
public class Flauta extends Instrumento {

    private String material;
    private String tonalidade;
    private boolean profissional;

    public Flauta(String nome, String tipo, String fabricante,
            String material, String tonalidade, boolean profissional) {
        super(nome, tipo, fabricante);
        this.material = material;
        this.tonalidade = tonalidade;
        this.profissional = profissional;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTonalidade() {
        return tonalidade;
    }

    public void setTonalidade(String tonalidade) {
        this.tonalidade = tonalidade;
    }

    public boolean isProfissional() {
        return profissional;
    }

    public void setProfissional(boolean profissional) {
        this.profissional = profissional;
    }

    public void tocar() {
        System.out.println("A flauta está tocando");
    }
}