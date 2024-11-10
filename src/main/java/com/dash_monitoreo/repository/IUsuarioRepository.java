package com.dash_monitoreo.repository;

import com.dash_monitoreo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
