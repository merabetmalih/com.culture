package com.culture.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.culture.Entity.Celebrite;

@Repository
public interface CelebriteRepository extends JpaRepository<Celebrite, String> {
	
	@Query("select c from Celebrite c where  c.nom like CONCAT('%',:x,'%')")
	public List<Celebrite> getByNameContaining(@Param("x") String nom);

	@Query("select c from Celebrite c where  c.numCelebrite = :x")
	public Celebrite getCelebriteById(@Param("x") long numCelebrite);

}
