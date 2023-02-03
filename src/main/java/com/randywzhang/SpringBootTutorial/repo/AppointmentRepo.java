package com.randywzhang.SpringBootTutorial.repo;

import com.randywzhang.SpringBootTutorial.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

}
