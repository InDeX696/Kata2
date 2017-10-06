/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if(!histogram.containsKey(data[i])){
                histogram.put(data[i],1);
            } else {
                histogram.put(data[i],histogram.get(data[i])+1);
                
            }
            
        }
        //Metodos disponibles para imprimir
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "==>"+histogram.get(key));
        }
        
        
       //System.out.println(Arrays.asList(histogram));
        
      //System.out.println(histogram.entrySet());       
    }
}
