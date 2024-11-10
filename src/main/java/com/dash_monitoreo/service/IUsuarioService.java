package com.dash_monitoreo.service;


import com.dash_monitoreo.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> obtenerUsuarios();

    public Usuario crearUsuario(Usuario usuario);


}
