package com.culture.service;

import javax.transaction.Transactional;

import com.culture.Repository.MonumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.culture.Entity.Celebrite;
import com.culture.Entity.Departement;
import com.culture.Entity.Lieu;
import com.culture.Entity.Monument;
import com.culture.Repository.CelebriteRepository;
import com.culture.Repository.DepartementRepository;
import com.culture.Repository.LieuRepository;

@Service
@Transactional
public class AppServiceImpl implements AppService {
	@Autowired
	private LieuRepository lieuRepository;
	
	@Autowired
	private MonumentRepository monumentRepository;

	@Autowired
	private CelebriteRepository celebriteRepository;
	
	@Autowired
	private DepartementRepository departementRepository;
	
	
	public AppServiceImpl(LieuRepository lieuRepository, MonumentRepository monumentRepository,
			CelebriteRepository celebriteRepository, DepartementRepository departementRepository) {
		super();
		this.lieuRepository = lieuRepository;
		this.monumentRepository = monumentRepository;
		this.celebriteRepository = celebriteRepository;
		this.departementRepository = departementRepository;
	}
	

	@Override
	public Monument saveMonument(Monument monument) {
		// TODO Auto-generated method stub
		return monumentRepository.save(monument);
	}

	@Override
	public Lieu saveLieu(Lieu lieu) {
		// TODO Auto-generated method stub
		return lieuRepository.save(lieu);
	}

	@Override
	public Departement saveDepartement(Departement departement) {
		// TODO Auto-generated method stub
		return departementRepository.save(departement);
	}

	@Override
	public Celebrite saveCelebrite(Celebrite celebrite) {
		// TODO Auto-generated method stub
		return celebriteRepository.save(celebrite);
	}




}
