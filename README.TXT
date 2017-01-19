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

