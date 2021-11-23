/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class Armario {
    //Atributos
    int numeroPecasRoupa;
    int numPrateleiras;
    String cor;
    String dataCompra;

    public Armario(int numeroPecasRoupa, int numPrateleiras, String cor, String dataCompra){
        this.numeroPecasRoupa = numeroPecasRoupa;
        this.numPrateleiras = numPrateleiras;
        this.cor = cor;
        this.dataCompra = dataCompra;
    }
    
    void imprimeDadosArmario(){//não estarei retornando informação
        //Imprimindo os atributos do objeto:
        System.out.println("Armario:");
        System.out.println("numero de peças: "+numeroPecasRoupa);
        System.out.println("numero de prateleiras: "+numPrateleiras);
        System.out.println("cor: "+cor);
        System.out.println("data de compra: "+dataCompra);
        System.out.println("\n");
    }
    
    public int getNumeroPecasRoupa() {
        return numeroPecasRoupa;
    }

    public void setNumeroPecasRoupa(int numeroPecasRoupa) {
        this.numeroPecasRoupa = numeroPecasRoupa;
    }

    public int getNumPrateleiras() {
        return numPrateleiras;
    }

    public void setNumPrateleiras(int numPrateleiras) {
        this.numPrateleiras = numPrateleiras;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    
}
