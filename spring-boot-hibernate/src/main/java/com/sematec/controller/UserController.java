package com.sematec.controller;

import java.util.List;

import com.sematec.model.ActorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sematec.service.ActorService;

@Controller
public class UserController {
	
	@Autowired
	private ActorService actorService;
	
	@RequestMapping(value = "/listActor", method = RequestMethod.GET)
	public ResponseEntity<List<ActorEntity>> userDetails() {
        
		List<ActorEntity> userDetails = actorService.getActorList();
		return new ResponseEntity<List<ActorEntity>>(userDetails, HttpStatus.OK);
	}

}
