import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class Jugador here.
 * 
 * @author oschariv(Oscar Charro Rivera) 
 * @version 1.0(23-01-2017)
 */
public class Jugador
{
    // Almacena variables String para los nombres del jugador.
    private String nombre;
    // Array de tipo carta.
    private Carta[] mano;
    // Contador para saber cuantas cartas a recibido.
    private int contadorMano;  
    // ArrayLista para guardar las bazas ganadas.
    private ArrayList<Baza> bazasGanadas;
     
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nombre)
    {
        this.nombre = nombre; 
        mano = new Carta[5];
        contadorMano = 0;
    }

    /**
     * Metodo que nos permite recibir una carta.
     * Las cartas se reciben una a una.
     */
    public void recibirCarta(Carta carta){ 
        if (contadorMano < 5){
            mano[contadorMano] = carta;
            contadorMano++;
        }
    }
    
    /**
     * Metodo que nos permite ver las cartas de un jugador en concreto.
     */
    public void verCartasJugador(String nombre){
        for (int i= 0; i < mano.length; i++){
            if (mano[i] != null){
                System.out.println(mano[i]);
            }            
        }
    }
    
    /**
     * Metodo que devuelve el nombre del jugador.
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo que nos permite tirar una carta.
     * El método muestra por pantalla el nombre del jugador que ha tirado la carta 
     * y la carta tirada. Devuelve la carta tirada. En caso de que el jugador 
     * no tenga cartas o de que el nombre especificado como parámetro no coincida 
     * con ninguna carta, devuelve null.
     */
    public Carta tirarCarta(String cartaATirar){
        Carta cartaTirada = null;
        if (contadorMano > 0){
            int cartaActual = 0;
            boolean buscando = true;
            while (cartaActual < mano.length && buscando) {
                if (mano[cartaActual]!= null) {
                
                
                    if (cartaATirar.equals(mano[cartaActual].toString())){
                        buscando = false;
                        cartaTirada = mano[cartaActual];
                        mano[cartaActual] = null;
                        contadorMano--;
                        System.out.println("Eljugador " + nombre + 
                                " ha tirado la carta " + cartaTirada.toString());
                    }
                }
                cartaActual++;
            }
        }
        
        return cartaTirada;
    }
    
    /**
     * Metodo que permite tirar una carta aleatoria.
     * El método muestra por pantalla el nombre del jugador que ha tirado la carta 
     * y la carta tirada. Devuelve la carta tirada. En caso de que el jugador 
     * no tenga cartas o de que el nombre especificado como parámetro no coincida 
     * con ninguna carta, devuelve null.
     */
    public Carta tirarCartaAleatoria(){
        Carta cartaTirada = null;
        if (contadorMano > 0) {
            Random aleatorio = new Random();
            boolean elJugadorHaTiradoUnaCarta = false;
            while(elJugadorHaTiradoUnaCarta){
                int posicionAleatoria = aleatorio.nextInt(5);
                if (mano[posicionAleatoria] != null) {
                    cartaTirada = mano[posicionAleatoria];
                    mano[posicionAleatoria] = null;
                    contadorMano--;
                    System.out.println("Eljugador " + nombre + 
                                 " ha tirado la carta " + cartaTirada.toString());
                    elJugadorHaTiradoUnaCarta = true;
                }
            }
            
        }
        
        
        return cartaTirada;
    }
    
    /**
     * 
     */
    public void addBaza(Baza bazaGanada){
        bazasGanadas.add(bazaGanada);
    }
    
    /**
     * 
     */
    public int getNumeroBazasGanadas(){
        return bazasGanadas.size();
    }
    
    /**
     * Metodo para tirar una carta Inteligentemente.
     */
    public Carta tiraCartaInteligentemente(int paloPrimeraCartaDeLaBaza, 
             Carta cartaQueVaGAnando, int paloQuePinta){
        return tirarCartaAleatoria();
    }
}
