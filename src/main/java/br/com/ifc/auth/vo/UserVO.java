package br.com.ifc.auth.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * User
 * @author thiago.colombo
 *
 */
public class UserVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Name
	 */
	private String name;
	
	/**
	 * Password
	 */
	private String password;
	
	/**
	 * Rules
	 */
	private Set<String> rules;
	
	/**
	 * Construct
	 */
	public UserVO() {
		this.rules = new HashSet<>();
	}
	
	/**
	 * Construct
	 * @param name
	 * @param password
	 */
	public UserVO(String name, String password) {
		this();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRules() {
		return rules;
	}

	public void setRules(Set<String> rules) {
		this.rules = rules;
	}	
}