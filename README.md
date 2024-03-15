[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/NBVXLiSy)
# Actividad: Desarrollo de Proyecto Software en Kotlin

**ID actividad:** 2324_PRO_u4u5u6_libre

**Agrupamiento de la actividad**: Individual 

---

### Descripción:

La actividad consiste en el desarrollo de un proyecto software en Kotlin, permitiendo al estudiante elegir la temática. Este proyecto debe demostrar la comprensión y aplicación de los conceptos de programación orientada a objetos (POO), incluyendo la definición y uso de clases, herencia, interfaces, genericos, principios SOLID y el uso de librerías externas.

**Objetivo:**

- Demostrar comprensión de los fundamentos de POO mediante la instanciación y uso de objetos.
- Aplicar conceptos avanzados de POO como herencia, clases abstractas, e interfaces.
- Crear y usar clases que hagan uso de genéricos. 
- Aplicar principios SOLID.
- Integrar y utilizar librerías de clases externas para extender la funcionalidad del proyecto.
- Documentar y presentar el código de manera clara y comprensible.

**Trabajo a realizar:**

1. **Selección de la Temática:** Elige un tema de tu interés que pueda ser abordado mediante una aplicación software. Esto podría ser desde una aplicación de gestión para una pequeña empresa, una herramienta para ayudar en la educación, hasta un juego simple. Define claramente el problema que tu aplicación pretende resolver.

2. **Planificación:** Documenta brevemente cómo tu aplicación solucionará el problema seleccionado, incluyendo las funcionalidades principales que desarrollarás.

3. **Desarrollo:**
   - **Instancia de Objetos:** Tu aplicación debe crear y utilizar objetos, demostrando tu comprensión de la instanciación y el uso de constructores, métodos, y propiedades.
   - **Métodos Estáticos:** Define y utiliza al menos un método estático, explicando por qué es necesario en tu aplicación.
   - **Uso de IDE:** Desarrolla tu proyecto utilizando un IDE, aprovechando sus herramientas para escribir, compilar, y probar tu código.
   - **Definición de Clases:** Crea clases personalizadas con sus respectivas propiedades, métodos, y constructores.
   - **Clases con genéricos:** Define y utiliza al menos una clase que haga uso de genéricos en tu aplicación.
   - **Herencia y Polimorfismo:** Implementa herencia y/o interfaces en tu proyecto para demostrar la reutilización de código y la flexibilidad de tu diseño.  **Usa los principios SOLID:** Ten presente durante el desarrollo los principios SOLID y úsalos durante el diseño para mejorar tu aplicación.
   - **Librerías de Clases:** Integra y utiliza una o más librerías externas que enriquezcan la funcionalidad de tu aplicación.
   - **Documentación:** Comenta tu código de manera efectiva, facilitando su comprensión y mantenimiento.

4. **Prueba y Depuración:** Realiza pruebas para asegurarte de que tu aplicación funciona como se espera y depura cualquier error encontrado.
5. **Contesta a las preguntas** ver el punto **Preguntas para la Evaluación**

### Recursos

- Apuntes dados en clase sobre programación orientada a objetos, Kotlin, uso de IDEs, y manejo de librerías.
- Recursos vistos en clase, incluyendo ejemplos de código, documentación de Kotlin, y guías de uso de librerías.

### Evaluación y calificación

**RA y CE evaluados**: Resultados de Aprendizaje 2, 4, 6, 7 y Criterios de Evaluación asociados.

**Conlleva presentación**: SI

**Rubrica**: Mas adelante se mostrará la rubrica.

### Entrega

> **La entrega tiene que cumplir las condiciones de entrega para poder ser calificada. En caso de no cumplirlas podría calificarse como no entregada.**
>
- **Conlleva la entrega de URL a repositorio:** El contenido se entregará en un repositorio GitHub. 
- **Respuestas a las preguntas:** Deben contestarse en este fichero, README.md


# Preguntas para la Evaluación

Este conjunto de preguntas está diseñado para ayudarte a reflexionar sobre cómo has aplicado los criterios de evaluación en tu proyecto. Al responderlas, **asegúrate de hacer referencia y enlazar al código relevante** en tu `README.md`, facilitando así la evaluación de tu trabajo.

