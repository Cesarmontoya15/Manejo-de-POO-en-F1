public class TyreOn {
    private String nombre;
    private String cargo;
    private String color;

    public TyreOn(String nombre, String cargo, String color){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
    }

    public void ponerNeumatico(){
        System.out.println(nombre+" ha llevado el neumatico a pit box y lo ha puesto");

    }

    private void MontarNeu(){
        System.out.println( nombre +" ha colocado el neumatico");

    }
    public void GetMontarNeu(){
        MontarNeu();
    }



}
