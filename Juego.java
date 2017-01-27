import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Juego here.
 * 
 * @author oschariv(Oscar Charro Rivera) 
 * @version 1.0(26-01-2017)
 */
public class Juego
{
    // Atributo para crear mazo.
    private Mazo mazoJuego;
    // ArrayList para lista de nombres.
    private ArrayList<String> nombre;
    //Array para guardar los nombres de los jugadores.
    private Jugador[] nombreJugadores;
    // atributo que guarda el palo que pinta.
    private int paloQuePinta;
    // Variable para guardar el nombre del jugador humano.
    String jugadorHumano;
    
    /**
     * Constructor for objects of class Juego
     * Nunca se debe especificar menos de tres o mas de 5 jugadores.
     */
    public Juego(int numeroJugadores, String nombreJugadorHumano)
    {
        // inicializamos todas las variables necesarias
        mazoJuego = new Mazo();
        nombre = new ArrayList<String>();
        nombreJugadores = new Jugador[numeroJugadores];
        paloQuePinta = 0;
        Random aleatorio = new Random();
        // Añadimos el jugador humano.
        jugadorHumano = nombreJugadorHumano;
        Jugador nuevoJugador = new Jugador(jugadorHumano);
        nombreJugadores[0] = nuevoJugador;
        
        // Muestra por pantalla un mensaje de bienvenida que muestra los nombres 
        //de los jugadores incluyendo el humano.
        System.out.println("Bienvenido a la partida " + jugadorHumano + ".");
        System.out.println("Tus rivales de la partida son:");
        
        //Agragamos todos los nombres preestablecidos al ArrayList.
        listaNombres();
        
        //Establecemos aleatoriamente nombre a los jugadores.
        //Se usan tantos nombres como numero de jugadores establecidos por el usuario
        for (int i = 1; i < numeroJugadores; i++){
            int valorAleatorio = aleatorio.nextInt(nombre.size());
            nuevoJugador = new Jugador(nombre.remove(i));
            nombreJugadores[i] = nuevoJugador;
            System.out.println("- " + nombreJugadores[i].getNombre());
        }    
        //Barajamos la baraja para que no sean monotonas las partidas.
        mazoJuego.barajar();
        
    }

    /**
     * Lista de nombres fijos para el juego.
     */
    private void listaNombres()
    {
        nombre.add("Maria");
        nombre.add("Santiago");
        nombre.add("Javier");
        nombre.add("Ana");
        nombre.add("Marcos");
        nombre.add("Carla");
        nombre.add("Oscar");
        nombre.add("Azahara");
        nombre.add("Luis");
        nombre.add("Eshter");
        nombre.add("Jose Luis");
        nombre.add("Borja");
        nombre.add("Marina");
        nombre.add("Daniel");
        nombre.add("Marta");
    }
    
    /**
     * Metodo que reparte 5 cartas a cada jugador creado. 
     * La ultima carta entregada es el palo que pinta.
     */
    public void repartir(){
        Carta cartaRecibida = null;
        for (int i = 0; i < 5; i++){
               for (Jugador jugador : nombreJugadores) {
                cartaRecibida = mazoJuego.sacarCarta();
                jugador.recibirCarta(cartaRecibida);
            }
        }
        paloQuePinta = cartaRecibida.getPalo();
        
        System.out.println("Sus cartas iniciales son:");
        nombreJugadores[0].verCartasJugador(jugadorHumano);
        String imprimir = "";
        switch(paloQuePinta){
            case 0:
                imprimir = "Oros";
                break;
            case 1:
                imprimir = "Copas";
                break;
            case 2:
                imprimir = "Espadas";
                break;
            case 3:
                imprimir = "Bastos";
        }
        
        System.out.println("Palo que pinta: " + imprimir);
    }
    
    /**
     * Metodo que permite ver las cartas de cada jugador.
     * Se debe indicar el nombre del jugador a mostrar
     */
    public void hacerTrampasYVerCartasDeJugador(String nombre){
        int jugadorActual = 0;
        boolean buscando = true;
        while (jugadorActual < nombreJugadores.length && buscando){
            if (nombre.equals(nombreJugadores[jugadorActual].getNombre())){
                nombreJugadores[jugadorActual].verCartasJugador(nombre);
                buscando = false;
            }
            jugadorActual++;
        }
    }
    
    /**
     * Metodo que permite ver las cartas del jugador Humano.
     */
    public void verCartasJugadorHumano(){
        nombreJugadores[0].verCartasJugador(jugadorHumano);
    } 
}