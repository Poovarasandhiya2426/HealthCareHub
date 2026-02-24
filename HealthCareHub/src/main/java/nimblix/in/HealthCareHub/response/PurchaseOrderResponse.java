package nimblix.in.HealthCareHub.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PurchaseOrderResponse {

    private Long id;
    private String medicineName;
    private Integer quantity;
    private String status;
    private LocalDate orderDate;
    private Long vendorId;
    private String vendorName;
}