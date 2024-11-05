package com.thinkconstructive.rest_demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

CloudVendorService cloudVendorService;
	
	
public CloudVendorController(CloudVendorService cloudVendorService) {
	this.cloudVendorService = cloudVendorService;
}


//read specific vendor
@GetMapping("/{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable int vendorId) {
	return cloudVendorService.getCloudVendor(vendorId);
	}

//read all vendors from database

@GetMapping
public List<CloudVendor> getAllCloudVendorDetails(){
	return cloudVendorService.getAllCloudVendors();
}



@PostMapping
public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
	cloudVendorService.createCloudVendor(cloudVendor);
	return "Cloud Vendor Created Successfully";
}
@PutMapping("/{vendorId}")
public String updateCloudVendorDetails(@PathVariable int vendorId,@RequestBody CloudVendor cloudVendor)
{
	cloudVendorService.updateCloudVendor(vendorId,cloudVendor);
	return "Cloud Vendor Updated Successfully";
}
@DeleteMapping("/{vendorID}")
public String deleteCloudVendorDetails(@PathVariable int vendorID)
{
	cloudVendorService.deleteCloudVendor(vendorID);
	return "Cloud Vendor Deleted Successfully";
}

}
