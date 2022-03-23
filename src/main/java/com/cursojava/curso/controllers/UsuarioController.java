package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.GET)
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

    @RequestMapping(value="api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value="api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){
         usuarioDao.registrar(usuario);
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


    @RequestMapping(value="api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
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
