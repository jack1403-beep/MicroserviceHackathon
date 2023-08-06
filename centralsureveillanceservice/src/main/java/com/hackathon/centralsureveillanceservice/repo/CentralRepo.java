package com.hackathon.centralsureveillanceservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hackathon.centralsureveillanceservice.model.CentralData;
import com.hackathon.centralsureveillanceservice.model.Disease;

public interface CentralRepo extends JpaRepository<CentralData,Integer> {
	long countByPatientDiseaseName(Disease diseases);
}
