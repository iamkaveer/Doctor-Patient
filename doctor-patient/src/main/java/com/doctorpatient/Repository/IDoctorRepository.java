package com.doctorpatient.Repository;

import com.doctorpatient.Model.Doctor;
import com.doctorpatient.Model.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor,Integer> {
    List<Doctor> findByCityAndSpecialization(String city, Specialization speciality);
}
