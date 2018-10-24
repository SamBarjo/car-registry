package ca.ulaval.glo4002.carregistry.infrastructure.persistence;

import java.util.Collection;

import javax.persistence.EntityManager;

import ca.ulaval.glo4002.carregistry.domain.CarOwner;
import ca.ulaval.glo4002.carregistry.domain.CarOwnerId;
import ca.ulaval.glo4002.carregistry.domain.CarRegistry;

public class HibernateCarRegistry implements CarRegistry {

	@Override
	public CarOwner findOwner(CarOwnerId ownerId) {
	    EntityManager entityManager = EntityManagerProvider.getEntityManager();
		return entityManager.find(CarOwner.class, ownerId.toInteger());
	}

	@Override
	public void insert(CarOwner owner) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(owner);
		entityManager.getTransaction().commit(); // in try/finally ideally
	}

	@Override
	public void update(CarOwner owner) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(owner);
		entityManager.getTransaction().commit(); // in try/finally ideally
	}

	@Override
	public Collection<CarOwner> findAllOwners() {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
		return entityManager.createQuery("select o from CarOwner o", CarOwner.class).getResultList();
	}

}
