package trabajo;
import java.util.*;
public class Sistema {
	
	private static Scanner key = new Scanner(System.in); 
    private static Compra key1 = new Compra(null, null, 0);
    private static Arqueo key2 = new Arqueo();
    private static Monto key3 = new Monto(); 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
       int opcion = 0;
       
        
        
      
        do {
        	System.out.println("1. inicio como administrador");
            System.out.println("2. Inicio como usuario");
            System.out.println("3. Salir");
            opcion= key.nextInt(); 
         
            
             
        	switch(opcion) {
         
        	case 1 : {
 
               setmonto();
        	
             break;
			}
        	
        	
        	case 2 : {
        		    
        		do {
        			        			
            		System.out.println("1. Agregar compra");
            		System.out.println("2. Historial");
            		System.out.println("3. Dar alta");
            		System.out.println("4. Arqueo");
            		System.out.println("5. Salir");
                    
            		opcion = key.nextInt(); 
            	    switch(opcion) {
            	    
            	    case 1 : {
            	    	addproduct(); 
            	    	break; 
            	    }
            	    
            	    case 2 : {
            	    	getall(); 
            	    	break; 
            	    }
            	    case 3 : {
            	    	alta();
            	    	break; 
            	    }
            	    
            	    case 4 : {
            	    	getarqueo(); 
            	    	break; 
            	    }
            	    
            	    case 5 : {
            	    	System.out.println("has saldido del programa"); 
            	    	break; 
            	    }
            	    
            	    default: {
            	    	System.out.println("ingresa otra opcion");
            	    	break; 
            	    }
            	    }
            	   
                 
            	}while(opcion != 5); 
        		break; 
        	 }    
        	 
        	
        	
        	case 3 : {
        		System.out.print("has salido");
        		break; 
        	}
        	
        	}
        	
        }while(opcion != 3); 
     
	
	}
	
	public static void setmonto() {
		int monto; 
		
		System.out.println("ingresa el monto"); 
		monto = key.nextInt(); 
		Monto montos = new Monto(monto); 
		
		if(key3.getmonto(montos)) {
			System.out.println("monto ingresado");
		}else {
			System.out.println("monto no ingresado");
		}
		
		
	}
     
    public static void addproduct() {
    	String nombre; 
    	String id;  
    	int cost; 
    	
    	
    	
    	 ArrayList <Arqueo> arque = new ArrayList<>();
    	 
    	  
    	
    	System.out.println("ingresa el costo: "); 
        cost = key.nextInt(); 
        key.nextLine(); 
        System.out.println("ingresa el nombre del producto: ");
        nombre = key.nextLine(); 
        System.out.println("ingresa el id: ");
        id = key.nextLine();
        Compra compra = new Compra(nombre, id, cost);
        
        ArrayList <Compra> compras; 
        compras = key1.compra(); 
        
        
        
        if(key1.addname(compra)) {
        	System.out.println("compra exitosa");
        }else {
        	System.out.println("error");
        	
        }
        
        
    }
    
    public static void getall() {
    	
    	ArrayList <Compra> lista; 
    	  
    	lista = key1.compra();  
    	
    	ArrayList<Compra> lista1 = null;
    	
		for(int i=0; i<lista.size();i++ ) {
    		lista1 = lista; 
    	}
    	
    	for(int i=0;i<lista.size();i++) {
    		System.out.println(lista1.get(i));
    	}
    	
    	
    	
    }
    
    public static void alta() {
    	String id; 
    	String nombre; 
    	int op;

        ArrayList <Compra> lista; 
        lista = key1.compra(); 
        ArrayList <Compra> lista3 = new ArrayList<>();
         
        
        System.out.println("ingresa el id");
    	id = key.nextLine(); 
    	key.nextLine(); 
    	System.out.println("ingresa el nombre");
        nombre = key.nextLine();
        
        
    	for(int i=0;i<lista.size();i++) {
    		if(lista.get(i).getname().contains(nombre)&& lista.get(i).getid().contains(id)) {
    		
    			lista3.addAll(lista); 
    			
    	        System.out.println("mostrar lista de arqueo: (si:1/no:2)");
    	    	op = key.nextInt(); 
    			if(op == 1) {
    	        
    	        System.out.println(lista3.get(i));
    	        
    	    	}else if(op == 2) {
    	        	System.out.println("ok");
    	    	}
    		}else {
    			System.out.println("no se ha encontreado el producto: ");
    		}
    	 
        }	

    	} 
         
    public static void getarqueo() {
    	 int cost = 0;  

    	 ArrayList <Arqueo> arque = key2.retunarqueo(); 
   	  
         
		ArrayList <Compra> compras = key1.compra(); 
      
		Compra compra = new Compra(null, null, cost); 
        Arqueo cierre = new Arqueo(); 
          
         for(int i=0;i<compras.size();i++) {
             cierre.add(compras.get(cost));
              arque.add(cierre);
              
             }         
    	for(int i=0;i<compras.size();i++) {
    		 
			System.out.println(arque.get(i));
    	}
    	   
    }
	
    }