#### **Criterio global 1: Instancia objetos y hacer uso de ellos**
- **(2.a, 2.b, 2.c, 2.d, 2.f, 2.h, 4.f, 4.a)**: Describe cómo has instanciado y utilizado objetos en tu proyecto. ¿Cómo has aplicado los constructores y pasado parámetros a los métodos? Proporciona ejemplos específicos de tu código.

   Para instanciar objetos he utilizado diversas estructuras. Desde abstract class hasta open class (para variar un poco en las formas de hacerlo). Por ejemplo, la abstract class Player(){}:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/gameflow/Player.kt#L11-L17

   Como se puede observar en el código se ha creado la abstract class Player(){} de esta manera con el fin de que sirva de plantilla para las clases jugables del juego (Fighter, Cleric, Rogue y Sorcerer). A la hora de instanciarlo, como es una abstract class no se puede instanciar como objeto en sí, pero sí se pueden instanciar sus derivadas. Lo he construido de la siguiente forma:

   Se crea una instancia de player en el main:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/Main.kt#L24

   Y esto llama al objeto CreatePlayer (y a su función createChar), que entre otras cosas lo que hace es llamar a un constructor de clases:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/gameflow/CreatePlayer.kt#L51-L62

   Por otro lado, para mostrar el cómo he pasado parámetros a los distintos métodos tenemos el ejemplo de la tabla que muestra los datos del jugador:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/Main.kt#L26

   La función tiene por parámetro un jugador, por lo que al invocarla en el main necesitamos que reciba el jugador en cuestión (por eso existe la variable val player = CreatePlayer.createChar())

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/console/ConsoleSystem.kt#L110-L123



#### **Criterio global 2: Crear y llamar métodos estáticos**
- **(4.i)**: ¿Has definido algún método/propiedad estático en tu proyecto? ¿Cuál era el objetivo y por qué consideraste que debía ser estático en lugar de un método/propiedad de instancia?

   En todo lo que rodea al dado se han utilizado propiedades estáticas. Para diferenciar los tipos de dado (en base a su número de caras) se ha usado una enum class:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/miscellaneous/Die.kt#L7-L16

   Esta enum class recibe el parámetro numberOfFaces: Int que será usado en conjunto con una clase y una interfaz para poder tirar el dado con éxito.

   Además de esto, también se utiliza de manera estática el objeto ConsoleSystem. Este objeto se encarga de todo lo relacionado con la consola por lo que facilita mucho su implementación el hecho de que sea estático.

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/console/ConsoleSystem.kt#L36

- **(2.e)**: ¿En qué parte del código se llama a un método estático o se utiliza la propiedad estática?

   En cualquier parte en la que se necesitase un uso de un comando de consola. Por ejemplo:


   A la hora de crear un personaje se realizan varias salidas de consola, por lo que se requiere de su uso:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/gameflow/CreatePlayer.kt#L47-L62

   Así es como se ha implementado el objeto de ConsoleSystem:
  
https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/console/ConsoleSystem.kt#L14-L36

#### **Criterio global 3: Uso de entornos**
- **(2.i)**: ¿Cómo utilizaste el IDE para el desarrollo de tu proyecto? Describe el proceso de creación, compilación, y prueba de tu programa.

  El uso del IDE ha sido fundamental en la realización de este trabajo ya que el uso de las herramientas de depuración han solventado varios de los errores generados por la mala gestión del código implementado. Recuerdo al menos tres ocasiones en las que se ha tenido que realizar un uso exhaustivo del depurador:

  La primera fue intentando solventar un bucle infinito en la función CombatManager.startCombat() debido a un mal posicionamiento de las instrucciones dentro (en este caso fuera) del bucle while.
  https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/combat/CombatManager.kt#L19

  Otro error solucionado depurando fue, también relacionado con el combate, el que no bajase la vida ni del jugador ni del enemigo. Esto era debido a que las funciones que controlan el daño takeDmg() no estaban recalculando bien currentHealth.

  El último error, y el más rápido de solucionar fue un fallo al aplicar las restricciones a la creación de una clase falsa para probar funciones. Asigné una clase Fighter("", 0, 0, 0, etc. . .) y claro, no se puede tener un constructor de nombre vacío. 

