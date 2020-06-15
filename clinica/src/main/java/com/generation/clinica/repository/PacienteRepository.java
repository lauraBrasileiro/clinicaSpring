package com.generation.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.clinica.model.PacienteModel;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteModel, String> {

}
