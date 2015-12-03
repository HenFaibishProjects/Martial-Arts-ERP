package com.hen.id;

 
public abstract class Abstractsaleitem 
{
    String name; 
	String barode;
	int purchesPrice;

	
    public Abstractsaleitem( String name , String barode ,int purchesPrice ) {
        this.name = name;
        this.barode = barode;
        this.purchesPrice = purchesPrice;
      }
                  
	    public Abstractsaleitem( String barode) {
	    	this.barode = barode;
    }
}


