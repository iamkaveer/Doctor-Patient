package com.doctorpatient.Controller;

import com.doctorpatient.Model.Patient;
import com.doctorpatient.Service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    //add patient
    @PostMapping("/create-patient")
    public ResponseEntity<Patient> createPatient(@RequestBody @Valid Patient patient){
        return new ResponseEntity<>(patientService.createPatient(patient), HttpStatus.CREATED);
    }
}
