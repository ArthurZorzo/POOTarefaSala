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
public class Geladeira {
    //Atributos
    String marca;
    String dataCompra;
    String cor;
    int numObjetos;

    public Geladeira(String marca, String dataCompra, String cor, int numObjetos){
        this.marca = marca;
        this.dataCompra = dataCompra;
        this.cor = cor;
        this.numObjetos = numObjetos;
    }
    
     void imprimeDadosGeladeira(){//não estarei retornando informação
        //Imprimindo os atributos do objeto:
        System.out.println("Geladeira:");
        System.out.println("marca: "+marca);
        System.out.println("data compra: "+dataCompra);
        System.out.println("cor: "+cor);
        System.out.println("numero de objetos: "+numObjetos);
        System.out.println("\n");
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumObjetos() {
        return numObjetos;
    }

    public void setNumObjetos(int numObjetos) {
        this.numObjetos = numObjetos;
    }
}
