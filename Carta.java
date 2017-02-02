
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
        if ((numeracion >=1 && numeracion <=7) || (numeracion >= 10 && 
            numeracion <= 12)){
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
        switch(palo){
            case 0:
                paloADevolver = " de oros";
                break;
            case 1:
                paloADevolver = " de copas";
                break;
            case 2:
                paloADevolver = " de espadas";
                break;
            case 3:
                paloADevolver = " de bastos";
        }
                
        // Comprobamos si tiene nombre especial.
        switch(numeracion){
            case 1:
                numeracionADevolver = "as";
                break;
            case 10:
                numeracionADevolver = "sota";
                break;
            case 11:
                numeracionADevolver = "caballo";
                break;
            case 12:
                numeracionADevolver = "rey";
                break;
            default:
                numeracionADevolver += numeracion;
        }
        cartaADevolver = numeracionADevolver + paloADevolver;
        
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
    
    /**
     *  método llamado ganaA que reciba un parámetro de tipo Carta 
     * y un parámetro de tipo entero que indica el palo que pinta. El método 
     * devuelve true en caso de que la carta sea superior a la carta pasada 
     * como parámetro conforme a las reglas del tute recogidas en la Wikipedia 
     * y false en caso contrario. No hace falta comproar que el parámetro sea 
     * null o no, se asume que no lo es.
     */
    public boolean ganaA(Carta cartaComparar, int paloQuePinta) {
        boolean gana = false;
        if (palo == cartaComparar.getPalo()){
            // En caso de que tengan el mismo palo.
            if (getPosicionEscalaTute() > cartaComparar.getPosicionEscalaTute()){
                gana = true;
            }
        } else {
            // En caso de que tengan distinto palo.
            if (cartaComparar.getPalo() != paloQuePinta){
                gana = true;
            }
        }
        
        
        return gana;
    }
    
    /**
     * 
     */
    public int getPosicionEscalaTute (){
        int posicion = numeracion;
            
        if (numeracion == 3) {
            posicion = 13;
        }
        else if (numeracion == 1) {
            posicion = 14;
        }
    
        return posicion;
    }
}











