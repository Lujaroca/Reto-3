package Ciclo3.Solucion.service;

import Ciclo3.Solucion.Repository.DoctorRepository;
import Ciclo3.Solucion.modelo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAll(){
        return doctorRepository.getAll();
    }

    public Optional<Doctor> getDoctor(int id){
        return doctorRepository.getDoctor(id);
    }

    public Doctor save(Doctor d) {
        if (d.getId() == null) {
            return doctorRepository.save(d);
        } else {
            Optional<Doctor> docaux = doctorRepository.getDoctor(d.getId());
            if (docaux.isEmpty()) {
                return doctorRepository.save(d);
            } else {
                return d;
            }
        }
    }
}