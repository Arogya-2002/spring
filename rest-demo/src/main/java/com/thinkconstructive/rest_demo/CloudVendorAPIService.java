package com.thinkconstructive.rest_demo;

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
public class CloudVendorAPIService {
	CloudVendor cloudVendor;
@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
	
		return cloudVendor;
				//new CloudVendor("c1","vendor 1","Address one","xxxxx");
	}
@PostMapping
public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
	this.cloudVendor = cloudVendor;
	return "Cloud Vendor Created Successfully";
}
@PutMapping
public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
{
	this.cloudVendor = cloudVendor;
	return "Cloud Vendor Updated Successfully";
}
@DeleteMapping("{vendorID}")
public String deleteCloudVendorDetails(@PathVariable String vendorID)
{
	this.cloudVendor = null;
	return "Cloud Vendor Deleted Successfully";
}

}
