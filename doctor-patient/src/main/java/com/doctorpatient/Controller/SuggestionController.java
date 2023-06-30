package com.doctorpatient.Controller;

import com.doctorpatient.Model.Doctor;
import com.doctorpatient.Model.Patient;
import com.doctorpatient.Repository.IDoctorRepository;
import com.doctorpatient.Repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SuggestionController {
    @Autowired
    private IPatientRepository iPatientRepository;
    @Autowired
    private IDoctorRepository iDoctorRepository;


    @GetMapping("/suggestions")
    public ResponseEntity<?> suggestDoctor(@RequestParam Integer patientId) {
        Optional<Patient> optionalPatient = iPatientRepository.findById(patientId);
        if (optionalPatient.isEmpty()) {
            return ResponseEntity.badRequest().body("Patient not found");
        }

        Patient patient = optionalPatient.get();
        List<Doctor> suggestedDoctors = iDoctorRepository.findByCityAndSpecialization(patient.getCity(), patient.getSymptom().getSpeciality());
        if(!patient.getCity().equals("DELHI") || !patient.getCity().equals("NOIDA") || !patient.getCity().equals("FARIDABAD")){
            return ResponseEntity.ok("We are still waiting to expand to your location");
        }
        if (suggestedDoctors.isEmpty()) {
            return ResponseEntity.ok("There isn't any doctor present at your location for your symptom");
        }

        Doctor suggestedDoctor = suggestedDoctors.get(0);
        return ResponseEntity.ok(suggestedDoctor);
    }
}
