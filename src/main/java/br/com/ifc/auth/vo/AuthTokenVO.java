package br.com.ifc.auth.vo;

import java.io.Serializable;

/**
 * Token
 * 
 * @author thiago.colombo
 *
 */
public class AuthTokenVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String token;

	private String type;

	public AuthTokenVO(String token, String type) {
		this.token = token;
		this.type = type;
	}

	public String getToken() {
		return token;
	}

	public String getType() {
		return type;
	}
	
	public String parserTokenHeader() {
		StringBuilder builder = new StringBuilder();
		builder.append(type != null && type.length() > 1 ? (type.substring(0, 1).toUpperCase() + type.substring(1, type.length()).toLowerCase()) : type)
			   .append(" ")
			   .append(token);
		return builder.toString();
	}
}
