package trabajo;

import java.util.ArrayList;



public class Monto {
       private int monto; 
       
       public Monto(int monto) {
    	   this.monto = monto;
       }
       
       public Monto() {
		// TODO Auto-generated constructor stub
	}

	public int  getMonto() {
    	   return monto; 
       }
       
       @Overdrive
       
       public String toString() {
    	   return "el monto es: " + monto; 
       }
       
	ArrayList <Monto> montos = new ArrayList<>(); 
    
    public boolean getmonto(Monto monto) {
 	   boolean status; 
 	   status = montos.add(monto); 
 	   return status; 
    }
    
    public ArrayList <Monto> getall() {
 	   return montos; 
    }

}
