package org.tnsif.acc.c2tc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.acc.c2tc.entity.MallAdmin;
import org.tnsif.acc.c2tc.service.MallAdminService;

@RestController
public class MallAdminController {
	@Autowired
	public MallAdminService service;
	
	MallAdminController(MallAdminService service){
		this.service = service;
	}
	
	@PostMapping("/addAdmin")
	public MallAdmin addAdmin(@RequestBody MallAdmin mallAdmin) {
		return service.addAdmin(mallAdmin);
	}
	
	@PutMapping("/updateAdmin")
	public MallAdmin updateAdmin(@RequestBody MallAdmin mallAdmin) {
		return service.updateAdmin(mallAdmin);
	}
	
	@GetMapping("/getAdmin/{id}")
	public MallAdmin getAdmin(@PathVariable("id") int id) {
		return service.searchAdmin(id);
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	public MallAdmin deleteAdmin(@PathVariable("id") int id) {
		return service.deleteAdmin(id);
	}
}
