package Ciclo3.Solucion.Repository;


import Ciclo3.Solucion.Repository.Crud.DoctorCrudRepository;
import Ciclo3.Solucion.modelo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DoctorRepository {

    @Autowired
    private DoctorCrudRepository doctorCrudRepository;

    public List<Doctor> getAll(){
        return (List<Doctor>) doctorCrudRepository.findAll();
    }
    public Optional<Doctor> getDoctor(int id){
        return doctorCrudRepository.findById(id);
    }

    public Doctor save(Doctor d){
        return doctorCrudRepository.save(d);

    }
}
