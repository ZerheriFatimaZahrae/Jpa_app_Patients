package ma.enset.jpa_app;

import ma.enset.jpa_app.entites.*;
import ma.enset.jpa_app.repositories.PatientRepository;
import ma.enset.jpa_app.services.HospitaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class JpaAppApplication  { //commandLineRuner permet d executer la fct run qui permet
    // d'exuter run au moment de execution de l app


    public static void main(String[] args) {
        SpringApplication.run(JpaAppApplication.class, args);
    }


    @Bean
    CommandLineRunner start(HospitaleServiceImpl hospitaleService){
        return args -> {
            /*Stream.of("Mohmed","Hassan","Najat").forEach(name->{
                Patient patient=new Patient();
                patient.setNom(name);
                patient.setDateNaissance(new Date());
                patient.setMalade(Math.random()>0.5?false:true);
                hospitaleService.savePatient(patient);
            });

            Stream.of("Aymane","Hanane","Yasmine").forEach(name->{
                Medecin medecin=new Medecin();
                medecin.setNom(name);
                medecin.setEmail(name+"@gmail.com");
                medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                hospitaleService.saveMedecin(medecin);
            });

            Patient patient=hospitaleService.findPatientById(1L);

            //creer un rendez vous
            Rendezvous rendezvous=new Rendezvous();
            rendezvous.setDate(new Date());
            rendezvous.setStatusRDV(StatusRDV.PENDING);
            rendezvous.setPatient(patient);
            rendezvous.setMedecin(hospitaleService.findMedecinByNom("Yasmine"));
            hospitaleService.saveRDV(rendezvous);

            Rendezvous rendezvous1=hospitaleService.findRDVById(1L);
            Consultation consultation=new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezvous(rendezvous1);
            consultation.setRapport("Rapport");
            hospitaleService.saveConsultation(consultation);*/

        };

    }

}
