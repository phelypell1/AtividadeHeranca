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
public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascimento;

    public Cliente(double valorDivida, int anoNascimento) {
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    public Cliente(double valorDivida, int anoNascimento, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }
    
    
    /**
     * @return the valorDivida
     */
    public double getValorDivida() {
        return valorDivida;
    }

    /**
     * @param valorDivida the valorDivida to set
     */
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    /**
     * @return the anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * @param anoNascimento the anoNascimento to set
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        String msg;
        return msg = "Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Sexo: "+getSexo()+"\nDivida: "+getIdade()+"\nNascimento: "+getAnoNascimento();
    }
    
    
    
    
}
