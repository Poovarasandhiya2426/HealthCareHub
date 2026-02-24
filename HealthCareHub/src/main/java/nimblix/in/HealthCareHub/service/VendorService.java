package nimblix.in.HealthCareHub.service;

import nimblix.in.HealthCareHub.request.VendorRequest;
import nimblix.in.HealthCareHub.response.VendorResponse;

import java.util.List;

public interface VendorService {

    VendorResponse createVendor(VendorRequest request);

    List<VendorResponse> getAllVendors();

    VendorResponse getVendorById(Long id);
}