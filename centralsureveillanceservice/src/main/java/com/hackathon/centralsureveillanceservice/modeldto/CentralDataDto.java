package com.hackathon.centralsureveillanceservice.modeldto;



import com.hackathon.centralsureveillanceservice.model.Disease;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CentralDataDto {
	
	private String patientName;
	private String patientAge;
	private String patientSex;
	private String patientCity;
	private String patientState;
	private String patientHospitalName;
	private String patientHospitalCity;
	private String patientHospitalState;
	private Disease patientDiseaseName;
	private String patientDiseaseDescription;
	private String createdBy;
}
