package com.sematec.controller;

import java.util.List;

import com.sematec.model.ActorEntity;
import com.sematec.model.FilmCategoryEntity;
import com.sematec.model.FilmEntity;
import com.sematec.model.PersonEntity;
import org.hibernate.Session;
import org.hibernate.jpa.QueryHints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sematec.service.ActorService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Controller
public class UserController {
	
	@Autowired
	private ActorService actorService;

	@PersistenceContext
	private EntityManager em;
	
	@RequestMapping(value = "/listActor", method = RequestMethod.GET)
	public ResponseEntity<List<ActorEntity>> userDetails() {
        
		List<ActorEntity> userDetails = actorService.getActorList();
		return new ResponseEntity<List<ActorEntity>>(userDetails, HttpStatus.OK);
	}

	@RequestMapping(value = "/InsertStaff", method = RequestMethod.POST)
	public boolean insertStaff(){
		try {
			PersonEntity personEntity = new PersonEntity();
			personEntity.setFirstName("Hana");
			personEntity.setLastName("Bizhani");
			personEntity.setEmail("hanabizhani@gmail.com");
/*
			StafftEntity stafftEntity = new StafftEntity();
			stafftEntity.setUsername("hanabizhani");
			stafftEntity.setPassword("123456");*/
			return true;
		}catch (Exception ex){
			return false;
		}
	}

	@RequestMapping(value = "/selectDistinct", method = RequestMethod.GET)
	public ResponseEntity<List<FilmCategoryEntity>> selectDistinct(){
		TypedQuery query = em.
				createQuery("select Distinct a from FilmCategoryEntity a Join Fetch a.categoryId",
						FilmCategoryEntity.class);
		query.setHint(QueryHints.HINT_PASS_DISTINCT_THROUGH, false);
		List<FilmCategoryEntity> filmCategoryList = query.getResultList();
		for (FilmCategoryEntity a : filmCategoryList) {
			System.out.println("CategoryId: " + a.getCategoryId());
		}
		return new ResponseEntity<List<FilmCategoryEntity>>(filmCategoryList, HttpStatus.OK);
	}


}
