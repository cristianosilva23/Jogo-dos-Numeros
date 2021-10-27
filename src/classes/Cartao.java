
package classes;

import java.util.ArrayList;

/**
 *
 * @author Cristiano
 */
public class Cartao {
    public ArrayList<Integer> numeros = new ArrayList<>();

    public Cartao(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
   

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }
    
    public Cartao(){
    }
    
    public boolean addNumeros(Integer numero){
        if(!numeros.contains(numero)){
            numeros.add(numero);
            return true;
        }
        return false;
    }
    
    public String numerosCartao(){
        StringBuilder numerosString = new StringBuilder();
        numeros.forEach((n) -> numerosString.append(n).append(",\t"));
        
        return numerosString.toString();
    }
    
    public boolean remove (Integer numero){
        return numeros.remove(numero);
    }
    
    
    
}
