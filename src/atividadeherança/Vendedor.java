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
public class Vendedor extends Empregado{
    private double valorVendas;
    private int qtdeVendas;


    public Vendedor(double valorVendas, int qtdeVendas, double salario, String matricula) {
        super(salario, matricula);
        this.valorVendas = valorVendas;
        this.qtdeVendas = qtdeVendas;
    }

    public Vendedor(double valorVendas, int qtdeVendas, double salario, String matricula, String nome, int idade, String sexo) {
        super(salario, matricula, nome, idade, sexo);
        this.valorVendas = valorVendas;
        this.qtdeVendas = qtdeVendas;
    }
    

    
    
    /**
     * @return the valorVendas
     */
    public double getValorVendas() {
        return valorVendas;
    }

    /**
     * @param valorVendas the valorVendas to set
     */
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    /**
     * @return the qtdeVendas
     */
    public int getQtdeVendas() {
        return qtdeVendas;
    }

    /**
     * @param qtdeVendas the qtdeVendas to set
     */
    public void setQtdeVendas(int qtdeVendas) {
        this.qtdeVendas = qtdeVendas;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+"\n Salário: "+getSalario()+"\n Valor Vendas: "+getValorVendas()+"\n Qtde Vendas: "+getQtdeVendas();
    }
    
    
}
