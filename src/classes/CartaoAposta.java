
package classes;

import java.util.ArrayList;

/**
 *
 * @author Cristiano
 */
public class CartaoAposta extends Cartao {
    private int numeroAposta;

    public CartaoAposta(int numeroAposta) {
        this.numeroAposta = numeroAposta;
    }

    public CartaoAposta() {
    }

    public int getNumeroAposta() {
        return numeroAposta;
    }

    public void setNumeroAposta() {
        numeroAposta++;
    }
    
    public float calculaAposta(){
        float res=0;
        if(numeros.size()==6){
            res= 4.5f;
        }else if(numeros.size()==7){
            res= 31.5f;
        }else if(numeros.size()==8){
            res= 126;
        }else if(numeros.size()==9){
            res= 378;
        }else if(numeros.size()==10){
            res= 945;
        }
        return res;
    }
    
    public ArrayList<Integer> acertos (CartaoSorteio sorteio){
        ArrayList<Integer> acertos = sorteio.getNumeros();
        
        acertos.retainAll(numeros);
        return acertos;
    }
}
