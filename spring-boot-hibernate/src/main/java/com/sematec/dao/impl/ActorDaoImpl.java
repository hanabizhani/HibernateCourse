package com.sematec.dao.impl;

import java.util.List;

import com.sematec.model.ActorEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sematec.dao.ActorDao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Component
public class ActorDaoImpl implements ActorDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;


	public List getActorList() {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery criteria = builder.createQuery(ActorEntity.class);
		Root contactRoot = criteria.from(ActorEntity.class);
		criteria.select(contactRoot);
		return session.createQuery(criteria).getResultList();
	}

}
