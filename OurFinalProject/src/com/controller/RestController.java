package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojos.ClientPojo;
import com.pojos.UserPojo;
import com.service.ServiceInt;
import com.service.ServiceProvider;

@Controller
public class RestController {
	
	
	@Autowired
	ServiceInt service;
	

	@RequestMapping(value="/users",method = RequestMethod.GET)
	
	public @ResponseBody UserPojo[] getAllUsers()
	{
	UserPojo[] users=	service.viewAllUsers();
	return users;
}

@RequestMapping(value="/clients",method = RequestMethod.GET)
	public @ResponseBody ClientPojo[] getAllClient()
{

	ClientPojo[] clients=	service.viewAllClient();
	return clients;
	
}

@RequestMapping(value="/users/{userid}",method = RequestMethod.GET,headers="Accept=application/json")

public @ResponseBody UserPojo getUserById(@PathVariable (value="userid")  int userId)

{
	UserPojo user=service.getUserById(userId);
    return user;
}

@RequestMapping(value="/clients/{clientName}",method = RequestMethod.GET)

public @ResponseBody ClientPojo getClientById(@PathVariable(value="clientName") String clientName)

{
 ClientPojo client=service.getClientByIb(clientName);
 return client;
}

@RequestMapping(value="/users/{userid}",method = RequestMethod.DELETE,headers="Accept=application/json")

public @ResponseBody void deleteUserById(@PathVariable (value="userid")int userId)

{
	service.deleteUser(userId);
}



@RequestMapping(value="/clients/{clientName}",method = RequestMethod.DELETE,headers="Accept=application/json")

public @ResponseBody ClientPojo[] deleteClientById(@PathVariable (value="clientName") String clientName)

{
ClientPojo[] users=	service.deleteClient(clientName);
return users;
}

@RequestMapping(value="/clients/{clientName}",method = RequestMethod.PUT,headers="Accept=application/json")

public @ResponseBody void updateteClientByName(@PathVariable (value="clientName") String clientName,@RequestBody ClientPojo cl)

{

System.out.println(cl);
service.updateClient(cl.getClnt_name(), cl);

}
@RequestMapping(value="/clients",method = RequestMethod.POST,headers="Accept=application/json")

public @ResponseBody String addClient(@RequestBody ClientPojo cl)
{

service.addClient(cl);

return "success";
}

@RequestMapping(value="/users",method = RequestMethod.POST,headers="Accept=application/json")

public @ResponseBody String addUser(@RequestBody UserPojo cl)
{

	service.addUser(cl);
	return "success";
}

@RequestMapping(value="/updateuser/{userId}/{userName}/{userEmail}/{userPass}",method = RequestMethod.PUT,headers="Accept=application/json")

public @ResponseBody void updateUser(@PathVariable int userId,@PathVariable String userName,@PathVariable String userEmail,@PathVariable String userPass)

{
	UserPojo cl=service.getUserById(userId);
	cl.setUser_id(userId);;
	cl.setUser_name(userName);
	cl.setUser_email(userEmail);
	cl.setUser_pass(userPass);
	service.updateUser(userId, cl);
}
}
