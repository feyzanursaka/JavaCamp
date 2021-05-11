

public class GamerManager implements GamerService{
	
	private UserValidationService userValidationService;
	
	

	public GamerManager(UserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		// TODO Auto-generated method stub
		if(userValidationService.Validate(gamer)) {
			System.out.println("Oyuncu eklendi: " + gamer.getFirstName());
		}else {
			System.out.println("Ekleme iþlemi baþarýsýz. ");
		}
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println("Oyuncu güncellendi: " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println("Oyuncu silindi: " + gamer.getFirstName());
		
	}

}
