package com.example.demo.domain.perfiles;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRespository extends JpaRepository<Perfil,Long> {

    Page<Perfil> findAll(Pageable pageable);

}