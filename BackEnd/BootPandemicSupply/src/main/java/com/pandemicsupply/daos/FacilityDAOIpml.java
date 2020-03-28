package com.pandemicsupply.daos;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pandemicsupply.entities.Facility;
import com.pandemicsupply.repository.FacilityRepository;

@Service
public class FacilityDAOIpml implements FacilityDAO {
	
	@Autowired
	private FacilityRepository facilityRepo;
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Facility findFacilityById(int id) {
		Optional<Facility> facility = facilityRepo.findById(id);
		if (facility.isPresent()) {
			return facility.get();
		} else {
			return null;
		}
	}
	

}
