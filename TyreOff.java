public class TyreOff {

    private String nombre;
    private String cargo;
    private String color;
    private int peso;

    public TyreOff(String nombre, String cargo, String color){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
    }
    public TyreOff(String nombre, String cargo, String color, int peso){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
        this.peso= peso;
    }
    public void QuitarNeumatico(){
        System.out.println(nombre +" ha quitado la llanta");
    }

    private void Peso(){
        System.out.println( nombre + " dice peso del neumatico es de " + peso + " kg");
    }
    public void GetPeso(){
        Peso();
    }





}
