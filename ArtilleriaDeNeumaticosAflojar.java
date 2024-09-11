public class ArtilleriaDeNeumaticosAflojar  {


    private String nombre;
    private String cargo;
    private String color;
    private  String team;

    public ArtilleriaDeNeumaticosAflojar(String nombre, String cargo, String color,String team){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
        this.team=team;

    }

    public void AflojarTuerca(){
        System.out.println(nombre + " ha aflojado la tuerca, y el nueumatico viejo ha sido retirado para el team "+team);

    }
    private void PistolaRuedas(){
        System.out.println( nombre + " ha cogido la pistola de ruedas");
    }
    public void GetPistolaRuedas(){
        PistolaRuedas();
    }




}
