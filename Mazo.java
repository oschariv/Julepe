import java.util.ArrayList;
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
    // almacena el palo
    private int palo;
    //almacena la numeracion
    private int numeracion;

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

    public void verCartasDelMazo(){
        for (int contador = 0; contador < mazo.size(); contador++){
            System.out.println(mazo.get(contador));
        }
    }
}
