package com.daos;

import java.util.List;

import com.pojos.ClientPojo;

public interface ClientDaoInt {
	public  void  addClient(ClientPojo client);
	public  void  updateClient(String name,ClientPojo client);
	public  ClientPojo[]  deleteClient(String name);
	public  ClientPojo[]  viewAllClient();
	public ClientPojo getClientByName(String name);
	
}
