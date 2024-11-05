package com.thinkconstructive.rest_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendoe_info")
public class CloudVendor {
	@Id
	private int vendorId;
	private String vendorName;
	private String VendorAddress;
	private String vendorPhoneNumber;
	public CloudVendor() {
		
	}
	public CloudVendor(int vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		VendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return VendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		VendorAddress = vendorAddress;
	}
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}
	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
}
