import java.util.Objects;

public class Persona {
    public String nombre;
    public int cedula;
    private String apellido;

    public Persona(String nombre, int cedula, String apellido) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona))
            return false;
        return cedula == persona.cedula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }


}