public class GatoFrontal {

    private  String nombre;
    private String cargo;
    private String color;
    private String team;

    public GatoFrontal(String nombre, String cargo, String color,String team){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
        this.team=team;
    }

    void gatoLevantamientoFrontal(){
        System.out.println( nombre+" ha levantado el auto frontalmente para el team "+team);
    }

    private void ColocarGato(){
        System.out.println( nombre + " ha colocado el gato frontal");
    }
    public void GetColocarGatoF(){
        ColocarGato();
    }


}
