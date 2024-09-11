import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        TeamDriverA conductorA = new TeamDriverA("Franscesco", "Piloto", "Rojo", "A");
        TeamDriverB conductorB = new TeamDriverB("Charles", "Piloto", "Rojo", "B");
        PitCrewTeam conductordeReservar = new PitCrewTeam("Carlo","piloto de reserva","Rojo");
        PitCrewTeam equipoPits = new PitCrewTeam("F1","equipo pits","Rojo");
        F1Team equipoF1= new F1Team("Ferrari",1950,"Rojo");


        int adminequipo  = 0;
        while (adminequipo  != 6) {
            System.out.println("");
            System.out.println("Bienvenido a la administración de F1 Team ");
            System.out.println("¿Qué equipo deseas administrar?");
            System.out.println("1.Team A");
            System.out.println("2.Team B");
            System.out.println("3.Team Pits");
            System.out.println("4.Conoce el equipo entero");
            System.out.println("5.Funciones especiales");
            System.out.println("6.Salir");

             adminequipo = teclado.nextInt();
            if (adminequipo==1) {
                int opcionA = 0;
                System.out.println("Oprime el numero correspondiente para cada funcionalidad de tu equipo");
                System.out.println("//Opciones de los Pits//");
                System.out.println("");
                System.out.println("1. Revision gato lateral");
                System.out.println("2. Revision gato frontal");
                System.out.println("3. Revision gato trasero");
                System.out.println("4. Quitar neumatico");
                System.out.println("5. Poner neumatico");
                System.out.println("6. Cambiar neumatico");
                System.out.println("7. Marca de salida ");
                System.out.println("8. Ajustar tuercas");
                System.out.println("9. Aflojar tuercas");
                System.out.println("10. Cambiar ala");
                System.out.println("11. Ajustar flap");
                System.out.println("");
                System.out.println("//Opciones del Piloto//");
                System.out.println("");
                System.out.println("12. Arriesgar ultima vuelta  ");
                System.out.println("13. Saludo de tu piloto favorito");
                System.out.println("//__________________________//");
                opcionA = teclado.nextInt();
                switch (opcionA) {

                    case 1:
                        conductorA.gatoLevantamientoLateral();
                        break;
                    case 2:
                        conductorA.gatoLevantamientoFrontal();
                        break;
                    case 3:
                        conductorA.gatoLevantamintoTrasero();
                        break;
                    case 4:
                        conductorA.QuitarNeumatico();
                        break;
                    case 5:
                        conductorA.ponerNeumatico();
                        break;
                    case 6:
                        conductorA.Cambiar_neumaticos();
                        break;
                    case 7:
                        conductorA.SenalSalida();
                        break;
                    case 8:
                        conductorA.AjustarTuerca();
                        break;
                    case 9:
                        conductorA.AflojarTuerca();
                        break;
                    case 10:
                        conductorA.CambiarAla();
                        break;
                    case 11:
                        conductorA.AjustarFlap();
                        break;
                    case 12:
                        Random random = new Random();
                        int randomNumber = random.nextInt(2) + 1;
                        if (randomNumber==1){
                            conductorA.Ganar();
                        }else {
                            conductorA.Perder();
                        }
                        break;
                    case 13:
                        conductorA.Saludo();
                        break;

                }
            }

            if (adminequipo ==2) {
                int opcionB = 0;
                System.out.println("Oprime el numero correspondiente para cada funcionalidad de tu equipo");
                System.out.println("//Opciones de los Pits//");
                System.out.println("");
                System.out.println("1. Revision gato lateral");
                System.out.println("2. Revision gato frontal");
                System.out.println("3. Revision gato trasero");
                System.out.println("4. Quitar neumatico");
                System.out.println("5. Poner neumatico");
                System.out.println("6. Cambiar neumatico");
                System.out.println("7. Marca de salida ");
                System.out.println("8. Ajustar tuercas");
                System.out.println("9. Aflojar tuercas");
                System.out.println("10. Cambiar ala");
                System.out.println("11. Ajustar flap");
                System.out.println("");
                System.out.println("//Opciones del Piloto//");
                System.out.println("");
                System.out.println("12. Arriesgar ultima vuelta  ");
                System.out.println("13. Saludo de tu piloto favorito");
                System.out.println("//__________________________//");

                opcionB = teclado.nextInt();
                switch (opcionB) {

                    case 1:
                        conductorB.gatoLevantamientoLateral();
                        break;
                    case 2:
                        conductorB.gatoLevantamientoFrontal();
                        break;
                    case 3:
                        conductorB.gatoLevantamintoTrasero();
                        break;
                    case 4:
                        conductorB.QuitarNeumatico();
                        break;
                    case 5:
                        conductorB.ponerNeumatico();
                        break;
                    case 6:
                        conductorB.Cambiar_neumaticos();
                        break;
                    case 7:
                        conductorB.SenalSalida();
                        break;
                    case 8:
                        conductorB.AjustarTuerca();
                        break;
                    case 9:
                        conductorB.AflojarTuerca();
                        break;
                    case 10:
                        conductorB.CambiarAla();
                        break;
                    case 11:
                        conductorB.AjustarFlap();
                        break;
                    case 12:
                        Random random = new Random();
                        int randomNumber = random.nextInt(2) + 1;
                        if (randomNumber==1){
                            conductorB.Ganar();
                        }else {
                            conductorB.Perder();
                        }
                        break;
                    case 13:
                        conductorB.Saludo();
                        break;

                }


            }

            if (adminequipo==3){
                int Opcion3=0;
                System.out.println("Oprime el numero correspondiente para cada funcionalidad de tu equipo");
                System.out.println("//Opciones de los Pits//");
                System.out.println("");
                System.out.println("1. Revision gato lateral");
                System.out.println("2. Revision gato frontal");
                System.out.println("3. Revision gato trasero");
                System.out.println("4. Quitar neumatico");
                System.out.println("5. Poner neumatico");
                System.out.println("6. Cambiar neumatico");
                System.out.println("7. Marca de salida ");
                System.out.println("8. Ajustar tuercas");
                System.out.println("9. Aflojar tuercas");
                System.out.println("10. Cambiar ala");
                System.out.println("11. Ajustar flap");
                System.out.println("12. Saludo de tu equipo");

                System.out.println("//__________________________//");
                Opcion3 = teclado.nextInt();
                switch (Opcion3) {

                    case 1:
                        equipoPits.gatoLevantamientoLateral();
                        break;
                    case 2:
                        equipoPits.gatoLevantamientoFrontal();
                        break;
                    case 3:
                        equipoPits.gatoLevantamintoTrasero();
                        break;
                    case 4:
                        equipoPits.QuitarNeumatico();
                        break;
                    case 5:
                        equipoPits.ponerNeumatico();
                        break;
                    case 6:
                        equipoPits.Cambiar_neumaticos();
                        break;
                    case 7:
                        equipoPits.SenalSalida();
                        break;
                    case 8:
                        equipoPits.AjustarTuerca();
                        break;
                    case 9:
                        equipoPits.AflojarTuerca();
                        break;
                    case 10:
                        equipoPits.CambiarAla();
                        break;
                    case 11:
                        equipoPits.AjustarFlap();
                        break;
                    case 12:
                        equipoPits.Saludo();
                        break;

                }
            }
            if(adminequipo==4) {
                int Opcion4 = 0;
                System.out.println("Oprime el numero correspondiente para cada funcionalidad de tu equipo");
                System.out.println("//Conoce el Equipo de F1//");
                System.out.println("");
                System.out.println("1. Nombre");
                System.out.println("2. Fundacion");
                System.out.println("3. Color");
                System.out.println("4. Conoce algunos de nuestros corredores");
                System.out.println("//__________________________//");
                Opcion4 = teclado.nextInt();
                switch (Opcion4) {

                    case 1:
                        System.out.println("El nombre del quipo es " + equipoF1.getNombreTeam());
                        break;
                    case 2:
                        System.out.println("El año de fundacion es " + equipoF1.getFundacion());
                        break;
                    case 3:
                        System.out.println("El color del equipo es "+ equipoF1.getColor());
                        break;
                    case 4:
                        equipoF1.Corredores();
                        break;

                }

            }


            if(adminequipo==5) {
                int Opcion5 = 0;
                System.out.println("Oprime el numero correspondiente para cada funcionalidad de tu equipo");
                System.out.println("//Funciones especiales//");
                System.out.println("");
                System.out.println("1. Conseguir ala nueva");
                System.out.println("2. Conseguir una pistola de rueda");
                System.out.println("3. Conseguir tuercas");
                System.out.println("4. Colocar el gato Frontal");
                System.out.println("5. Colocar el gato Trasero");
                System.out.println("6. Colocar el gato Lateral");
                System.out.println("7. Conocer quien prepara la señal de salida");
                System.out.println("8. Conocer la estrategia del equipo");
                System.out.println("9. Desacelerar");
                System.out.println("10. Acelerar");
                System.out.println("11. Conocer el peso de los neumaticos");
                System.out.println("12. Montar neumatico");
                System.out.println("13. Agradecimiento del equipo");


                System.out.println("//__________________________//");
                Opcion5 = teclado.nextInt();
                switch (Opcion5) {

                    case 1:
                        equipoPits.GetAlaNueva();
                        break;
                    case 2:
                        equipoPits.GetPistolaRuedas();
                        break;
                    case 3:
                        equipoPits.GetCogerTuercas();
                        break;
                    case 4:
                        equipoPits.GetColocarGatoF();
                        break;
                    case 5:
                        equipoPits.GetColocarGatoT();
                        break;
                    case 6:
                        equipoPits.GetColocarGatoL();
                        break;
                    case 7:
                        equipoPits.GetPrepararSalida();
                        break;
                    case 8:
                        equipoPits.GetEstrategia();
                        break;
                    case 9:
                        conductorA.GetDesacelerar();
                        break;
                    case 10:
                        conductorB.GetAcelerar();
                        break;
                    case 11:
                        equipoPits.GetPeso();
                        break;

                    case 12:
                        equipoPits.GetMontarNeu();
                        break;
                    case 13:
                        equipoPits.GetGracias();
                        break;
                }

            }



        }
        System.out.println("Gracias por visitarnos");
    }
}