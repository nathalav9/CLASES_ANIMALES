public class Animal {

    public String nombre;
    public String Familia;
    public String especie;
    public String Raza;

    public Animal(String nombre, String Familia, String especie, String Raza) {
        this.nombre = nombre;
        this.Familia = Familia;
        this.especie = especie;
        this.Raza = Raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFamilia() {
        return Familia;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return Raza;
    }

}

