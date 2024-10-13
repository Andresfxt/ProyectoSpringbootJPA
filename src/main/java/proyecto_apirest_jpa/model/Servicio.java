package proyecto_apirest_jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "servicios")
public class Servicio
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_servicio")
    private Long  idServicio;
    private String nombre;

   ;

    public Servicio() {
    }

    public Servicio(Long idServicio, String nombre) {
        this.idServicio = idServicio;
        this.nombre = nombre;
    }

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
