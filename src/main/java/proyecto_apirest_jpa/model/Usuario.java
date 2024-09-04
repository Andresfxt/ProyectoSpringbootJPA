package proyecto_apirest_jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  idUsuario ;

    private String email;
    private String password;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String email, String password) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.password = password;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
