package people;

 
public abstract class AbstractPeople 
{
    String name; 
	String id;
	String Phone;
	  
	
	      public AbstractPeople( String name , String id ,String phone ) {
	        this.name = name;
	        this.id = id;
	        this.Phone = phone;
	      }
	        public AbstractPeople( ) {
		      
	        }     
		        
		    public AbstractPeople( String name ,String phone ) {
			     this.name = name;
			     this.Phone = phone;
	    }
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public String getPhone() {
				return Phone;
			}
			public void setPhone(String phone) {
				Phone = phone;
			}

}
