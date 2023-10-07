package com.proyectoEjemplo.MiPrimerProyecto.modelo.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoEjemplo.MiPrimerProyecto.modelo.pojos.Usuarios;
import com.proyectoEjemplo.MiPrimerProyecto.modelo.repositorio.IServiceRepository;

@Service
public class ServiceDemo {
    @Autowired
    public IServiceRepository serviceRepository;

    public String registrarUsuario(Usuarios usuarios) throws Exception {
        try {
            // Nuestra interfaz serviceRepository tiene un método para guardar
            serviceRepository.save(usuarios);
            // Retornar un mensaje si todo ha ido bien
            return "El usuario fue registrado con éxito!";
        } catch (Exception e) {
            // Mandando una excepción si algo sale mal
            throw new Exception(e);
        }
    }
}
