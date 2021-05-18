
public class UserValidationManager implements UserValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		
		if(gamer.getBirthYear() == 1994 && gamer.getFirstName() == "Sinem" && gamer.getLastName()=="Erol" &&gamer.getIdentityNumber()==1234) {
			
			
			return true;
			
			
		}
		else {
			
			return false;
		}
		
		
	}

}
