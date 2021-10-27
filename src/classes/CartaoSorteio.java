
package classes;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Cristiano
 */
public class CartaoSorteio extends Cartao{
    public CartaoSorteio(){
        sorteiaNumeros();
    }
    
    public void sorteiaNumeros(){
        Random random = new Random();
        int maximo = 50;
        while(numeros.size() < 6){
            addNumeros(random.nextInt(maximo)+1);
        }
       
    }
}
