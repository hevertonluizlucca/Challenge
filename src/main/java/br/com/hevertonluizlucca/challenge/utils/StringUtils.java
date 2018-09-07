package br.com.hevertonluizlucca.challenge.utils;

import org.apache.commons.codec.binary.Base64;

public class StringUtils {

	 public static String encoder(String value) {
	        return new Base64().encodeToString(value.getBytes());
	    }
	    public static String decoder(String encryptedValue) {
	        return new String(new Base64().decode(encryptedValue));
	    }
	
}
