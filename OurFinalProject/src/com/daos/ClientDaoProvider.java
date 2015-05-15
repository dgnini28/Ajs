package com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pojos.ClientPojo;
@Repository
public class ClientDaoProvider implements ClientDaoInt {
	
	
	EntityManager entitymanager;
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("almpr");
	
	static
	{
		System.out.println("in client dao");
	}
	

	@Override
	public void addClient(ClientPojo client) {
		
		System.out.println("inside dao **");
		 if(emfactory!=null)
		 {
		 System.out.println("created");
		 }
		 
		 EntityManager entitymanager = emfactory.createEntityManager( );
		  
	      entitymanager.getTransaction( ).begin( );
	      entitymanager.persist(client);
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );


	}

	@Override
	public void updateClient(String name, ClientPojo client) {
		
		 EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      ClientPojo cl = entitymanager.find( ClientPojo.class, name );
	      cl.setClnt_name(name);
	      cl.setClnt_address(client.getClnt_address());
	      cl.setClnt_ceo(client.getClnt_ceo());
	      cl.setClnt_contact(client.getClnt_contact());
	      cl.setClnt_domain(client.getClnt_domain());
	      cl.setClnt_email(client.getClnt_email());
	      cl.setClnt_empnum(client.getClnt_empnum());
	      cl.setClnt_name(client.getClnt_name());
	      cl.setClnt_offices(client.getClnt_offices());
	      cl.setClnt_revenue(client.getClnt_revenue());
	      cl.setClnt_status(client.getClnt_status());
	      
	      
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close();


	}

	@Override
	public ClientPojo[] deleteClient(String name) {
		EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	      ClientPojo cl = entitymanager.find( ClientPojo.class, name );
	      entitymanager.remove( cl );
	      entitymanager.getTransaction( ).commit( );
	     return viewAllClient();


	}

	@Override
	public  ClientPojo[] viewAllClient() {
		System.out.println("in the viewAll clents method");
		EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      System.out.println("After transaction");
	      Query q = entitymanager.createQuery("SELECT i FROM ClientPojo i");
			List<ClientPojo> list = q.getResultList();
		return (list.toArray( new ClientPojo[0]));
	}

	@Override
	public ClientPojo getClientByName(String name) {
		EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	      ClientPojo cl = entitymanager.find( ClientPojo.class, name );
	      entitymanager.getTransaction( ).commit( );
	     return cl;
	}

}
