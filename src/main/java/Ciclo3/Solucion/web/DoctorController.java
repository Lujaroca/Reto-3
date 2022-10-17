package Ciclo3.Solucion.web;


import Ciclo3.Solucion.modelo.Doctor;
import Ciclo3.Solucion.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Doctor")
@CrossOrigin(origins="*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/all")
    public List<Doctor> getDoctores(){
                return doctorService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Doctor> getDoctor(@PathVariable("id")int id){
                return doctorService.getDoctor(id);
    }

    @PostMapping("/save/")
    @ResponseStatus(HttpStatus.CREATED)
    public Doctor save(@RequestBody Doctor d){
                return doctorService.save(d);
    }

}
