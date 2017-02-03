------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:Julepe
PURPOSE OF PROJECT: Juego de naipes en el que se emplea baraja española y 
en el que intervienen 6 o más jugadores, cada uno de los cuales tiene 
cinco cartas; el juego consiste en hacer bazas, ganando la baza la carta 
más alta del palo de triunfo o, en su defecto, la más alta del palo de salida; 
gana la partida y una cantidad en depósito el que consigue hacer como mínimo 
dos bazas de las cinco posibles.

VERSION or DATE:19-01-2017
HOW TO START THIS PROJECT:
AUTHORS:Oscar Charro Rivera
USER INSTRUCTIONS:

19-01-2017:

Crear una clase llamada Carta con un constructor que admita dos 
parametros enteros. El primer parametro indica el valor de la carta y 
puede ser desde 1 a 7 o desde 10 a 12. El segundo, indica el palo de 
la carta y puede ser de 0 a 3 (0 es oros, 1 es copas, 2 es espadas y 
3 es bastos).  Crear el metodo toString que devuelve el nombre de 
la carta (del tipo "as de oros", "7 de espadas", "3 de copas", 
"caballo de bastos") y los metodos getter de ambos atributos que 
devuelven enteros. 

El nombre de la carta se devuelve en minusculas. El constructor asume 
que los valores de los par�metros son legales.

----------------------------------------------------

Os dejo la clase TestCarta que testea la clase Carta: 
https://gist.github.com/miguelbayon/7e33f5919d092424a22d46939c9a4ffd. 
Comprobad que vuestra clase pasa los tests.

---------------------------------------------------

Crear una clase llamaza Mazo. El constructor de la clase Mazo 
debe encargrse de crear las 40 cartas de la baraja española y de 
dejarlas guardadas de alguna forma.

Crear un método verCartasDelMazo que muestra linea a linea todas los nombres 
de las cartas existentes en el mazo.

---------------------------------------------------

20-01-2017

Implementa un metodo llamado barajar en la clase Mazo que no devuelva nada 
y consiga mezclar las cartas existentes en ese momento en el mazo.


--------------------------------------------------

Implementar un metodo llamado sacarCarta en la clase Mazo que devuelva 
un objeto Carta. Concretamente debe devolver la primera carta del mazo, 
eliminando esta del mazo.

-------------------------------------------------

23-01-2017

Crear un array de Strings en CodePad que sea capaz de albergar 4 String. 
Darle valor a cada elemento del array. Hacer un bucle que muestre por 
pantalla todos los elementos del array.

Añadir la clase Jugador que permita a un jugador identificado por un 
nombre (en formato String) ser capaz de tener hasta 5 cartas. El 
constructor debe admitir el nombre del jugador como parámetro. Además 
debe haber un método llamado recibirCarta que permita un parametro de 
tipo Carta y un método llamado verCartasJugador que imprima por pantalla 
las cartas del jugador, una por linea, y que funcione tenga las cartas 
que tenga.

Es obligatorio usar un array para guardar las cartas del jugador.

-------------------------------------------------

26-01-2017

Añadir una clase Juego. En el constructor de Juego se crean tantos 
jugadores como se especifiquen por parametro y un mazo. Sabemos que 
nunca se van a especificar menos de 3 ni más de 5 jugadores. 

Los nombres de los jugadores deben ser asignados de forma aleatoria 
entre un conjunto de nombres (dos jugadores no pueden tener el mismo nombre).

Implementar en esa clase un método llamado repartir que coja el mazo 
y de 5 cartas a los jugadores creados. La entrega de cartas debe ser 
al estilo del reparto que se hace en la realidad, es decir, primero 
se baraja y luego se entrega una carta a cada jugador. La última 
carta entregada indica el palo que pinta, que debe registrarse de
alguna foma.

Implementa en la clase Jugador un metodo llamado getNombre que devuelva 
como String el nombre del jugador.

Implementa un método llamado verCartasJugador que muestre por pantalla 
las cartas de un jugador. Para saber qué jugador mostrar, indicamos como 
parámetro del método el nombre del Jugador.

En esta actividad no se puede tocar ninguna de las clases ya creadas 
excepto añadir el método getNombre en la Jugador.

-------------------------------------------------

27-01-2017

Vamos a pensar ahora que el primer jugador es siempre el humano 
que interactua con nuestro programa y el resto, jugadores controlados 
por el ordenador.

