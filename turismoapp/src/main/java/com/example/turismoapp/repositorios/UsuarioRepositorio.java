package com.example.turismoapp.repositorios;

import com.example.turismoapp.modelos.Oferta;
import com.example.turismoapp.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {
}
