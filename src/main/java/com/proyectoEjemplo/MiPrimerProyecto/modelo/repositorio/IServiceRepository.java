package com.proyectoEjemplo.MiPrimerProyecto.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoEjemplo.MiPrimerProyecto.modelo.pojos.Usuarios;

//Heredando metodos de JpaRepository para realizar un crud en nuestra aplicaci;ón
@Repository
public interface IServiceRepository extends JpaRepository<Usuarios, Long> {

}
