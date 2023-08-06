package com.hackathon.analysisservice.modeldto;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ResponseDto {
	
	private Map<String, Long> diseaseName;
}