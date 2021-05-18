public class GamerManager implements GamerService {

	
	UserValidationService userValidatonService;
	
	public GamerManager(UserValidationService userValidationService) {
		
		this.userValidatonService=userValidationService;
		
	}
	@Override
	public void add(Gamer gamer)
	{
		if(userValidatonService.validate(gamer)) 
		{
			System.out.println("Kayit oldu. " + gamer.getFirstName());
        }
		
		else {System.out.println("Dogrulama basarýsýz .Kayýt baþarýsýz");}
	
	
	}

	@Override
	public void update(Gamer gamer) {
	
		System.out.println("Kayit güncellendi. " +gamer.getFirstName());
				
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Kayit silindi. " + gamer.getFirstName());
	}

}
