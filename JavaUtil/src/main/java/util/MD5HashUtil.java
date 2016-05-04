package util;

import java.security.MessageDigest;

public class MD5HashUtil {
	
	
	/***
	 * Retorna o do MD5 Hash 
	 * @param md
	 * @return
	 */
	public String resultHashMD5(MessageDigest md){
		byte byteData[] = md.digest();
		 
        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
    	for (int i=0;i<byteData.length;i++) {
    		String hex=Integer.toHexString(0xff & byteData[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}    	
    	return hexString.toString();
	}

}
