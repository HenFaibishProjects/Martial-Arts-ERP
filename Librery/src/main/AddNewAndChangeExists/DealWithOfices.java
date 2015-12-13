package AddNewAndChangeExists;
import offices.AbstractOffice;
import offices.Energy;
import offices.Premium;

public class DealWithOfices {

public void NewOffice(int Typeofoffice) {
       switch (Typeofoffice) 
       {
       case 1:
		AbstractOffice e1 = new Energy(null, null, null, null); 
       case 2:
			AbstractOffice p1 = new Premium(null, null, null, null, null);
       }
       }

public void DeleteOffice(int officeid) {
    
    
    }

public void ChangeOfficeAddress(int Typeofoffice) {
  
      }


public void ChangeOfficePhone(int Typeofoffice) {
	  
}

public void ChangeOfficeType(int Typeofoffice) {
	  
}
}