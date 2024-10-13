package proyecto_apirest_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import proyecto_apirest_jpa.model.Cliente;
import proyecto_apirest_jpa.model.Servicio;
import proyecto_apirest_jpa.repository.ServicioRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ServicioService
{
    @Autowired
    private ServicioRepository servicioRepository;

    public Servicio saveServicio(Servicio servicio)
    {
        return servicioRepository.save(servicio);
    }
    public Servicio findById(Long id)
    {
        return servicioRepository.findById(id).orElse(null);
    }

    public List<Servicio> getAllServicios()
    {
        return servicioRepository.findAll();
    }
    public Optional<Servicio> findOneById(@PathVariable Long id)
    {
        return servicioRepository.findById(id);
    }

    public void deleteById(Long id)
    {
        servicioRepository.deleteById(id);
    }


}
