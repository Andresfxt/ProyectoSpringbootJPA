package proyecto_apirest_jpa.dto;

public class UsuarioDto
{
    private String email;
    private String password;

    public UsuarioDto() {
    }

    public UsuarioDto(String email, String password) {
        this.email = email;
        this.password = password;
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
