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
     */
    public Mazo()
    {
        mazo = new ArrayList<Carta>();
        
        for (int palo = 0; palo <= 3; palo++) {
            for (int numeracion = 1; numeracion <= 12;numeracion++) {
                if (((numeracion >=1 && numeracion <=7) || (numeracion >= 10 && 
                    numeracion <= 12))){
                    switch (numeracion){
                        case 1:
                            Carta elAs = new Carta(1, palo);
                            mazo.add(elAs);
                            continue;
                        case 10:
                            Carta laSota = new Carta(10, palo);
                            mazo.add(laSota);
                            continue;
                        case 11:
                            Carta elCaballo = new Carta(11, palo);
                            mazo.add(elCaballo);
                            continue;
                        case 12:
                            Carta elRey = new Carta(12, palo);
                            mazo.add(elRey);
                            continue;
                        default:
                            Carta restantes = new Carta(numeracion, palo);
                            mazo.add(restantes);
                    }
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
