
/**
 * Write a description of class Carta here.
 * 
 * @author oschariv(Oscar Charro Rivera) 
 * @version 1.0(19-01-2017)
 */
public class Carta
{
    // almacena el palo
    private int palo;
    //almacena la numeracion
    private int numeracion;

    /**
     * Constructor for objects of class Carta
     * Primer parametro(numeracion) de 1 a 7 o de 10 a 12. 8 y 9 no cuentan 
     * en la baraja española.
     * Segundo parametro (palo) de 0 a 3, donde 0 es oros, 1 es copas, 2 es espadas 
     * y 3 es bastos.
     */
    public Carta(int numeracion, int palo)
    {
        if ((numeracion >=1 && numeracion <=7)|| (numeracion >= 10 && numeracion <= 12))
        {
            if (palo >=0 && palo <= 3){
                this.numeracion = numeracion;
                this.palo = palo;
            }
        }
    }
    
    /**
     * Metodo que devuelve en cadena de caracteres (en minusculas) que devuelve el
     * nombre de la carta solicitada a mostrar.
     * 0 es oros, 1 es copas, 2 es espadas y 3 es bastos
     */
    public String toString()
    {
        String cartaADevolver = "";
        String paloADevolver = "";
        String numeracionADevolver = "";
        // comprobamos de que palo es.
        if (palo == 0) {
            paloADevolver = "oros";
        }
        else if(palo == 1){
            paloADevolver = "copas";
        }
        else if(palo == 2){
            paloADevolver = "espadas";
        }
        else if(palo == 3){
            paloADevolver = "bastos";
        }
        
        // Comprobamos si tiene nombre especial.
        if (numeracion == 1) {
            numeracionADevolver = "as";
        }
        else if(numeracion == 10){
            numeracionADevolver = "sota";
        }
        else if(numeracion == 11){
            numeracionADevolver = "caballo";
        }
        else if(numeracion == 12){
            numeracionADevolver = "rey";
        }
        else {
            numeracionADevolver += numeracion;
        }
        cartaADevolver = numeracionADevolver + " de " + paloADevolver;
        
        return cartaADevolver;
    }
    
    /**
     * Devuelve el palo de las cartas.
     */
    public int getPalo(){
        return palo;
    }
    
    /**
     * Devuelve la numeracion de las cartas.
     */
    public int getNumeracion(){
        return numeracion;
    }
}
