package ma.enset.jpa_app.repositories;

import ma.enset.jpa_app.entites.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
     List<Patient> findByMalade(boolean m);
    //return les patients qu'ont malade dans la page specifie en parametres
     Patient findByNom(String name);




}
