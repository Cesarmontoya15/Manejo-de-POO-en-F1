public class TeamDriverA extends PitCrewTeam implements Boxes {
    private String nombre;
    private String cargo;
    private String color;
    private String team;

    public TeamDriverA(String nombre, String cargo, String color, String team){
        super(nombre,cargo,color);
        this.nombre=nombre;
        this.cargo=cargo;
        this.team=team;
    }


    private GatoTrasero instanciaGatoTraseroA = new GatoTrasero("Ramiro","levantamiento trasero","Rojo","A");
    void gatoLevantamintoTrasero(){
        instanciaGatoTraseroA.gatoLevantamintoTrasero();
    }

    private GatoLateral instanciaGatoLateralA= new GatoLateral("Andres","Levantamiento Lateral","Rojo","A");
    void gatoLevantamientoLateral(){
        instanciaGatoLateralA.gatoLevantamientoLateral();
    }

    private GatoFrontal instanciaGatoFrontalA= new GatoFrontal("Thomas","levantamiento frontal","Rojo","A");
    void gatoLevantamientoFrontal(){
        instanciaGatoFrontalA.gatoLevantamientoFrontal();
    }
    private ArtilleriaDeNeumaticosAflojar instaciaArtilleriaDeNeuAflojarA= new ArtilleriaDeNeumaticosAflojar("Martín","Artillero que afloja la tuerca","Rojo","A");
    public void AflojarTuerca(){
        instaciaArtilleriaDeNeuAflojarA.AflojarTuerca();
    }

    @Override
    public void Cambiar_neumaticos() {
        super.Cambiar_neumaticos();
    }
    private ArtilleriaDeNeumaticosAjustar instaciaArtilleriaDeNeuAjustar= new ArtilleriaDeNeumaticosAjustar("Esteban","Artillero que ajusta la tuerca","Rojo","A");
    public void AjustarTuerca() {
        instaciaArtilleriaDeNeuAjustar.AjustarTuerca();
    }
    public void solicitarPits(){
        System.out.println("El conductor del team A solicita los pits ");
    }


    public void Ganar(){
        System.out.println("El conductor " + nombre+ " del Team A ha ganado");
    }

    public void Perder(){
        System.out.println("El conductor " + nombre+ " del Team A ha perdido");
    }


    public void Saludo(){
        System.out.println("hola mi nombre es " + nombre + " y soy el " + cargo+ " del team A");
    }


    private void Desacelerar(){
        System.out.println("el auto del team A ha desacelerado");
    }
    public void GetDesacelerar(){
        Desacelerar();
    }





}


