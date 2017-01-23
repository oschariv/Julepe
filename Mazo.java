import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Mazo here.
 * 
 * @author oschariv(Oscar Charro Rivera) 
 * @version 1.0(19-01-2017)
 */
public class Mazo
{
    // ArrayList para guardar la coleccion de cartas
    private ArrayList<Carta> mazo;
    
    /**
     * Constructor for objects of class Mazo
     * El constructor crea el mazo automaticamente (no se incluyen 8 ni 9).
     */
    public Mazo()
    {
        mazo = new ArrayList<Carta>();
        
        for (int palo = 0; palo <= 3; palo++) {            
            for (int numeracion = 1; numeracion <= 12;numeracion++) {                
                if (numeracion != 8 && numeracion != 9) {
                    mazo.add(new Carta(numeracion, palo));   
                }
            }
        }
    }
    
    /**
     * Permite ver todas las cartas del mazo ordenada.
     * Invoca el metodo toString de la clase carta automaticamente.
     */
    public void verCartasDelMazo(){
        for (int contador = 0; contador < mazo.size(); contador++){
            System.out.println(mazo.get(contador));
        }
    }
    
    /**
     * Permite barajar el mazo aleatoriamente.
     */
    public void barajar(){
        for (int posicionActual = 0; posicionActual < mazo.size(); posicionActual++) {
            Carta carta1 = mazo.get(posicionActual);
            Random aleatorio = new Random();
            int posicionAleatoria = aleatorio.nextInt(mazo.size());
            mazo.set(posicionActual, mazo.get(posicionAleatoria));
            mazo.set(posicionAleatoria, carta1);
        }
    }
    
    /**
     * Metodo que permite sacar una carta del mazo y ademas elimina esta
     * automaticamente.
     */
    public Carta sacarCarta(){
        Carta cartaSacada = null;
        if (mazo.size() > 0){
            cartaSacada = mazo.remove(0);
        }
        return cartaSacada;
    }
}
