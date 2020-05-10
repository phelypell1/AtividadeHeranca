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
public class AtividadeHerança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente c = new Cliente(2.505, 1994, "Amilton", 25,"Masculino");
        Gerente g = new Gerente("Antonio Ramos", 2.280,"141458", "Jośe", 42, "Masculino");
        Vendedor v = new Vendedor(2521, 25, 1.999, "4587", "José Santos", 25, "Masculino");
        
        System.out.println(c.toString()+"\n---------\n Gerente: "+g.toString()+"\n valor Inss: "+g.valorInss(g.getSalario())+"\n---------\nVendedor:"+v.toString());
        
        
        
    }
    
}
