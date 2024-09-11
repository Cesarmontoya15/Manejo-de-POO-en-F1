public class LollipopMan {
    private String nombre;
    private String cargo;
    private String color;

    public LollipopMan(String nombre, String cargo, String color){
        this.nombre=nombre;
        this.cargo=cargo;
        this.color=color;
    }


    void SenalSalida(){
        System.out.println(nombre +" ha dado la señal de salida al conductor");
    }
    private void PrepararSalida(){
        System.out.println(nombre +" esta preparando la salida ");
    }
    public void GetPrepararSalida(){
        PrepararSalida();
    }


}
