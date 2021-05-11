

public class NewEStateUserValidationManager implements UserValidationService{

	@Override
	public boolean Validate(Gamer gamer) {
		// TODO Auto-generated method stub
		if (gamer.getBirthYear() == 1996 && gamer.getFirstName() == "FEYZA"
                && gamer.getLastName() == "SAKA" && gamer.getIdentityNumber() == 12345)
            {
                return true;
            }
            else
            {
                return false;
            }
	}
	
	
}
