package com.thinkconstructive.rest_demo;

import java.util.List;

public interface CloudVendorService {
public String createCloudVendor(CloudVendor cloudendor );
public String updateCloudVendor(int vendorId,CloudVendor cloudVendor);
public String deleteCloudVendor(int cloudVendorId);
public CloudVendor getCloudVendor(int vendorId);
public List<CloudVendor> getAllCloudVendors();
}
