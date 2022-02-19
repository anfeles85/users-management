package io.github.anfeles85.usersmanagement.controllers;

import io.github.anfeles85.usersmanagement.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id)
    {
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("Andres");
        usuario.setApellido("Escobar");
        usuario.setEmail("anfeles@misena.edu.co");
        usuario.setTelefono("311");

        return usuario;
    }
}
