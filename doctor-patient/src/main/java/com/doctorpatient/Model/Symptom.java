package com.doctorpatient.Model;

public enum Symptom {
    ARTHRITIS(Specialization.ORTHOPEDIC),
    BACK_PAIN(Specialization.ORTHOPEDIC),
    TISSUE_INJURIES(Specialization.ORTHOPEDIC),
    DYSMENORRHEA(Specialization.GYNECOLOGY),
    SKIN_INFECTION(Specialization.DERMATOLOGY),
    SKIN_BURN(Specialization.DERMATOLOGY),
    EAR_PAIN(Specialization.ENT);

    private final Specialization speciality;

    Symptom(Specialization speciality) {
        this.speciality = speciality;
    }

    public Specialization getSpeciality() {
        return speciality;
    }
}
