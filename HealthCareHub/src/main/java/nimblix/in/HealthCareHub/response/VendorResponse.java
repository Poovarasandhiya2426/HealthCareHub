package nimblix.in.HealthCareHub.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class VendorResponse {

    private Long vendorId;
    private String vendorName;
    private String email;
    private String phone;
    private String address;
    private String gstNumber;
}