package com.m2i.WebStoreApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.WebStoreApi.entity.UserInformations;
import com.m2i.WebStoreApi.service.UserInformationsService;

@RestController
@RequestMapping("/userinformtions")
public class UserInformationsController {

	@Autowired
	UserInformationsService uiService;
	
	
	
//	@GetMapping("/{id}")
//	public User getUserById(@PathVariable("id") int id) {
//		return uService.getById(id);
//	}
	
	@GetMapping
	public List<UserInformations> getAll(){
		return uiService.getAll();
	}
	
	@PostMapping
	public void postUser(@RequestBody UserInformations ui) {
		uiService.create(ui);
	}
	
	@PutMapping("/{id}")
	public void putUser(@PathVariable("id") int id,@RequestBody UserInformations ui) {
		uiService.update(id, ui);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		uiService.delete(id);
	}
	
}