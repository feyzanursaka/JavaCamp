

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean Validate(Gamer gamer) {
		// TODO Auto-generated method stub
		if (gamer.getBirthYear() == 1996)
            {
                return true;
            }
            else
            {
                return false;
            }
	}

}
