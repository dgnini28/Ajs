package com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;






import org.springframework.stereotype.Repository;

import com.pojos.ClientPojo;
import com.pojos.UserPojo;

@Repository
public class UserDaoProvider implements UserDaoInt {
	
	

	EntityManagerFactory emfactory = Persistence
			.createEntityManagerFactory("almpr");
	
	static
	{
		System.out.println("in user dao");
	}


	@Override
	public void addUser(UserPojo user) {
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		UserPojo u = new UserPojo();
		u.setUser_email(user.getUser_email());
		u.setUser_id(user.getUser_id());
		u.setUser_name(user.getUser_name());
		u.setUser_pass(user.getUser_pass());

		entitymanager.persist(u);
		entitymanager.getTransaction().commit();

		entitymanager.close();

	}

	@Override
	public void updateUser(int id, UserPojo user) {
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		UserPojo u = entitymanager.find(UserPojo.class, id);
		u.setUser_email(user.getUser_email());
		u.setUser_id(user.getUser_id());
		u.setUser_name(user.getUser_name());
		u.setUser_pass(user.getUser_pass());
		entitymanager.persist(u);
		entitymanager.getTransaction().commit();
		entitymanager.close();
	}

	@Override
	public void deleteUser(int id) {
		EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	      UserPojo cl = entitymanager.find(UserPojo.class, id );
	      entitymanager.remove( cl );
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close( );
	      

	}

	@Override
	public UserPojo[] viewAllUsers() {
		EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	      List<UserPojo> userClients = entitymanager.createQuery(
	              "SELECT p FROM UserPojo p").getResultList();
	      entitymanager.getTransaction().commit();
	      entitymanager.close(); 
		return userClients.toArray(new UserPojo[0]);
	}

	@Override
	public UserPojo getUserById(int id) {
		EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      UserPojo cl = entitymanager.find(UserPojo.class, id );
	      entitymanager.getTransaction().commit();
	      entitymanager.close(); 
		return cl;
	}

}
