package com.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class UserPojo {

@Id
@Column(name="user_id")
private int user_id;
@Column(name="user_name")
private String user_name;
@Column(name="user_email")
private String user_email;
@Column(name="user_pass")
private String user_pass;


public UserPojo() {
	super();
}


public UserPojo(int user_id, String user_name, String user_email,
		String user_pass) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.user_email = user_email;
	this.user_pass = user_pass;
}


public void setUser_id(int user_id) {
	this.user_id = user_id;
}


public void setUser_name(String user_name) {
	this.user_name = user_name;
}


public void setUser_email(String user_email) {
	this.user_email = user_email;
}


public void setUser_pass(String user_pass) {
	this.user_pass = user_pass;
}




public int getUser_id() {
	return user_id;
}


public String getUser_name() {
	return user_name;
}


public String getUser_email() {
	return user_email;
}


public String getUser_pass() {
	return user_pass;
}


@Override
public String toString() {
	return "UserDao [user_id=" + user_id + ", user_name=" + user_name
			+ ", user_email=" + user_email + ", user_pass=" + user_pass + "]";
}



}
