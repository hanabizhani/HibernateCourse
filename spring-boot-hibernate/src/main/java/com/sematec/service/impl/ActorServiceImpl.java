/**
 * 
 */
package com.sematec.service.impl;

import java.util.List;

import com.sematec.model.ActorEntity;
import com.sematec.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sematec.dao.ActorDao;

@Service
public class ActorServiceImpl implements ActorService {
	
	@Autowired
	private ActorDao actorDao;


	public List<ActorEntity> getActorList() {
		return actorDao.getActorList();

	}

}
