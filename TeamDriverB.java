public class TeamDriverB extends PitCrewTeam implements Boxes {
    private String nombre;
    private String cargo;
    private String color;
    private String team;

    public TeamDriverB(String nombre, String cargo, String color,String team){
        super(nombre,cargo,color);
        this.nombre=nombre;
        this.cargo=cargo;
        this.team=team;
    }


    private GatoTrasero instanciaGatoTraseroB = new GatoTrasero("Camilo","levantamiento trasero","Rojo","B");
    void gatoLevantamintoTrasero(){
        instanciaGatoTraseroB.gatoLevantamintoTrasero();
    }

    private GatoLateral instanciaGatoLateralB= new GatoLateral("Miguel","Levantamiento Lateral","Rojo","B");
    void gatoLevantamientoLateral(){
        instanciaGatoLateralB.gatoLevantamientoLateral();
    }

    private GatoFrontal instanciaGatoFrontalB= new GatoFrontal("Samuel","levantamiento frontal","Rojo","B");
    void gatoLevantamientoFrontal(){
        instanciaGatoFrontalB.gatoLevantamientoFrontal();
    }



    private ArtilleriaDeNeumaticosAflojar instaciaArtilleriaDeNeuAflojarB= new ArtilleriaDeNeumaticosAflojar("Alejandro","Artillero que afloja la tuerca","Rojo","B");
    public void AflojarTuerca(){
        instaciaArtilleriaDeNeuAflojarB.AflojarTuerca();
    }

    @Override
    public void Cambiar_neumaticos() {
        super.Cambiar_neumaticos();
    }
    ArtilleriaDeNeumaticosAjustar instaciaArtilleriaDeNeuAjustarB= new ArtilleriaDeNeumaticosAjustar("Oliver","Artillero que ajusta la tuerca","Rojo","B");
    public void AjustarTuerca() {
        instaciaArtilleriaDeNeuAjustarB.AjustarTuerca();
    }
    public void solicitarPits(){
        System.out.println("El conductor del team B solicita los pits ");
    }

    public void Ganar(){
        System.out.println("El conductor " + nombre+ " del Team B ha ganado");
    }

    public void Perder(){
        System.out.println("El conductor " + nombre+ " del Team B ha perdido");
    }

    public void Saludo(){
        System.out.println("hola mi nombre es " + nombre + " y soy el " +cargo+ " del team B");
    }

    private void Acelerar(){
        System.out.println("el auto del team B ha acelerado");
    }
    public void GetAcelerar(){
        Acelerar();
    }


}