
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamerManager gamerManager = new GamerManager(new NewEStateUserValidationManager());
		gamerManager.add(new Gamer(1,"FEYZA","SAKA",1996,12345));
		
	}
}
