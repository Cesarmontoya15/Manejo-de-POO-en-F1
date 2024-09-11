public class AjusteAleta {

    private String nombre;
    private String cargo;
    private String color;

    public AjusteAleta(String nombre, String cargo, String color){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
    }

    void AjustarFlap(){
        System.out.println( nombre + " ha ajustado los flaps");

    }
    void CambiarAla(){
        System.out.println(nombre + " ha instalado la nueva ala del auto");
    }

    private void AlaNueva(){
        System.out.println("El equipo ha conseguido el ala nueva");
    }

    public void GetAlaNueva(){
        AlaNueva();
    }
}
