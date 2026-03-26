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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        Funcionario objgerente = new Gerente("Rafael Paffrath Pires", 9000, "Administração", 21, "Senior", true);
        Funcionario objvendedor = new Vendedor("Arthur veeck", 4334, "Vendas", 30, 0.50, "Sul");
        Funcionario objProgramador= new Programador("Henrique Ibarra", 99000, "TI", "Java", "Pleno", true);
        Funcionario objDesigner = new Designer("Cristian Moraes Flores", 4000, "Marketing", "Figma", "UI/UX", false);
        Funcionario objSTecnico = new SuporteTecnico("Miguel Joares", 2100, "TI", 70, "Redes", true);

        objgerente.trabalhar();
        objvendedor.trabalhar();
        objProgramador.trabalhar();
        objDesigner.trabalhar();
        objSTecnico.trabalhar();
    
    }
}