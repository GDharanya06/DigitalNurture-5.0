package week1;

     public class Singleton {
	

	    	    private static Singleton instance = new Singleton();

	    private Singleton() {
	    }

	  	    public static Singleton getInstance() {
	        return instance;
	    }

	    public void display() {
	        System.out.println("Singleton object created.");
	    }


	    public static void main(String[] args) {

	        Singleton obj1 = Singleton.getInstance();
	        Singleton obj2 = Singleton.getInstance();

	        obj1.display();

	        if (obj1 == obj2) {
	            System.out.println("Both objects are the same.");
	        } else {
	            System.out.println("Different objects.");
	        }
	    }
	}

	
