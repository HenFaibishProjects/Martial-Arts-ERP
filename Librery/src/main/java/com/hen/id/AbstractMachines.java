package com.hen.id;

 
public abstract class AbstractMachines 
{
    String name; 
	String barode;
	int purchesPrice;

	
    public AbstractMachines( String name , String barode ,int purchesPrice ) {
        this.name = name;
        this.barode = barode;
        this.purchesPrice = purchesPrice;
      }
                  
    public AbstractMachines( String name , String barode ) {
        this.name = name;
        this.barode = barode;
        
    }
}


