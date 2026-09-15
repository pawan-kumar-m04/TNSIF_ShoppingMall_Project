package org.tnsif.acc.c2tc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.acc.c2tc.entity.MallAdmin;
import org.tnsif.acc.c2tc.repository.AdminRepository;

@Service
public class MallAdminService {
	@Autowired
	public AdminRepository repo;
	
	MallAdminService(AdminRepository repo){
		this.repo= repo;
	}
	
	// add
	public MallAdmin addAdmin(MallAdmin mallAdmin) {
		
		return repo.save(mallAdmin);
	}
	
	// update
	public MallAdmin updateAdmin(MallAdmin mallAdmin) {
		return repo.save(mallAdmin);
	}
	
	// search
	public MallAdmin searchAdmin(int id) {
		return repo.findById(id).orElse(null);
	}
	
	// delete
	public MallAdmin deleteAdmin(int id) {
		MallAdmin temp = repo.findById(id).orElse(null);
		if(temp != null) {
			repo.deleteById(id);
		}
		return temp;
	}
}
