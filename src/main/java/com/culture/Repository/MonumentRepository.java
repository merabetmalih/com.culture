package com.culture.Repository;

import com.culture.Entity.Monument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MonumentRepository extends JpaRepository<Monument, String> {

    Page<Monument> findByNomMContains(String kw, Pageable pageable);

    @Query("select m from Monument m")
    Page<Monument> getAllMonument(org.springframework.data.domain.Pageable pageable);

}