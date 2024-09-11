public class GatoTrasero{

    private  String nombre;
    private String cargo;
    private String color;
    private  String team;

    public GatoTrasero(String nombre, String cargo, String color,String team){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
        this.team=team;
    }
    void gatoLevantamintoTrasero(){
        System.out.println(nombre+" ha levantado el auto por la parte de atras "+" del team "+team);
    }

    private void ColocarGato(){
        System.out.println( nombre + " ha colocado el gato trasero");
    }
    public void GetColocarGatoT(){
        ColocarGato();
    }


}
