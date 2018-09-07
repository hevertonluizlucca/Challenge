package br.com.hevertonluizlucca.challenge.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;
	private Boolean is_enable;
	private Date register_date;
	private String name;
	private String surname;
	private String email;
	private String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(Long id, String username, String password, Boolean is_enable, Date register_date, String name,
			String surname, String email, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.is_enable = is_enable;
		this.register_date = register_date;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIs_enable() {
		return is_enable;
	}

	public void setIs_enable(Boolean is_enable) {
		this.is_enable = is_enable;
	}

	public Date getRegister_date() {
		return register_date;
	}

	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", is_enable=" + is_enable
				+ ", register_date=" + register_date + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	

}
