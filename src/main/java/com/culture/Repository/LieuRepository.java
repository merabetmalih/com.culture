package com.culture.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.culture.Entity.Lieu;
import com.culture.Entity.Monument;

@Repository
public interface LieuRepository extends JpaRepository<Lieu, String> {
	
	
	Page<Lieu> findByNomComContains(String kw,Pageable pageable);
	
	@Query("select m from Monument m")
	Page<Lieu> getAllLieu(org.springframework.data.domain.Pageable pageable);
}

