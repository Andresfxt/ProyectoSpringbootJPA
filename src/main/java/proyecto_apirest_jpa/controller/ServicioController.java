package proyecto_apirest_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto_apirest_jpa.dto.ReservaDto;
import proyecto_apirest_jpa.dto.ServicioDto;
import proyecto_apirest_jpa.model.Cliente;
import proyecto_apirest_jpa.model.Reserva;
import proyecto_apirest_jpa.model.Servicio;
import proyecto_apirest_jpa.model.Usuario;
import proyecto_apirest_jpa.service.ServicioService;

import java.util.List;
import java.util.Optional;

@RestController
public class ServicioController
{
    @Autowired
    private ServicioService servicioService;

    @PostMapping("/api/createServicio")
    public Servicio createServicio(@RequestBody Servicio servicio)
    {
        return  servicioService.saveServicio(servicio);
    }

    @GetMapping("/api/getservicios")
    public List<Servicio> getAllServicios(){
        return servicioService.getAllServicios();
    }
    @GetMapping("/api/servicio/{id}")
    public Optional<Servicio> getOneServicio(@PathVariable Long id)
    {
        return servicioService.findOneById(id);
    }


    @PutMapping("/api/servicioUpdate")
    public Servicio update(@RequestBody ServicioDto servicioDTO)
    {

        Optional<Servicio> optionalServicio=servicioService.findOneById(servicioDTO.getIdServicio());
        Servicio servicio = optionalServicio.get();
        servicio.setNombre(servicioDTO.getNombre());

        return servicioService.saveServicio(servicio);
    }


    @DeleteMapping("/api/servicio/{id}")
    public void delete(@PathVariable Long id)
    {
        servicioService.deleteById(id);
    }

}
