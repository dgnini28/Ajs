package com.service;

import java.util.List;

import com.pojos.ClientPojo;
import com.pojos.UserPojo;

public interface ServiceInt {

	public  void  addUser(UserPojo user);
	public  void  updateUser(int id,UserPojo user);
	public  void  deleteUser(int id);
	public  UserPojo[]  viewAllUsers();
	public UserPojo getUserById(int userid);
	public  void  addClient(ClientPojo client);
	public  void  updateClient(String name,ClientPojo client);
	public  ClientPojo[]  deleteClient(String clientName);
	public  ClientPojo[]  viewAllClient();
	public ClientPojo getClientByIb(String clientName);
	
}
