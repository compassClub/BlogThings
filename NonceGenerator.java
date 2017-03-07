import java.security.SecureRandom;

/**
 * Created by compassClub on 3/7/17.
 */

//A Nonce is a number only used once
public class NonceGenerator {
    public static void main (String args[]){
        System.out.println(nonceGenerator());

    }

    public static String nonceGenerator(){
//              Constructs a secure random number generator. By passing no parameters
//                  we are implementing the default random number algorithm.
        SecureRandom secureRandom = new SecureRandom();

//              Since we are returning a string, we will use a StringBuilder
//                  to concatenate the nonce together.
        StringBuilder stringBuilder = new StringBuilder();

//        We generate 20 integers.
        for (int i = 0; i < 20; i++){
            stringBuilder.append(secureRandom.nextInt(21));
//                  The bound '21', sets the upper limit on the numbers that can be returned to 20.
        }

        String randomNumber = stringBuilder.toString();

        return randomNumber;
    }
}
