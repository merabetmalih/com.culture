package com.culture.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.culture.Entity.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, String>{
	
	@Query("select d from Departement d where  d.nomDep like CONCAT('%',:x,'%')")
	public List<Departement> getByNameDepartementContaining(@Param("x") String nom);



}
