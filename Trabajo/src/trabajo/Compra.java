package trabajo;


import java.util.ArrayList;



public class Compra {
	
     private String nombre; 
     private String id; 
     private int cost; 
      
     

	public Compra(String nombre, String id, int cost) {
    	 this.nombre = nombre; 
    	 this.id = id; 
    	 this.cost = cost; 
    	  
     }
     
     public String getname() {
    	 return nombre; 
     }
     
     public String getid() {
    	 return id; 
     }
     
     public int getcost() {
    	 return cost; 
     }
     
     
    @Overdrive
    
    public String toString() {
    	return "[" + "nombre: " + nombre + ", costo: " +"$"+ cost + " ,id: " + id + "]"; 
    }
    
	ArrayList <Compra> compras = new ArrayList <>();
	
    public boolean addname(Compra compra) {
   	 boolean status; 
   	 status = compras.add(compra);
	return status;  
    }
    
    public ArrayList <Compra> compra() {
   	 return compras; 
    }

	public Compra get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

    
    	
}
 