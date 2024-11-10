package com.dash_monitoreo.controller;
import com.dash_monitoreo.model.Usuario;
import com.dash_monitoreo.service.IUsuarioService;
import com.dash_monitoreo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/usuario")
@RestController()
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping()
    public List<Usuario> obtenerUsuario() {
        return this.usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.crearUsuario(usuario);
    }
}