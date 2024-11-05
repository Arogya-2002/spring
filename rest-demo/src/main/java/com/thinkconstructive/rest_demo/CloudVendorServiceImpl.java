package com.thinkconstructive.rest_demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
	
	CloudVendorRepository cloudVendorRepository;
	

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(int Id,CloudVendor cloudVendor) {
		CloudVendor c =cloudVendorRepository.findById(Id).orElseThrow(() -> new RuntimeException("not found"));
		c.setVendorId(cloudVendor.getVendorId());
		c.setVendorName(cloudVendor.getVendorName());
		c.setVendorAddress(cloudVendor.getVendorAddress());
		c.setVendorPhoneNumber(cloudVendor.getVendorPhoneNumber());
		cloudVendorRepository.save(c);
		return "success";
	}

	@Override
	public String deleteCloudVendor(int cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(int cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepository.findAll();
	}

}
