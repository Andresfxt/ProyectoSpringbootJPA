package proyecto_apirest_jpa.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import proyecto_apirest_jpa.model.Cliente;
import proyecto_apirest_jpa.model.Persona;
import proyecto_apirest_jpa.repository.PersonaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona savePersona(Persona persona)
    {
        return personaRepository.save(persona);
    }

    public List<Persona> getPersonas()
    {
        return personaRepository.findAll();
    }

    public Optional<Persona> findOneById(@PathVariable Long id)
    {
        return personaRepository.findById(id);
    }

    public void deleteById(Long id)
    {
        personaRepository.deleteById(id);
    }
}
