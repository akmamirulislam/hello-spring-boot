package com.example.curd.service;

import java.util.ArrayList;
import java.util.List;

import com.example.curd.model.Patient;
import com.example.curd.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

	@Qualifier("patientRepository")
	@Autowired
	PatientRepository patientRepository;

	@Override
	public void addPatient(Patient patient) {
		// save patient
		patientRepository.save(patient);
	}

	@Override
	public void updatePatient(Patient patient) {
		// update patient
		patientRepository.save(patient);
	}


	@Override
	public Patient getPatient(int id) {
		// TODO Auto-generated method stub
		 return null;
		//return patientRepository.;
		
	}	
	
	@Override
	public List<Patient> getAllPatient() {
		// patient array list
		List<Patient> patients = new ArrayList<>();
		patientRepository.findAll().forEach(patients::add);
		// return patient array list
		return patients;
	}

	@Override
	public void deletePatient(int id) {
		// delete patient profile
		patientRepository.deleteById(id);
		
	}

}
