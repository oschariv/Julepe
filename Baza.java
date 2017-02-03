
/**
 * Write a description of class Baza here.
 * 
 * @author oschariv(Oscar Charro Rivera) 
 * @version 1.0(02-01-2017)
 */
public class Baza
{
    // Indica el numero de jugadores que van a tirar cartas.
    private int numeroJugadores;
    // Indica el palo que pinta.
    private int paloQuePinta;
    // Array para guardar las cartas de la baza.
    private Carta[] baza;
    // Array para guardar nombre de los jugadores.
    private String[] jugadores;
    // contador fijo para las cartas en la baza.
    private int contadorBaza;

    private Carta cartaGanadora;
    
    private String jugadorGanaBaza;
    /**
     * Constructor for objects of class Baza
     */
    public Baza(int numeroJugadores, int paloQuePinta)
    {
        this.numeroJugadores = numeroJugadores;
        this.paloQuePinta = paloQuePinta;
        baza = new Carta[numeroJugadores];
        jugadores = new String[numeroJugadores];
        contadorBaza = 0;
        cartaGanadora = null;
        jugadorGanaBaza = null;
    }

    /**
     * 
     */
    public void addCarta(Carta cartaATirar, String nombreJugador)
    {
        if (contadorBaza < numeroJugadores){
            baza[contadorBaza] = cartaATirar;
            jugadores[contadorBaza] = nombreJugador;

            if(contadorBaza == 0){
                cartaGanadora = cartaATirar;
                jugadorGanaBaza = nombreJugador;
            }
            else{
                if (cartaATirar.ganaA(cartaGanadora, paloQuePinta)){
                    cartaGanadora = cartaATirar;
                    jugadorGanaBaza = nombreJugador;
                }
            }
            
            contadorBaza++;
        }
    }

    /**
     * Metodo para obtener el palo de la primera carta de la baza.
     */
    public int  getPaloPrimeraCartaDeLaBaza(){
        int paloPrimeraCarta = -1;
        if (baza[0] != null){
            paloPrimeraCarta = baza[0].getPalo();
        }
        return paloPrimeraCarta;
    }

    /**
     * Metodo para ver la carta que va ganando la baza.
     */
    public Carta cartaQueVaGanandoLaBaza(){
        return cartaGanadora;
    }
    
    /**
     * 
     */
    public String nombreJugadorQueVaGanandoLaBaza(){
        return jugadorGanaBaza;
    }
}



