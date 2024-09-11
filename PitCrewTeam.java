public class PitCrewTeam extends F1Team implements Boxes {

    private String nombre;
    private String cargo;
    private String color;

    public PitCrewTeam(String nombre, String cargo, String color){
        super("Ferrari",1950,"Rojo");
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void Cambiar_neumaticos() {
        System.out.println("Los neumaticos se han cambiado");
    }

    private GatoFrontal instanciaGatoFrontal= new GatoFrontal("Juan","levantamiento frontal","Rojo","F1 ");
    void gatoLevantamientoFrontal(){
        instanciaGatoFrontal.gatoLevantamientoFrontal();
    }
    public void GetColocarGatoF(){instanciaGatoFrontal.GetColocarGatoF();}
    private GatoLateral instanciaGatoLateral= new GatoLateral("Jose","Levantamiento Lateral","Rojo","F1");
    void gatoLevantamientoLateral(){
        instanciaGatoLateral.gatoLevantamientoLateral();
    }
    public void GetColocarGatoL(){instanciaGatoLateral.GetColocarGatoL();}
    private GatoTrasero instanciaGatoTrasero = new GatoTrasero("Emilio","levantamiento trasero","Rojo","F1");
    void gatoLevantamintoTrasero(){
        instanciaGatoTrasero.gatoLevantamintoTrasero();
    }
    public void GetColocarGatoT(){instanciaGatoTrasero.GetColocarGatoT();}
    private TyreOff instanciaTyreOff= new TyreOff("Pablo","Quitar neumatico","Rojo",10);
    public void QuitarNeumatico(){
        instanciaTyreOff.QuitarNeumatico();
    }
    public void GetPeso(){instanciaTyreOff.GetPeso();}
    private TyreOn instanciaTyreOn= new TyreOn("Jacob","Poner Neumatico","Rojo");
    public void ponerNeumatico(){
        instanciaTyreOn.ponerNeumatico();
    }
    public void GetMontarNeu(){instanciaTyreOn.GetMontarNeu();}
    private LollipopMan instanciaLollipopMan = new LollipopMan("Sebastian", "Lollipop Man","Rojo");
    public void SenalSalida(){
        instanciaLollipopMan.SenalSalida();
    }
    public void GetPrepararSalida(){instanciaLollipopMan.GetPrepararSalida();}
    private ArtilleriaDeNeumaticosAjustar instaciaArtilleriaDeNeumAjustar= new ArtilleriaDeNeumaticosAjustar("luis", "artillero que ajusta", "Rojo","F1");
    public void AjustarTuerca(){
        instaciaArtilleriaDeNeumAjustar.AjustarTuerca();
    }
    public void GetCogerTuercas(){instaciaArtilleriaDeNeumAjustar.GetCogerTuercas();}

    private ArtilleriaDeNeumaticosAflojar instaciaArtilleriaDeNeumAflojar= new ArtilleriaDeNeumaticosAflojar("Roberto", "artillero que ajusta", "Rojo","F1");
    public void AflojarTuerca(){
        instaciaArtilleriaDeNeumAflojar.AflojarTuerca();
    }
    public void GetPistolaRuedas(){instaciaArtilleriaDeNeumAflojar.GetPistolaRuedas();}

   private AjusteAleta instaciaAjusteAleta = new AjusteAleta("Marco", "Ajusta ", "Rojo");
    public void CambiarAla() {
        instaciaAjusteAleta.CambiarAla();
    }
    public void AjustarFlap(){
        instaciaAjusteAleta.AjustarFlap();
    }
    public void GetAlaNueva(){instaciaAjusteAleta.GetAlaNueva();}

    public void Saludo(){
        System.out.println("Hola! somos el equipo " +nombre );
    }

    private void Estrategia(){
        System.out.println("La estrategia del equipo es revasar por la derecha");
    }

    public void GetEstrategia(){
        Estrategia();
    }

}

