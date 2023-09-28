package com.pymextore.udem.pymextore.controller;

import com.pymextore.udem.pymextore.model.Usuario;
import com.pymextore.udem.pymextore.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAll() {
        return usuarioService.getUsuarios();
    }

    @PostMapping
    public void guardar(@RequestBody Usuario usuario) {
        usuarioService.guardar(usuario);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable("userId") Long userId) {
        usuarioService.borrar(userId);
    }

    @GetMapping("/{userId}")
    public Optional<Usuario> getById(@PathVariable("userId") Long userId) {
        return usuarioService.getUsuario(userId);
    }
}
