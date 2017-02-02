
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
    
    private String[] jugadores;
    
    private int contadorBaza;

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
    }

    /**
     * 
     */
    public void addCarta(Carta cartaATirar, String nombreJugador)
    {
        if (contadorBaza < numeroJugadores){
            baza[contadorBaza] = cartaATirar;
            jugadores[contadorBaza] = nombreJugador;
            contadorBaza++;
        }
    }
    
    /**
     * 
     */
    public int  getPaloPrimeraCartaDeLaBaza(){
        int paloPrimeraCarta = -1;
        if (baza[0] != null){
            paloPrimeraCarta = baza[0].getPalo();
        }
        return paloPrimeraCarta;
    }
}
