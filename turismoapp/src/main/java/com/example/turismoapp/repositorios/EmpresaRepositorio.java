package com.example.turismoapp.repositorios;

import com.example.turismoapp.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa,Integer> {
}
