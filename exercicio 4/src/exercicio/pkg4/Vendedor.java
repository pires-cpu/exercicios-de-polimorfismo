/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

/**
 *
 * @author aluno.saolucas
 */
public class Vendedor extends Funcionario {

    private int vendas;
    private double comissao;
    private String regiao;

    public Vendedor(String nome, double salario, String setor, int vendas, double comissao, String regiao) {
        super(nome, salario, setor);
        this.vendas = vendas;
        this.comissao = comissao;
        this.regiao = regiao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public void trabalhar() {
        System.out.println("O vendedor está vendendo produtos");
    }
}