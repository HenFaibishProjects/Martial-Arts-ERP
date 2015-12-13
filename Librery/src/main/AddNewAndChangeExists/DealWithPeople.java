package AddNewAndChangeExists;

import people.AbstractPeople;
import people.Clients;
import people.Employees;
import people.Suppliers;

public class DealWithPeople {

public void NewOffice(int TypeofPeople) {
       switch (TypeofPeople) 
       {
       case 1:
		AbstractPeople p1 = new Clients(null, null, null, (Integer) null); 
       case 2:
    	   AbstractPeople p2 = new Employees(null, null, null, null, (Integer) null);
       case 3:
    	   AbstractPeople p3 = new Suppliers(null, null, null, null, (Integer) null);
       }
       }



// *** Clients ********
public void DeleteClient(int clientid) {
    
    
    }

public void ChangeClientAddress(int clientid) {
          
	    
      }


public void ChangeClientPhone(int clientid) {
	  
}

public void ChangeClientMemberType(int clientid) {
	  
}

// ****** Employees




// ***** Suply ******


}