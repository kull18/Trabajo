package trabajo;

import java.util.ArrayList;



public class Arqueo {
       
      private Arqueo cierre; 
      
      
      public Arqueo getCierre() {
    	  return cierre; 
      }
      
     
      @Overdrive
      
      public String toString() {
    	  
		return "[" + "el arqueo: " + cierre +"]"; 
      }
     
      
      
     
      ArrayList <Arqueo> arque = new ArrayList<>(); 

      public boolean getarequeo(Arqueo arqueo) {
      	 boolean status; 
      	 status = arque.add(arqueo);  
      	 return status; 
       }
      
      public ArrayList <Arqueo> retunarqueo() {
    	  return arque; 
      }

	public void add(Compra compra) {
		// TODO Auto-generated method stub
		
	}
	
	public void add(Monto monto) {
		
	}
     
	
      
}
