package com.dash_monitoreo.controller;
import com.dash_monitoreo.model.Usuario;
import com.dash_monitoreo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/usuarios")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public List<Usuario> obtenerUsuario() {
        return this.usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public Usuario crearUsuario(Usuario usuario) {
        return this.usuarioService.crearUsuario(usuario);
    }
}