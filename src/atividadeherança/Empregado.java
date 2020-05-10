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
public class Empregado extends Pessoa{
    private double salario;
    private String matricula;

    public Empregado(double salario, String matricula) {
        this.salario = salario;
        this.matricula = matricula;
    }

    public Empregado(double salario, String matricula, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }
    
    
    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double valorInss(double salario){
        return (salario*11)/100;
    }
}
