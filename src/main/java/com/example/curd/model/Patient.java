package com.example.curd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private int patientId;
	
	@Column(name = "patient_name")
	private String patientName;	
	
	@Column(name = "patient_age")
	private int patientAge;
	
	@Column(name = "patient_address")
	private String patientAddress;
	
	@Column(name = "patient_contact_no")
	private String patientContactNo;
	
	@Column(name = "patient_email")
	private String patientEmail;

	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param patientId
	 * @param patientName
	 * @param patientAge
	 * @param patientAddress
	 * @param patientContactNo
	 * @param patientEmail
	 */
	public Patient(int patientId, String patientName, int patientAge, String patientAddress, String patientContactNo,
			String patientEmail) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientAddress = patientAddress;
		this.patientContactNo = patientContactNo;
		this.patientEmail = patientEmail;
	}


	/**
	 * @return the patientId
	 */
	public int getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the patientAge
	 */
	public int getPatientAge() {
		return patientAge;
	}

	/**
	 * @param patientAge the patientAge to set
	 */
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	/**
	 * @return the patientAddress
	 */
	public String getPatientAddress() {
		return patientAddress;
	}

	/**
	 * @param patientAddress the patientAddress to set
	 */
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	/**
	 * @return the patientContactNo
	 */
	public String getPatientContactNo() {
		return patientContactNo;
	}

	/**
	 * @param patientContactNo the patientContactNo to set
	 */
	public void setPatientContactNo(String patientContactNo) {
		this.patientContactNo = patientContactNo;
	}

	/**
	 * @return the patientEmail
	 */
	public String getPatientEmail() {
		return patientEmail;
	}

	/**
	 * @param patientEmail the patientEmail to set
	 */
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientAddress=" + patientAddress + ", patientContactNo=" + patientContactNo + ", patientEmail="
				+ patientEmail + "]";
	}


	
	
}
