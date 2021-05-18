
public class OrderManager implements OrderService {

	
	
	
	CampaignService campaignService;
	

	public OrderManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}

	public void order(Gamer gamer,Game game,Campaign campaign) {
		
		
	  campaignService.add(campaign);
	 System.out.println(gamer.getFirstName()+" isimli oyuncu " + game.getName()+ " isimli oyunu % " +campaign.getDiscount() +"indirimle aldý" );
	}

	
	
}
