package com.pymextore.udem.pymextore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pymextore.udem.pymextore.model.Orden;

@Repository
public interface OrdenRepositorio  extends JpaRepository<Orden, Long>{
}
