package proyecto_apirest_jpa.dto;

public class ServicioDto
{
    private Long  idServicio;
    private String nombre;

    public ServicioDto() {
    }

    public ServicioDto(Long idServicio, String nombre) {
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
