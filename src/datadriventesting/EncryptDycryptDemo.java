package datadriventesting;



	import org.apache.commons.net.util.Base64;

	public class EncryptDycryptDemo {

		public static void main(String[] args) {
			
		String pass="Abcd@123";
		byte[] encodePass=Base64.encodeBase64(pass.getBytes());
		System.out.println(new String(encodePass));
		
		//byte[] decodePass=Base64.decodeBase64(encodePass);
		//System.out.println(new String(decodePass));
			
		
		System.out.println(decodePass("QWJjZEAxMjM="));
		}
		
		public static String decodePass(String password) {
			byte[] decodePass=Base64.decodeBase64(password);
			return (new String(decodePass));	
		}
	}



