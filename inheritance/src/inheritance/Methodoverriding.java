package inheritance;

 class Tv{
	
		public String switchon() {
			return "switch on tv ";
		}
		public String switchoff() {
			return "switch off tv ";
		}
	}
	

	class smartTv extends Tv{
		//override method is switch on tv
		@Override
		public String switchon() {
			return "switch on smarttv ";
		}

		
	}	
	public class Methodoverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// getting values from parent class
		smartTv sc= new smartTv();
		
		System.out.println(sc.switchoff());  // Calls the switchoff method from Tv
        System.out.println(sc.switchon()); 
// dynamic dispatch
        Tv s= new smartTv();
        System.out.println(sc.switchon());/// refers to the object  so prints child class element
        
	}
	}
	
