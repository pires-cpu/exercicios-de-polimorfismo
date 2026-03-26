/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;


public class Gerente extends Funcionario {

    private int equipe;
    private String nivel;
    private boolean bonus;

    public Gerente(String nome, double salario, String setor, int equipe, String nivel, boolean bonus) {
        super(nome, salario, setor);
        this.equipe = equipe;
        this.nivel = nivel;
        this.bonus = bonus;
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    @Override
    public void trabalhar() {
        System.out.println("O gerente está coordenando a equipe");
    }
}