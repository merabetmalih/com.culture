package com.culture.Repository;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.culture.Entity.Monument;


@Repository
public interface MonumentRepository extends JpaRepository<Monument, String> {
	
	Page<Monument> findByNomMContains(String kw,Pageable pageable);
	
	@Query("select m from Monument m")
	Page<Monument> getAllMonument(org.springframework.data.domain.Pageable pageable);
	

}
