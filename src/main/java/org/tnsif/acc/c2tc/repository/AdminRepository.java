package org.tnsif.acc.c2tc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.acc.c2tc.entity.MallAdmin;

public interface AdminRepository  extends JpaRepository<MallAdmin,Integer>{

}
