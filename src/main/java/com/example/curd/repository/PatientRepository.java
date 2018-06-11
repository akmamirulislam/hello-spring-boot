/**
 * 
 */
package com.example.curd.repository;
import com.example.curd.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Integer>{}
