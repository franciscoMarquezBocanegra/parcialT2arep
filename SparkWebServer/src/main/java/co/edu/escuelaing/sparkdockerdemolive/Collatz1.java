
package co.edu.escuelaing.sparkdockerdemolive;


public class Collatz1 {
    
    public static int result=0;
    
    //listaa<array>=new arratList<>;

    public static int collatzsequence(int collatzsequence){
      
        while(collatzsequence >= 2){
            
            if(collatzsequence%2 == 0){
                result=collatzsequence / 2;
                listaa.append(result);
            }
            else{
                result = 3*collatzsequence+1;
                listaa.append(result);
            }
            return "\"operacion\": \"collatzsequence\", \"input\": \"" + listaa + "\", \"output\": \""+ collatzsequence + "\"";
        
    }
        
        
        
        
  
    
    
