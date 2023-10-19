/**
 * @author Noah - Arterburn
 * CIS175 - Fall 2023
 * Oct 13, 2023
 */
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.cat;

public class catsHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cats");
	
	public void persist(cat model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(cat model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(cat.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<cat> showAllcats() {
		EntityManager manager = factory.createEntityManager();
		List<cat> allItems = manager.createQuery("SELECT i FROM cats i").getResultList();
		manager.close();

		return allItems;
	}
	
	public void update(cat model) {
		EntityManager manager = factory.createEntityManager();
		cat dbEntity = manager.find(cat.class, model.getRowId());
		manager.getTransaction().begin();
		dbEntity.setbreedName(model.getbreedName());
		dbEntity.setName(model.getName());
		dbEntity.setavgSize(model.getavgSize());
		manager.getTransaction().commit();
		manager.close();
		
	}
	
	public cat searchcatByName(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<cat> query = manager.createQuery("SELECT i FROM cats AS i WHERE i.Name = :Name", cat.class);
		query.setParameter("Name", oldName);
		cat dbEntity = query.getSingleResult();
		return dbEntity;
	}
}
