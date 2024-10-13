package proyecto_apirest_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto_apirest_jpa.dto.UsuarioDto;
import proyecto_apirest_jpa.service.UsuarioService;
import java.util.Map;
import java.util.HashMap;


@RestController
@RequestMapping("/api")
public class AuthController
{

    @Autowired
    private UsuarioService usuarioService;

    @CrossOrigin(origins = "http://localhost:3004")
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody UsuarioDto loginRequest) {
        boolean authenticated = usuarioService.authenticate(loginRequest.getEmail(), loginRequest.getPassword());

        Map<String, String> response = new HashMap<>();
        if (authenticated) {
            response.put("message", "Inicio de Sesión Exitoso");
            return ResponseEntity.ok(response);
        } else {
            response.put("message", "Usuario o password Inválido");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }
}

