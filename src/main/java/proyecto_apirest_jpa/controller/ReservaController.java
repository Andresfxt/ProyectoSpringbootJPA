package proyecto_apirest_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto_apirest_jpa.dto.ReservaDto;
import proyecto_apirest_jpa.model.Persona;
import proyecto_apirest_jpa.model.Reserva;
import proyecto_apirest_jpa.model.Servicio;
import proyecto_apirest_jpa.model.Usuario;
import proyecto_apirest_jpa.repository.ReservaRepository;
import proyecto_apirest_jpa.service.PersonaService;
import proyecto_apirest_jpa.service.ReservaService;
import proyecto_apirest_jpa.service.ServicioService;
import proyecto_apirest_jpa.service.UsuarioService;
import java.util.List;
import java.util.Optional;


@RestController
public class ReservaController
{

    @Autowired
    private ServicioService servicioService;
    @Autowired
    private PersonaService personaService;
    @Autowired
    private ReservaService reservaService;
    private ReservaRepository reservaRepository;

    @PostMapping("/api/createReserva")
    public Reserva createReserva(@RequestBody ReservaDto reservaDTO)
    {
        //Optional<Persona> optionalPersona = personaService.findOneById(reservaDTO.getPersonaId());


       // Persona persona=optionalPersona.get();

        Servicio servicio = servicioService.findById(reservaDTO.getServicioId());
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombres(reservaDTO.getPersona().getNombres());
        nuevaPersona.setApellidos(reservaDTO.getPersona().getApellidos());
        nuevaPersona.setNumeroDocumento(reservaDTO.getPersona().getNumeroDocumento());
        nuevaPersona.setTelefono(reservaDTO.getPersona().getTelefono());

        Reserva reserva = new Reserva();
        reserva.setFecha(reservaDTO.getFecha());
        reserva.setHora(reservaDTO.getHora());

        reserva.setPersona(nuevaPersona);
        reserva.setServicio(servicio);

        return reservaService.saveReserva(reserva);
    }

    @GetMapping("/api/reserva")
    public List<Reserva> getAllReservas()
    {
        return reservaService.getAllReservas();
    }

    @GetMapping("/api/reserva/{id}")
    public Optional<Reserva> getOneReserva(@PathVariable Long id)
    {
        return reservaService.findOneById(id);
    }

    @PutMapping("/api/reservaUpdate")
    public Reserva update(@RequestBody ReservaDto reservaDTO)
    {

        Optional<Reserva> optionalReserva=reservaService.findOneById(reservaDTO.getIdReserva());

        Reserva reserva = optionalReserva.get();
        reserva.setFecha(reservaDTO.getFecha());
        reserva.setHora(reservaDTO.getHora());
        return reservaService.saveReserva(reserva);
    }
    @DeleteMapping("/api/reserva/{id}")
    public void delete(@PathVariable Long id)
    {
        reservaService.deleteById(id);
    }

}
