package com.RestApiProject1.packages.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CloudVenderInfo")
public class CloudVender {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	Long venderId;
	String venderName, venderAddress;
	Long venderNumber;

	public CloudVender(Long venderId, String venderName, String venderAddress, Long venderNumber) {
		super();
		this.venderId = venderId;
		this.venderName = venderName;
		this.venderAddress = venderAddress;
		this.venderNumber = venderNumber;
	}

	public CloudVender() {
		
	}

	public Long getVenderId() {
		return venderId;
	}

	public void setVenderId(Long venderId) {
		this.venderId = venderId;
	}

	public String getVenderName() {
		return venderName;
	}

	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}

	public String getVenderAddress() {
		return venderAddress;
	}

	public void setVenderAddress(String venderAddress) {
		this.venderAddress = venderAddress;
	}

	public Long getVenderNumber() {
		return venderNumber;
	}

	public void setVenderNumber(Long venderNumber) {
		this.venderNumber = venderNumber;
	}


}
