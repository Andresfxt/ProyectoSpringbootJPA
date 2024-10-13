package proyecto_apirest_jpa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto_apirest_jpa.dto.PersonaDto;
import proyecto_apirest_jpa.model.Persona;
import proyecto_apirest_jpa.service.PersonaService;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonaController
{
    @Autowired
    private PersonaService personaService;

    @PostMapping("/api/createPersona")
    public Persona createPersona(@RequestBody Persona persona)
    {
        return  personaService.savePersona(persona);
    }

    @GetMapping("/api/getPersonas")
    public List<Persona> getAllPersona()
    {
        return personaService.getPersonas();
    }

    @GetMapping("/api/persona/{id}")
    public Optional<Persona> getOnePersona(@PathVariable Long id)
    {
        return personaService.findOneById(id);
    }

    @PutMapping("/api/personaUpdate")
    public Persona update(@RequestBody PersonaDto personaDTO)
    {

        Optional<Persona> optionalPersona=personaService.findOneById(personaDTO.getIdPersona());

        Persona persona = optionalPersona.get();
        persona.setNombres(personaDTO.getNombres());
        persona.setApellidos(personaDTO.getApellidos());
        persona.setTelefono(personaDTO.getTelefono());
        persona.setNumeroDocumento(personaDTO.getNumeroDocumento());


        return personaService.savePersona(persona);
    }

    @DeleteMapping("/api/deletePersona/{id}")
    public void delete(@PathVariable Long id)
    {
        personaService.deleteById(id);
    }




}
