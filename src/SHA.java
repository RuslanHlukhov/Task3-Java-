import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHA   {
	public  void sha(String comPlay) throws NoSuchAlgorithmException {
	MessageDigest sha = MessageDigest.getInstance("SHA-256");			
			byte[] bytes = sha.digest(comPlay.getBytes()); 
			StringBuilder builder = new StringBuilder();
			for(byte b1 : bytes) {
				builder.append(String.format("%02X", b1));
			}
			System.out.println("HMAC: " + builder.toString());		
	}
	
	public  void key(String comPlay) throws NoSuchAlgorithmException {
		SecureRandom random = new SecureRandom();
        byte[] seed = random.generateSeed(16);
        StringBuilder builder = new StringBuilder();
        for(byte b1 : seed) {
            builder.append(String.format("%02X", b1));
        }
        String secretKey = (builder.toString());
        System.out.println(secretKey);
	      
	      
	}
}