Modificar la clase Juego para que:
- El constructor admita como segundo parametro el nombre del jugador 
humano. Además debe mostrar por pantalla un mensaje de bienvenida y 
el nombre de cada uno de los jugadores de la partida (incluyendo el humano) .
- El metodo repartir debe mostrar por pantalla el palo que pinta con 
un mensaje del tipo "Pintan bastos" o "Pintan oros" y debe devolver 
el número asociado con el palo que pinta. Además debe mostrar por 
pantalla las cartas que recibe el jugador humano.
- Añadir un método verCartasJugadorHumano que muestre las cartas del 
jugador humano.
- Modificar el nombre del metodo verCartasJugador para que pase a 
llamarse hacerTrampasYVerCartasDeJugador.

Ojo, el primer parámetro de constructor sigue siendo el numero de 
jugadores totales!!

Modificar la clase Jugador para que:
- Exista un nuevo método que sea tirarCarta. Admite un parámetro 
String que indica el nombre de la carta a tirar. El método muestra 
por pantalla el nombre del jugador que ha tirado la carta y la carta 
tirada. Devuelve la carta tirada. En caso de que el jugador no tenga 
cartas o de que el nombre especificado como parámetro no coincida 
con ninguna carta, devuelve null.
- Exista un nuevo método que sea tirarCartaAleatoria. El método 
muestra por pantalla el nombre del jugador que ha tirado la carta 
y la carta tirada. Devuelve la carta tirada. En caso de que el jugador 
no tenga cartas, devuelve null.

-------------------------------------------------

30-01-2017

Modificar la clase Carta para que:
- Exista un método llamado ganaA que reciba un parámetro de tipo Carta 
y un parámetro de tipo entero que indica el palo que pinta. El método 
devuelve true en caso de que la carta sea superior a la carta pasada 
como parámetro conforme a las reglas del tute recogidas en la Wikipedia 
y false en caso contrario. No hace falta comproar que el parámetro sea 
null o no, se asume que no lo es.

-------------------------------------------------
02-01-2017

Crear una clase Baza que (haz un commit por cada punto):
- Tenga un constructor que admita dos parametros. El primero es un entero 
que indica el número de jugadores que van a tirar carta y el segundo es otro 
entero que indica el palo que pinta.
- Tenga un método llamado addCarta que admita un parámetro de tipo Carta y 
un segundo parámetro de tipo String. El primer parámetro representa la carta 
que tira un jugador a la mesa y que, por tanto, se añade a la baza. No hace 
falta comprobar que la carta añadida sea o no null, se supone que es una carta.
El segundo parámetro indica el nombre del jugador que tiro la carta. El método 
no devuelve nada.
- Tenga un método llamado getPaloPrimeraCartaDeLaBaza sin parámetros que 
devuelva un entero que representa el palo de la primera carta añadida a la 
baza o -1 en caso de que no se haya añadido aún ninguna carta.
- Tenga un método llamado cartaQueVaGanandoLaBaza sin parámetros que devuelva 
un objeto Carta. Este objeto carta es la carta que va ganando la baza conforme 
a las normas del julepe. En caso de que la baza este vacía este método devuelve 
null.
- Tenga un método llamado nombreJugadorQueVaGanandoLaBaza que no admite 
parámetros y que devuelve el nombre del jugador que va ganando la baza en 
el momento actual.

--------------------------------------------------

03-01-2017

Modifica la clase Jugador para que:
- Exista un método llamado tirarCartaInteligentemente. Debes pensar qué 
parámetros son necesarios para que un jugador pueda decidir inteligentemente 
que carta tirar. Sin embargo, aunque debes poner los parámetros correctos, 
vamos a suponer, de momento, que el jugador tira la carta, al fin y al cabo, 
de forma aleatoria.

Los parametros del metodo tirarCartaInteligentemente son: 
- Palo de la primera carta.
- El valor y palo de la carta que va ganando.
- Palo que pinta.

Modifica la clase Jugador para que:
- Exista un método llamado addBaza que se invocará cuando el jugador gana 
una baza y se la lleva. El método admite un parámetro de tipo Baza (la baza 
que ha ganado el jugador) que se asume nunca va a ser null. El método no 
devuelve nada. 
- Exista un método llamado getNumeroBazasGanadas. El método no tiene 
parámetros y devuelve el número de bazas que el jugador lleva ganadas en 
el momento actual.

