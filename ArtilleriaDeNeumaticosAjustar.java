public class ArtilleriaDeNeumaticosAjustar {
    private String nombre;
    private String cargo;
    private String color;
    private  String team;

    public ArtilleriaDeNeumaticosAjustar(String nombre, String cargo, String color,String team){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
        this.team=team;
    }
    public void AjustarTuerca() {
        System.out.println(nombre +" ha cambiado el neumatico y las tuercas han sido ajustadas para el team "+team);
    }
    private void CogerTuercas(){
        System.out.println("Se han recogido las tuercas por parte de "+cargo);
    }
    public void GetCogerTuercas(){
        CogerTuercas();
    }


}
