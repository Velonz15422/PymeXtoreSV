package com.pymextore.udem.pymextore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pymextore.udem.pymextore.model.Orden;
import java.util.List;
import java.util.Optional;

import com.pymextore.udem.pymextore.repository.OrdenRepositorio;

@Service
public class OrdenService {
    
    @Autowired
    OrdenRepositorio ordenRepositorio;

    public List<Orden> getOrdenes(){
        return ordenRepositorio.findAll();
    }

    public Optional<Orden> getOrden(Long orderId){
        return ordenRepositorio.findById(orderId);
    }

    public void guardar(Orden orden){
        ordenRepositorio.save(orden);
    }

    public void borrar(Long orderId){
        ordenRepositorio.deleteById(orderId);
    }
}
