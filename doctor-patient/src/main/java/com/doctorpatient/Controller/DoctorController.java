package com.doctorpatient.Controller;

import com.doctorpatient.Model.Doctor;
import com.doctorpatient.Service.DoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    //create a new doctor
    @PostMapping("/create-doctor")
    public ResponseEntity<Doctor> createDoctor(@RequestBody @Valid Doctor doctor){
        return new ResponseEntity<>(doctorService.createDoctor(doctor), HttpStatus.CREATED);
    }
}
