package nimblix.in.HealthCareHub.controller;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.request.AdmitPatientRequest;
import nimblix.in.HealthCareHub.response.AdmitPatientResponse;
import nimblix.in.HealthCareHub.response.LabResultResponse;
import nimblix.in.HealthCareHub.service.AdmissionService;
import nimblix.in.HealthCareHub.service.LabResultService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/patient")
@RequiredArgsConstructor
public class PatientController {

    private final AdmissionService admissionService;
    private final LabResultService labResultService;


    // Task 175 – Admission Endpoints
    // POST api/patient/admissions/admit
    @PostMapping("/admissions/admit")
    public ResponseEntity<Map<String, Object>> admitPatient(
            @RequestBody AdmitPatientRequest request) {

        AdmitPatientResponse data = admissionService.admitPatient(request);

        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.CREATED.value());
        response.put("message", "Patient admitted successfully");
        response.put("data", data);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Task 186 – Lab Result Endpoint

    // GET api/patient/lab-results/patient/{patientId}
    @GetMapping("/lab-results/patient/{patientId}")
    public ResponseEntity<Map<String, Object>> getLabResultsByPatient(
            @PathVariable Long patientId) {

        List<LabResultResponse> data = labResultService.getLabResultsByPatient(patientId);

        Map<String, Object> response = new HashMap<>();
        response.put("status", HttpStatus.OK.value());
        response.put("message", "Lab results fetched successfully");
        response.put("count", data.size());
        response.put("data", data);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
