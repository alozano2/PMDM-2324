package com.ejemplo.pmdm_2324.ut06;

import java.io.Serializable;
import java.util.ArrayList;

public class u6a1Libros implements Serializable {
    public static final String CLAVE_LIBRO = "libro";
    private String titulo;
    private String autor;
    private String editorial;
    private String descripcion;

    public u6a1Libros (String titulo, String autor, String editorial, String descripcion){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public static ArrayList<u6a1Libros> generador() {
        ArrayList<u6a1Libros> libros = new ArrayList<u6a1Libros>();
        libros.add(new u6a1Libros("El señor de los anillos", "J.R.R Tolkien", "Booket", "Una edición que reúne los tres volúmenes de la gran trilogía de J.R.R. Tolkien: La comunidad del anillo, Las dos torres y El retorno del rey. Los Anillos de Poder fueron forjados en antiguos tiempos por los herreros Elfos, y Sauron, el Señor Oscuro, forjó el Anillo Único. Pero en una ocasión se lo quitaron, y aunque lo buscó por toda la Tierra Media nunca pudo encontrarlo. Al cabo de muchos años fue a caer casualmente en manos del hobbit Bilbo Bolsón. Sauron llegó a reunir todos los Grandes Anillos, pero continuaba buscando el Anillo Único que completaría el dominio de Mordor. Bilbo desapareció durante la celebración de su centesimodecimoprimer cumpleaños, y dejó a Frodo a cargo del Anillo, y con una peligrosa misión por delante: atravesar la Tierra Media, internarse en las sombras del País Oscuro y destruir el Anillo arrojándolo en las Grietas del Destino."));
        libros.add(new u6a1Libros("La carretera", "Cormac Mccarthy", "DeBolsillo", "*Premio Pulitzer 2007* Una demoledora fábula sobre el futuro del ser humano, destinada a convertirse en la obra maestra del autor. La carretera, novela galardonada con el premio Pulitzer 2007 y best seller literario del año en Estados Unidos, transcurre en la inmensidad del territorio norteamericano, un paisaje literalmente quemado por lo que parece haber sido un reciente holocausto nuclear. En un mundo apocalíptico donde llueve ceniza, un hombre y un chico cruzan a pie el territorio norteamericano en dirección al sur. El hambre es mucho más que una preocupación diaria: es la medida de todas las cosas, y las bandas de caníbales asolan el país convertido en un yermo donde solo la barbarie ha echado raíces. El amor de un padre por su hijo es, sin embargo, la única luz de una tierra que ha perdido a sus dioses. Quizá el fuego de la civilización no se haya apagado para siempre."));
        libros.add(new u6a1Libros("La larga marcha", "Stephen King", "DeBolsillo", "Una inquietante novela futurista donde la realidad supera a la fantasía más terrorífica. El escenario: una sociedad ultraconservadora que ha llevado al paroxismo sus rasgos más perversos, dominada por un estado policial. El acontecimiento: la más extraordinaria competición deportiva, una agotadora marcha a pie donde un resbalón puede ser el último.Los competidores: cien adolescentes elegidos por sorteo decididos a pasar sobre los cadáveres de sus compañeros para llegar a la meta. El premio: fama y fortuna para el ganador, es decir, para el único superviviente... Solo uno será el triunfador.Los 99 restantes morirán."));
        libros.add(new u6a1Libros("Los pilares de la Tierra", "Ken Follett","DeBolsillo", "Veinte años después de la publicación de Los pilares de la Tierra, Ken Follett volvía al fascinante mundo de Kingsbridge para presentar a sus lectores un retrato admirable del mundo medieval y una magnífica saga épica que aporta una nueva dimensión a la ficción histórica. La publicación de Los pilares de la Tierra supuso un acontecimiento editorial sin precedentes que cautivó a millones de lectores. En Un mundo sin fin Ken Follett vuelve al fascinante mundo de Kingsbridge dos siglos después de la construcción de su majestuoso templo gótico. La catedral y el priorato ocupan de nuevo el centro de una encrucijada de amor y de odio, orgullo y codicia."));
        libros.add(new u6a1Libros("Episodios nacionales", "Benito Pérez Galdós", "Destino", "Con motivo del centenario de la muerte de Benito Pérez Galdós, ofrecemos esta edición facsímil que imita a la perfección la edición original de la editorial Hernando, hoy desaparecida. Un pequeño lujo al alcance de todos que hará las delicias a los amantes de la buena literatura. Los Episodios nacionales para niños, titulados originalmente Episodios nacionales extractados para uso de los niños, son una pequeña colección de siete novelas históricas escritas por Benito Pérez Galdós y redactadas, probablemente, durante 1907 y 1908. Las siete novelas fueron extraídas de la primera serie de sus Episodios Nacionales y fueron adaptadas de forma específica para ser leídas por ojos infantiles, ya que a Galdós le gustaban mucho los niños. Para ello, Galdós tomó como referencia la edición ilustrada de la primera serie de los Episodios Nacionales de 1882-85, realizando una drástica reducción al adaptarla para la lectura de los niños, suprimiendo tres episodios completos y casi trescientos capítulos de los siete restantes."));
        libros.add(new u6a1Libros("1984", "George Orwell","Booket", "«No creo que la sociedad que he descrito en 1984 necesariamente llegue a ser una realidad, pero sí creo que puede llegar a existir algo parecido», escribía Orwell después de publicar su novela. Corría el año 1948, y la realidad se ha encargado de convertir esa pieza -entonces de ciencia ficción- en un manifiesto de la realidad. UNO DE LOS 5 LIBROS MÁS IMPORTANTES DE LOS ÚLTIMOS 125 AÑOS SEGÚN THE NEW YORK TIMES «Está entre mis libros favoritos, lo leo una y otra vez».Margaret Atwood En el año 1984 Londres es una ciudad lúgubre en la que la Policía del Pensamiento controla de forma asfixiante la vida de los ciudadanos. Winston Smith es un peón de este engranaje perverso y su cometido es reescribir la historia para adaptarla a lo que el Partido considera la versión oficial de los hechos. Hasta que decide replantearse la verdad del sistema que los gobierna y somete.La presente edición, avalada por The Orwell Estate, sigue fielmente el texto definitivo de las obras completas del autor, fijado por el profesor Peter Davison. Incluye un epílogo del novelista Thomas Pynchon, que aporta al análisis del libro su personal visión de los totalitarismos y la paranoia en el mundo moderno. Miguel Temprano García firma la soberbia traducción, que es la más reciente de la obra.La crítica ha dicho...«Aquí ya no estamos solo ante lo que habitualmente reconocemos como \"literatura\" e identificamos con la buena escritura. Aquí estamos, repito, ante energía visionaria. Y no todas las visiones se refieren al futuro, o al Más Allá."));
        libros.add(new u6a1Libros("El imperio final", "Brandon Sanderson","DeBolsillo", "El imperio final inicia la saga «Nacidos de la Bruma [Mistborn]», obra  imprescindible del Cosmere, el universo destinado a dar forma a la serie más extensa y fascinante jamás escrita en el ámbito de la fantasía épica. Del autor best seller del New York Times. Durante mil años han caído cenizas del cielo. Durante mil años nada ha florecido. Durante mil años los skaa han sido esclavizados y viven en la miseria,  sumidos en un miedo inevitable. Durante mil años el Lord Legislador ha reinado con poder absoluto, dominando gracias al terror, a sus poderes y a su inmortalidad, ayudado por «obligadores» e «inquisidores», junto a la poderosa magia de la alomancia. Pero los nobles a menudo han tenido trato sexual con jóvenes skaa y, aunque la ley lo prohíbe, algunos de sus bastardos han sobrevivido y heredado los poderes alománticos: son los «nacidos de la bruma» (mistborn). Ahora, Kelsier, el «superviviente», el único que ha logrado huir de los Pozos de Hathsin, ha encontrado a Vin, una pobre chica skaa con mucha suerte... Tal vez los dos, con el mejor equipo criminal jamás reunido, unidos a la rebelión que los skaa intentan desde hace mil años, logren cambiar el mundo y acabar con la atroz mano de hierro del  Lord Legislador. Pero, ¿qué pasa si el héroe de la profecía falla?"));
        libros.add(new u6a1Libros("El pozo de la ascension", "Brandon Sanderson","DeBolsillo", "El Pozo de la Ascensión es el segundo volumen de la saga «Nacidos de la Bruma [Mistborn]», una obra iniciada con El imperio final y parte imprescindible del Cosmere, el universo destinado a dar forma a la serie más extensa y fascinante jamás escrita en el ámbito de la fantasía épica. Durante mil años nada ha cambiado: han caído las cenizas, los skaa han sido esclavizados y el Lord Legislador ha dominado el mundo. Pero lo imposible ha sucedido. El Lord Legislador ha muerto. Sin embargo, vencer y matarlo fue la parte sencilla. El verdadero desafío será sobrevivir a las consecuencias de su caída. Tomar el poder tal vez resultó fácil, pero ¿qué ocurre después?, ¿cómo se utiliza? La tarea de reconstruir el mundo, ahora que Kelsier no está, ha quedado en manos de Vin. Y las brumas, desde que el Lord Legislador cayó, se han vuelto cada vez más impredecibles... A medida que el asedio se intensifica, la antigua leyenda del Pozo de la Ascensión ofrece un único rayo de esperanza.En ese mundo de aventura épica, la estrategia política y religiosa debe lidiar con los siempre misteriosos poderes de la alomancia... Desde 2006, y en solo diez años, Brandon Sanderson se ha consolidado como el gran renovador de la fantasía del siglo XXI y el autor del género más prolífico del mundo. "));
        libros.add(new u6a1Libros("El héroe de las eras", "Brandon Sanderson","DeBolsillo", "El Héroe de las Eras es el tercer volumen de la saga «Nacidos de la Bruma (Mistborn)». Una obra iniciada con El imperio final y parte imprescindible del Cosmere, el universo destinado a dar forma a la serie más extensa y fascinante jamás escrita en el ámbito de la fantasía épica. Durante mil años nada ha cambiado: han caído las cenizas, los skaa han sido esclavizados y el Lord Legislador ha dominado el mundo. Kelsier, el «superviviente», el único que ha logrado huir de los Pozos de Hathsin, junto a Vin, una pobre chica skaa, se une a la rebelión. Y por fin lo imposible sucede: por fin la revolución ha triunfado. Pero acabar con el Lord Legislador es la parte sencilla. El verdadero desafío consistirá en sobrevivir a las consecuencias de su caída... sin Kelsier. Vin y el Rey Elend buscan en los últimos escondites de recursos del Lord Legislador y, engañado, el Rey libera del Pozo de la Ascensión algo que debería haber quedado oculto para siempre. Un enorme peligro acecha a la humanidad, y la verdadera pregunta es si conseguirán detenerlo a tiempo. En El héroe de las eras se comprende el porqué de la niebla y las cenizas, las tenebrosas acciones del Lord Legislador y la naturaleza del Pozo de la Ascensión. Esta aventura lleva a la trilogía a un clímax dramático y sorprendente.Desde 2006, y en solo diez años, Brandon Sanderson se ha consolidado como el gran renovador de la fantasía del siglo XXI y el autor del género más prolífico del mundo."));
        libros.add(new u6a1Libros("Universo Reina roja", "Juan Gomez Jurado", "LobaNegra", "Una edición especial en formato estuche que reúne las cinco obras cumbre de Juan Gómez-Jurado, las novelas del universo Reina roja.El fenómeno que ha enganchado a más de 2.000.000 de lectores. Reina roja Antonia Scott es especial. Muy especial. No es policía ni criminalista. Nunca ha empuñado un arma ni llevado una placa, y, sin embargo, ha resuelto decenas de crímenes. Pero hace un tiempo que Antonia no sale de su ático de Lavapiés. Las cosas que ha perdido leimportan mucho más que las que esperan ahí fuera. Tampoco recibe visitas. Por eso no le gusta nada, nada, cuando escucha unos pasos desconocidos subiendo las escaleras hasta el último piso. Sea quien sea, Antonia está segura de que viene a buscarla."));
        libros.add(new u6a1Libros("El Quijote", "Miguel de cervantes","Booket", "El ingenioso hidalgo don Quijote de la Mancha» (1605-1615) es una de las obras cumbres de la literatura universal y, por ello, una novela que cualquier lector debe preciarse de haber leído. Esta adaptación narra algunos de los más célebres episodios de la novela. Mediante un lenguaje apto para los jóvenes lectores de hoy, pretende facilitar el acceso al universo, entre lo real y lo ficticio, de este caballero andante. Con ello, abrigamos la esperanza de que la lectura que ofrecemos con esta edición incite a la de la versión íntegra de la obra."));
        return libros;
    }

    public String toString() {
        StringBuilder libros = new StringBuilder();

        libros.append("Libro: "+titulo+"\n");
        libros.append("Autor: "+autor+"\n");
        libros.append("Editorial: "+editorial+"\n");
        libros.append("Descripcion: " +descripcion+ "\n");
        return libros.toString();
    }
}
