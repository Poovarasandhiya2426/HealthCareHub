package nimblix.in.HealthCareHub.service;

import nimblix.in.HealthCareHub.response.MedicineResponse;

import java.util.List;

public interface MedicineService {

    List<MedicineResponse> getExpiringMedicines(int days);

    List<MedicineResponse> getLowStockMedicines(int limit);

}