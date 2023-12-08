package NumberGame;

import java.security.SecureRandom;


public class RandomNumberGenerator {
    public static int randomGuess() {
        SecureRandom randomNumber = new SecureRandom();
        return 1 + randomNumber.nextInt(100);
    }

}
