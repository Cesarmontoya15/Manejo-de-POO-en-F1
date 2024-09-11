public class F1Team {

    private String nombre;
    private int fundacion;
    private String Color;

    public F1Team(String nombre, int fundacion, String Color){

        this.nombre= nombre;
        this.fundacion= fundacion;
        this.Color= Color;
    }
    public String getNombreTeam() {
        return nombre;

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public void Corredores(){
        System.out.println("Algunos de nuestros mejores corredores son :");
        System.out.println("1.Sebastian Vettel");
        System.out.println("2.Charles Leclerc");
        System.out.println("3.Rubens Barrichello");
        System.out.println("4.Fernando Alonso");
    }

    private void Gracias(){
        System.out.println("Gracias por apoyar a nuestro equipo");
    }
    public void GetGracias(){
        Gracias();
    }
}
