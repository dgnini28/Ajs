package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daos.ClientDaoInt;
import com.daos.ClientDaoProvider;
import com.daos.UserDaoInt;
import com.daos.UserDaoProvider;
import com.pojos.ClientPojo;
import com.pojos.UserPojo;

import sun.print.resources.serviceui;
@Service
public class ServiceProvider implements ServiceInt {
	@Autowired
	UserDaoInt udao;
	@Autowired
	ClientDaoInt cldao;

	
	static
	{
		System.out.println("in service");
	}

	@Override
	public void addUser(UserPojo user) {
		udao.addUser(user);

	}

	@Override
	public void updateUser(int id, UserPojo user) {
		udao.updateUser(id, user);

	}

	@Override
	public UserPojo getUserById(int userid) {
	
		return udao.getUserById(userid);
	}

	@Override
	public ClientPojo getClientByIb(String name) {
		
		return cldao.getClientByName(name);
	}

	@Override
	public void deleteUser(int id) {
		
			 udao.deleteUser(id);
	}

	@Override
	public UserPojo[] viewAllUsers() {
		
		return udao.viewAllUsers();
	}

	@Override
	public void addClient(ClientPojo client) {
		System.out.println("in client service");
		cldao.addClient(client);

	}

	@Override
	public void updateClient(String name, ClientPojo client) {
		cldao.updateClient(name, client);

	}

	@Override
	public ClientPojo[] deleteClient(String clientName) {
		
		return cldao.deleteClient(clientName);
	}

	@Override
	public ClientPojo[] viewAllClient() {
		
		return cldao.viewAllClient();

	}

}
