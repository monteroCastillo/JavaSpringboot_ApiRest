package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Negro");
        usuario.setApellido("Muelon");
        usuario.setEmail("negro@gmail.com");
        usuario.setTelefono("46464646");
        usuario.setPassword("dfasdfga");
        return usuario;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(11L);
        usuario.setNombre("Negro");
        usuario.setApellido("Muelon");
        usuario.setEmail("negro@gmail.com");
        usuario.setTelefono("46464646");
        usuario.setPassword("dfasdfga");

        Usuario usuario2 = new Usuario();
        usuario2.setId(22L);
        usuario2.setNombre("Deisy");
        usuario2.setApellido("Guerrero");
        usuario2.setEmail("deisy@gmail.com");
        usuario2.setTelefono("1111111");
        usuario2.setPassword("dfasdfga");

        Usuario usuario3 = new Usuario();
        usuario3.setId(33L);
        usuario3.setNombre("Maria");
        usuario3.setApellido("Ocampo");
        usuario3.setEmail("maria@gmail.com");
        usuario3.setTelefono("222222");
        usuario3.setPassword("dfasdfga");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value="usuario45")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Negro");
        usuario.setApellido("Muelon");
        usuario.setEmail("negro@gmail.com");
        usuario.setTelefono("46464646");
        usuario.setPassword("dfasdfga");
        return usuario;
    }


    @RequestMapping(value="usuario55")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Negro");
        usuario.setApellido("Muelon");
        usuario.setEmail("negro@gmail.com");
        usuario.setTelefono("46464646");
        usuario.setPassword("dfasdfga");
        return usuario;
    }

    @RequestMapping(value="usuario75")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Negro");
        usuario.setApellido("Muelon");
        usuario.setEmail("negro@gmail.com");
        usuario.setTelefono("46464646");
        usuario.setPassword("dfasdfga");
        return usuario;
    }
}
