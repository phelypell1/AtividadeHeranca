/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeherança;

/**
 *
 * @author phelype
 */
public class Gerente  extends Empregado{
    private String nomeGerencia;

    public Gerente(String nomeGerencia, double salario, String matricula) {
        super(salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public Gerente(String nomeGerencia, double salario, String matricula, String nome, int idade, String sexo) {
        super(salario, matricula, nome, idade, sexo);
        this.nomeGerencia = nomeGerencia;
    }

    /**
     * @return the nomeGerencia
     */
    public String getNomeGerencia() {
        return nomeGerencia;
    }

    /**
     * @param nomeGerencia the nomeGerencia to set
     */
    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Gerente: "+getNomeGerencia()+"\n Matricula: "+getMatricula();
    }
    
    
    
}
