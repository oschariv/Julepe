
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
}
