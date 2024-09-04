package proyecto_apirest_jpa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import proyecto_apirest_jpa.model.Usuario;
import proyecto_apirest_jpa.repository.UsuarioRepository;

@RestController
public class UserController
{
    private UsuarioRepository usuarioRepository;

    @PostMapping("/api/createUsuario")
    public Usuario create(@RequestBody Usuario usuario)
    {

      return  usuarioRepository.save(usuario);
    }


}
