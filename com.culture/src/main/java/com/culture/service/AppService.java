package com.culture.service;

import java.util.List;


import org.springframework.data.domain.Page;

import com.culture.Entity.Celebrite;
import com.culture.Entity.Departement;
import com.culture.Entity.Lieu;
import com.culture.Entity.Monument;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public interface AppService {
//	Monument methodes
	public Monument saveMonument(Monument monument);
	
	
	
	
	
//	Lieu methodes
	public Lieu saveLieu(Lieu lieu);
	
//	Departement methodes
	public Departement saveDepartement(Departement departement);


//	Celebrite methodes
	public Celebrite saveCelebrite(Celebrite celebrite);


}
