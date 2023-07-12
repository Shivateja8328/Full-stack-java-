package com.crudapi.crudapi.Controller;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class UserDetails {
    private String id;
    private String consultantName;
    private String submissionDate;
    private String leadName;
    private String vendorName;
    private String salesPerson;
    private double rate;
    private String technology;
    
    

    public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getConsultantName() {
		return consultantName;
	}



	public void setConsultantName(String consultantName) {
		this.consultantName = consultantName;
	}



	public String getSubmissionDate() {
		return submissionDate;
	}



	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}



	public String getLeadName() {
		return leadName;
	}



	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}



	public String getVendorName() {
		return vendorName;
	}



	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}



	public String getSalesPerson() {
		return salesPerson;
	}



	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}



	public double getRate() {
		return rate;
	}



	public void setRate(double rate) {
		this.rate = rate;
	}



	public String getTechnology() {
		return technology;
	}



	public void setTechnology(String technology) {
		this.technology = technology;
	}



	public UserDetails(String id, String consultantName, String submissionDate, String leadName, String vendorName,
			String salesPerson, double rate, String technology) {
		this.id = id;
		this.consultantName = consultantName;
		this.submissionDate = submissionDate;
		this.leadName = leadName;
		this.vendorName = vendorName;
		this.salesPerson = salesPerson;
		this.rate = rate;
		this.technology = technology;
	}



	
}