#### **Criterio global 4: Definir clases y su contenido**
- **(4.b, 4.c, 4.d, 4.g)**: Explica sobre un ejemplo de tu código, cómo definiste las clases en tu proyecto, es decir como identificaste las de propiedades, métodos y constructores y modificadores del control de acceso a métodos y propiedades, para representar al objeto del mundo real. ¿Cómo contribuyen estas clases a la solución del problema que tu aplicación aborda?

   Tanto esta pregunta como la que viene a continuación están muy ligadas. Antes de comenzar la parte de programación se realizó un esquema de en qué consistiría el proyecto (evidentemente, como buen proyecto abarcaba más del tiempo del que disponíamos). Esto implica crear en el IDE una estructura de directorios y clases bien compartimentada con el fin de organizar semánticamente las clases para declarar claramente las áreas de trabajo y su función.

   Después de identificar qué clases entraban dentro de lo necesario para la realización del proyecto se procedió a asignarles parámetros y qué devolvía cada método de las distintas clases (en caso de que devolvieran algo). La mejor forma de ejemplificarlo es con la clase Clérigo:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/classes/Cleric.kt#L16-L25

   Si pensásemos en un clérigo como clase jugable en un videojuego o en un contexto de fantasía, nos vendrían una serie de características o atributos básicos rápidamente. Un clérigo tiene un nombre, tiene una serie de puntos de vida (y por ende, al pelear y recibir daño, puntos que varían dinámicamente). Además, se implementan una serie de características acorde a la clase, en este caso el clérigo se representa como un guerrero divino por lo que se le añade armadura y regeneración (aún no implementadas). El uso de clases como esta permiten que el proyecto tome forma, ya que es común en este tipo de juegos pertenecer a una especialización concreta que determina tus habilidades en el mundo. 

   Esta descripción se puede aplicar a más objetos. Por ejemplo como se hace con el dado. Un dado tiene caras, por lo que a la hora de programarlo se le pasa el atributo numberOfFaces: Int. Esto ayuda a la virtualización de lo que sería un dado real.

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/miscellaneous/Die.kt#L7

#### **Criterio global 5: Herencia y uso de clases abstractas e interfaces**
- **(4.h, 4.j, 7.a, 7.b, 7.c)**: Describe sobre tu código cómo has implementado la herencia o utilizado interfaces en tu proyecto. ¿Por qué elegiste este enfoque y cómo beneficia a la estructura de tu aplicación? ¿De qué manera has utilizado los principios SOLID para mejorar el diseño de tu proyecto? ¿Mostrando tu código, contesta a qué principios has utilizado y qué beneficio has obtenido?

   Como se menciona en la pregunta anterior, a la hora de crear el esqueleto del proyecto también se asignan en la medida de lo posible las herencias más básicas para guiar el correcto avance del proyecto. Evidentemente al avanzar habrá que seguir administrando relaciones de herencia pero es una ayuda vital. Esto se muestra en casos como Player -> Cleric, Fighter, Rogue, Sorcerer, donde Player es una abstract class que sirve como plantilla para luego ser especializado en una clase más concreta.

Player:
https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/gameflow/Player.kt#L11

Cleric:
https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/classes/Cleric.kt#L16-L25

   En lo referente a las interfaces, han sido usadas en dos puntos concretos que han facilitado y simplificado muchísimo la gestión del código. El primer caso ha sido con el dado:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/miscellaneous/Die.kt#L21-L28

   Esta interfaz únicamente realiza el roll. Después DiceRoller hace un override de la función roll y modifica lo que hace, permitiendo que la función tenga responsabilidad única y que no sea necesario modificarla (Principios de responsabilidad única y abierto/cerrado). Además, si se quisiera extender el código simplemente necesitaríamos añadir otro dado más en la enum class DiceType():

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/miscellaneous/Die.kt#L7-L16

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/miscellaneous/Die.kt#L33-L42

   El otro uso de interfaces ha sido en lo referente a la consola. Se han creado las interfaces Sender y Reader. De esta manera se atomiza y centraliza aún más el código y no se van generando println() por todos los ficheros:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/console/ConsoleSystem.kt#L14-L52

