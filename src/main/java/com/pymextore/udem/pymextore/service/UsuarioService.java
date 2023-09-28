package com.pymextore.udem.pymextore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pymextore.udem.pymextore.model.Usuario;
import com.pymextore.udem.pymextore.repository.UsuarioRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public List<Usuario> getUsuarios() {
        return usuarioRepositorio.findAll();
    }

    public Optional<Usuario> getUsuario(Long userId) {
        return usuarioRepositorio.findById(userId);
    }

    public void guardar(Usuario usuario) {
        usuarioRepositorio.save(usuario);
    }

    public void borrar(Long userId) {
        usuarioRepositorio.deleteById(userId);
    }

}
