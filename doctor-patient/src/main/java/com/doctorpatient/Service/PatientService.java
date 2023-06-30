package com.doctorpatient.Service;

import com.doctorpatient.Model.Patient;
import com.doctorpatient.Repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private IPatientRepository iPatientRepository;

    public Patient createPatient(Patient patient) {
        return iPatientRepository.save(patient);
    }
}
