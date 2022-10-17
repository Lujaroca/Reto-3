package Ciclo3.Solucion.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Doctor")
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Specialty;
    private Integer Graduate_year;
    private Integer Department_ID;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public Integer getGraduate_year() {
        return Graduate_year;
    }

    public void setGraduate_year(Integer graduate_year) {
        Graduate_year = graduate_year;
    }

    public Integer getDepartment_ID() {
        return Department_ID;
    }

    public void setDepartment_ID(Integer department_ID) {
        Department_ID = department_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

