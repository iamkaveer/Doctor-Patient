package com.doctorpatient.Service;

import com.doctorpatient.Model.Doctor;
import com.doctorpatient.Repository.IDoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private IDoctorRepository iDoctorRepository;


    public Doctor createDoctor(Doctor doctor) {
        return iDoctorRepository.save(doctor);
    }
}
