package com.thinkconstructive.rest_demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,Integer>{

	void deleteById(int cloudVendorId);


}
