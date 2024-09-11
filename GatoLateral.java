public class GatoLateral {

    private  String nombre;
    private String cargo;
    private String color;
    private String team;

    public GatoLateral(String nombre, String cargo, String color,String team){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
        this.team=team;
    }

    void gatoLevantamientoLateral(){
        System.out.println(nombre+" ha levantado el auto lateralmente para el team "+team);
    }

    private void ColocarGato(){
        System.out.println( nombre + " ha colocado el gato lateral");
    }
    public void GetColocarGatoL(){
        ColocarGato();
    }
}
