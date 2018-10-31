import org.springframework.data.annotation.Id;

/**
 *
 * @author campitos
 */
public class Cliente {

    @Id
    private String id;

    public Cliente(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
   
    }

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
 
    }

    public Cliente() {
    }
    private String nombre;
    private String email;
   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
