
public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager=new GamerManager( new UserValidationManager());
		Gamer gamer=new Gamer(1,"Sinem","Erol",1994,1234);
		gamerManager.add(gamer);
		GameManager gameManager=new GameManager();
		
		Game game=new Game(1,"Sims",100);
		gameManager.add(game);
		
		Campaign campaign=new Campaign(1,"yıl sonu kampanyası",40);
		CampaignManager campaignManager=new CampaignManager();
		
		OrderManager orderManager=new OrderManager(new CampaignManager());
		orderManager.order(gamer, game, campaign);
}                   
	
}
