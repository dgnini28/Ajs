package com.daos;

import java.util.List;

import com.pojos.UserPojo;


public interface UserDaoInt {

	public  void  addUser(UserPojo user);
	public  void  updateUser(int id,UserPojo user);
	public   void deleteUser(int id);
	public  UserPojo[]  viewAllUsers();
	public UserPojo getUserById(int id);
	
	
}
