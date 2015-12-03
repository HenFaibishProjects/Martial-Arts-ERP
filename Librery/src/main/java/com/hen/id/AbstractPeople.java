package com.hen.id;

 
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
}
