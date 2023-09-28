package com.pymextore.udem.pymextore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pymextore.udem.pymextore.model.Orden;
import com.pymextore.udem.pymextore.service.OrdenService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/orders")
public class OrdenController {

    @Autowired
    OrdenService ordenService;

    @GetMapping
    public List<Orden> getOrdenes() {
        return ordenService.getOrdenes();
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Orden> getOrden(@PathVariable Long orderId) {
        Optional<Orden> orden = ordenService.getOrden(orderId);
        if (orden.isPresent()) {
            return ResponseEntity.ok(orden.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Void> crearOrden(@RequestBody Orden orden) {
        ordenService.guardar(orden);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<Void> borrarOrden(@PathVariable Long orderId) {
        Optional<Orden> orden = ordenService.getOrden(orderId);

        if (orden.isPresent()) {
            ordenService.borrar(orderId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
