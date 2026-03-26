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
public class Instrumento {

    private String nome;
    private String tipo;
    private String fabricante;

    public Instrumento(String nome, String tipo, String fabricante) {
        this.nome = nome;
        this.tipo = tipo;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void tocar() {
        System.out.println("O instrumento está tocando");
    }
}