#### **Criterio global 6: Diseño de jerarquía de clases**
- **(7.d, 7.e, 7.f, 7.g)**: Presenta la jerarquía de clases que diseñaste. ¿Cómo probaste y depuraste esta jerarquía para asegurar su correcto funcionamiento? ¿Qué tipo de herencia has utilizado: Especificación, Especialización, Extensión, Construcción?

   El método de herencia que más se ha utilizado en el proyecto es el de especialización. Esto se ve reflejado en herencias como la de Player-> Cleric, Fighter, Rogue y Sorcerer. Estas cuatro clases son especializaciones de una abstract class Player. Lo mismo pasa con Enemy-> Rat, Bandit, etc.

   A nivel de depuración, se han realizado pruebas para comprobar que Cleric, por ejemplo, llegue correctamente a Player para obtener sus atributos. 

#### **Criterio global 7: Librerías de clases**
- **(2.g, 4.k)**: Describe cualquier librería externa que hayas incorporado en tu proyecto. Explica cómo y por qué las elegiste, y cómo las incorporaste en tu proyecto. ¿Cómo extendió la funcionalidad de tu aplicación? Proporciona ejemplos específicos de su uso en tu proyecto.

   En el proyecto se han utilizado las librerías de Mordant y JUnit. En el caso de Mordant permite personalizar la consola del IDE de manera amplia permitiendo un producto más bonito. Su implementación fue sencilla (implementarlo en la librería) y simplemente hay que llamar a la terminal:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/console/ConsoleSystem.kt#L55-L60

   Esto permite el acceso a una serie de métodos que embellecen mucho el texto. Además de acceso a tablas:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/console/ConsoleSystem.kt#L110-L123

   Otra librería usada es la de JUnit, que ha sido usada en la realización de los tests para probar algunas funciones: 

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/test/kotlin/gameflow/PlayerTest.kt#L3-L71

#### **Criterio global 8: Documentado**
- **(7.h)**: Muestra ejemplos de cómo has documentado y comentado tu código. ¿Que herramientas has utilizado? ¿Cómo aseguras que tu documentación aporte valor para la comprensión, mantenimiento y depuración del código?

   Se ha documentado en KDoc. Para poder documentar el código se han usado una serie de etiquetas que muestran el contenido que señales como @param o @return. Documentar y comentar el código de manera exhaustiva permite un rápido y claro entendimiento de este sin importar ni quién lo lea ni cuando. Algunos ejemplos del código del proyecto:

Cleric:

https://github.com/aaracan246/PruebaFinalProg/blob/41b05da3d70a6accfa4d4f9a685d8e6fa0a73fec/src/main/kotlin/classes/Cleric.kt#L5-L16

Comentarios a nivel de código:

https://github.com/aaracan246/PruebaFinalProg/blob/9a937d62babbc961c3bacb52253a8d6026bcfdc1/src/main/kotlin/Main.kt#L10-L43

En el main se han realizado comentarios con el fin de explicar cómo funciona cada instrucción.

#### **Criterio global 9: Genéricos**
- **(6.f)**: Muestra ejemplos de tu código sobre cómo has implementado una clase con genéricos. ¿Qué beneficio has obtenido?


   El uso de genéricos en el proyecto es muy concreto y se ve reflejado en la interfaz del creador de personajes CreatePlayer:

https://github.com/aaracan246/PruebaFinalProg/blob/9a937d62babbc961c3bacb52253a8d6026bcfdc1/src/main/kotlin/gameflow/CreatePlayer.kt#L18-L24

Al implementarlo de esta manera, no hay que modificar nada en la interfaz y podemos crear un personaje de cualquier tipo mientras sea una especialización o extensión de Player.

https://github.com/aaracan246/PruebaFinalProg/blob/9a937d62babbc961c3bacb52253a8d6026bcfdc1/src/main/kotlin/gameflow/CreatePlayer.kt#L87-L89
  

