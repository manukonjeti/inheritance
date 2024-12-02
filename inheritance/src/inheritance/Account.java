package inheritance;



public class Account {
	
		
		
		private String accno;
		String name;
		String phonenum;
		String address;
		int balance;
		public String getaccno() {
			return accno;
		}
		public String getname() {
			return name;
		}
		public String getphonenum() {
			return phonenum;
		}
		
		@Override
		public String toString() {
			return  "Account{accno='" + getaccno() + "', name='" + getname() + "', phonenum='" + getphonenum() +  "}";
		}
		public  Account( String accno,String name,String phonenum) {
			this.accno = accno;
		    this.name = name;
		    this.phonenum = phonenum;
		
		}
		
	}
	 
	class savingaccount extends Account{
		public savingaccount(String accno, String name, String phonenum) {
	        super(accno, name, phonenum);
	    }
		
		

	}
	 class loanaccount extends Account{
		 public loanaccount(String accno, String name, String phonenum) {
		        super(accno, name, phonenum);
		    }
		 
		public String repayAmount() {
		return " loan is cleared";
		
	}
	public class inheritancedemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account sc=new Account("aaa","Manisha","98");	
			savingaccount acc=new savingaccount ("aaa","happy","9200");
			System.out.println(sc.toString());

		}

	}
	}


