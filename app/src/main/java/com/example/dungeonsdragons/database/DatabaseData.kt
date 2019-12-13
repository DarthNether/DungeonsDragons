package com.example.dungeonsdragons.database

import com.example.dungeonsdragons.R
import com.example.dungeonsdragons.entitities.*

/**
 * Abilities
 */
val PREPOPULATE_ABILITIES = arrayOf(
    Ability(
        0,
        "Fue",
        "Fuerza",
        "La Fuerza indica la condición física, el entrenamiento atlético y la cantidad de fuerza bruta que se puede ejercer."
    ),
    Ability(
        1,
        "Des",
        "Destreza",
        "La Destreza indica la agilidad, los refflejos y el equilibrio."
    ),
    Ability(
        2,
        "Con",
        "Constitución",
        "La Constitución indica el estado de salud, el aguante y la vitalidad."
    ),
    Ability(
        3,
        "Int",
        "Inteligencia",
        "La Inteligencia indica la agudeza mental, la retentiva y la capacidad para razonar."
    ),
    Ability(
        4,
        "Sab",
        "Sabiduría",
        "La Sabiduría indica hasta que punto estás en sintonía con el mundo que te rodea, reflejando tu perspicacia en intuición."
    ),
    Ability(
        5,
        "Car",
        "Carisma",
        "El Carisma indica tu capacidad para interaccionar con los demás de forma efectiva."
    )
)

/**
 * Skills
 */
val PREPOPULATE_SKILLS = arrayOf(
    Skill(
        0,
        "Atletismo",
        0
    ),
    Skill(
        0,
        "Acrobacias",
        1
    ),
    Skill(
        0,
        "Juego de Manos",
        1
    ),
    Skill(
        0,
        "Sigilo",
        1
    ),
    Skill(
        0,
        "Conocimiento Arcano",
        3
    ),
    Skill(
        0,
        "Historia",
        3
    ),
    Skill(
        0,
        "Investigación",
        3
    ),
    Skill(
        0,
        "Naturaleza",
        3
    ),
    Skill(
        0,
        "Religión",
        3
    ),
    Skill(
        0,
        "Medicina",
        4
    ),
    Skill(
        0,
        "Percepción",
        4
    ),
    Skill(
        0,
        "Perspicacia",
        4
    ),
    Skill(
        0,
        "Supervivencia",
        4
    ),
    Skill(
        0,
        "Trato con Animales",
        4
    ),
    Skill(
        0,
        "Engaño",
        5
    ),
    Skill(
        0,
        "Interpretación",
        5
    ),
    Skill(
        0,
        "Intimidación",
        5
    ),
    Skill(
        0,
        "Persuasión",
        5
    )
)

/**
 * Races
 */
val PREPOPULATE_RACES = arrayOf(
    Race(
        id = 0,
        name = "Enano",
        desc = "Reinos rebosantes de antiguo esplendor, salas excavadas en las raíces de las montañas, " +
                "forjas abrasadoras, el resonar de los picos y martillos en las minas, el compromiso " +
                "con el clan y la tradición, y el odio a los orcos y goblins. Estas son las hebras " +
                "que todos los enanos comparten",
        speed = 25,
        con_bonus = 2,
        align = "La mayoría de los enanos son legales, pues creen firmemente en los beneficios de " +
                "una sociedad bien estructurada.  Además, también tienden a ser buenos, ya " +
                "que poseen un fuerte sentido del juego limpio y creen que todos merecen compartir " +
                "los frutos de un orden justo.",
        age = "Los enanos alcanzan la madurez a la misma edad que los humanos, pero se les considera " +
                "jóvenes hasta los cincuenta años. Viven, de media, unos 350 años.",
        size = "Mediano",
        size_desc = "Los enanos miden entre 4 y 5 pies de altura y pesan unas 150 libras de media.",
        icon = R.drawable.ic_dwarf,
        pic = R.drawable.dwarf_pic
    ),
    Race(
        id = 1,
        name = "Elfo",
        desc = "Los elfos son un pueblo de gracia ultraterrena, que viven en el mundo, pero no " +
                "forman completamente parte de él. Habitan en lugares de belleza etérea, en medio " +
                "de ancianos bosque o en torres plateadas que brillan con una luz feérica. Son " +
                "espacios en los que una suave música flota en el ambiente y la brisa trae una dulce " +
                "fragancia. Los elfos aman la naturaleza y la magia, el arte y la artesanía, la " +
                "música y la poesía.",
        speed = 30,
        dex_bonus = 2,
        align = "Los elfos aman la libertad, la variedad y la expresión personal, por lo que " +
                "tienden a los aspectos más benéficos del caos. Valoran y protegen la libertad, " +
                "tanto la suya como la de los demás y la mayoría suelen ser buenos. Los drows son una " +
                "excepción; su exilio al Underdark los ha hecho sanguinarios y peligrosos. La " +
                "mayoría de los drows son malvados.",
        age = "Aunque los elfos alcanzan la madurez aproximadamente a la misma edad que los humanos, " +
                "la concepción de la mayoría de edad de los elfos va mas allá del crecimiento e " +
                "incluye la experiencia vital. Los elfos suelen llegar a la edad adulta y recibir " +
                "su nuevo nombre tras unos cien años y pueden llegar a vivir hasta setecientos cincuenta.",
        size = "Mediano",
        size_desc = "Los elfos miden entre poco menos de 5 pies y algo más de 6 pies de altura y " +
                "son esbeltos.",
        icon = R.drawable.ic_elf,
        pic = R.drawable.elf_pic
    ),
    Race(
        id = 2,
        name = "Tiefling",
        desc = "Ser recibido con miradas y susurros, ser víctima de la violencia y los insultos por " +
                "la calle, observar desconfianza y miedo en todos los rostros; este es el destino de " +
                "los tieflings. Y, para añadir sal a la herida, los tiefling saben que esto se debe " +
                "a un pacto, sellado hace generaciones, que impregnó su linaje conla esemcia de " +
                "Asmodeo, amo de los Nueve Infiernos. La apariencia y naturaleza de los tieflings " +
                "no son culpa suya, sino de un pecado ancestral, por el que tanto ellos como su " +
                "descendencia deberán responder para siempre.",
        speed = 30,
        cha_bonus = 2,
        int_bonus = 1,
        align = "Los tieflings no poseen una tendencia innata hacia el mal, aunque muchos acaban " +
                "abrazándolo. Malvados o no, su naturaleza independiente les hace inclinarse hacia " +
                "el alineamiento caótico.",
        age = "Los tiefling alcanzan la madurez al mismo ritmo que los humanos, pero viven unos " +
                "pocos años más.",
        size = "Mediano",
        size_desc = "Los tieflings son aproximadamente de la misma altura y constitución que los " +
                "humanos.",
        icon = R.drawable.ic_tiefling,
        pic = R.drawable.tiefling_pic
    )
)

/**
 * Classes
 */
val PREPOPULATE_CLASSES = arrayOf(
    Class(
        0,
        "Brujo",
        8,
        R.drawable.ic_warlock,
        "Envuelto en una túnica dorada y con su pseudodragón enroscado en torno al hombro, un " +
                "joven elfo sonríe con calidez, tejiendo un encantamiento mágico en sus melifluas " +
                "palabras y doblegando a los centinelas del palacio a su voluntad." +
                "\n\nMientras las llamas cobran vida en sus manos, una marchita humana susurra el " +
                "nombre secreto de su patrón demoníaco que como respuesta llena el conjuro de " +
                "magia infernal." +
                "\n\nUn tiefling de ojos salvajes levanta la vista de un maltratado tomo para observar " +
                "el extraño alineamiento estelar que brilla en el cielo. Sus labios pronuncian las " +
                "salmodias de de un ritual místico, que abrirá un portal a un mundo remoto." +
                "\n\nLos brujos buscan el conocimiento que yace escondido en el tejido mismo del multiverso. " +
                "A través de pactos forjados con misteriosos seres de poder sobrenatural, desvelan efectos " +
                "mágicos sutiles y espectaculares a partes iguales. A partir del conocimiento ancestral " +
                "poseído como nobles feéricos, demonios, diablos, sagas o los extraños seres del Reino " +
                "Lejano, los brujos descubren secretos arcanos que refuerzan sus propios poderes.",
        R.drawable.pic_warlock

    ),
    Class(
        1,
        "Cazador de Brujas",
        8,
        R.drawable.ic_bloodhunter,
        "En un paisaje aﬂigido por todo tipo de bestias, diablos, y abominaciones de más " +
                "allá del velo, la mayoría viven con miedo a la oscuridad, a la superstición, y a " +
                "lo desconocido. Algunos se endurecen por esta experiencia, eligen levantarse y " +
                "luchar contra la marea de la oscuridad. A este tipo de gente se les llama " +
                "'héroes'. \n\nAlgunos, sin embargo, son tan fanáticos y están tan determinados a " +
                "destruir la anatema que plaga la campiña que abrazan el conocimiento oscuro y " +
                "prohibido. Investigan obsesivamente arcanos olvidados y alquimias experimentales y " +
                "peligrosas para convertirse en el perfecto cazador que su humanidad a menudo se " +
                "pone en entredicho. A este tipo de gente se les llama ‘Cazadores de Brujas’. ",
        R.drawable.pic_blood_hunter
    )
)

/**
 * Subraces
 */
val PREPOPULATE_SUBRACES = arrayOf(
    Subrace(
        0,
        "Enano de las Colinas",
        0,
        "Como enano de las colinas, posees sentidos agudos, una profunda intuición y una " +
                "resistencia extraordinaria.",
        wis_bonus = 1
    ),
    Subrace(
        1,
        "Enano de las Montañas",
        0,
        "Como enano de las montañas, eres fuerte y robusto, acostumbrado a la difícil vida " +
                "en un terreno agreste. Probablemente seas alto (para ser enano) y tiendas a tonos " +
                "de piel más claros",
        str_bonus = 2,
        hp_bonus = 1
    ),
    Subrace(
        2,
        "Alto Elfo",
        1,
        "Como alto elfo, posees una mente aguda y un dominio de, como mínimo, los rudimentos " +
                "de la magia.",
        int_bonus = 1
    ),
    Subrace(
        3,
        "Elfo de los Bosques",
        1,
        "Como elfo de los bosques, posees sentidos agudos y una buena intuición. Además, tus " +
                "velosces pies te permiten desplazarte rápida y sigilosamente a traves de los bosques " +
                "que son tu hogar.",
        wis_bonus = 1,
        speed_bonus = 5
    ),
    Subrace(
        4,
        "Elfo Oscuro (Drow)",
        1,
        "Descendientes de una subraza de elfos más antigua, los drows fueron expulsados del " +
                "mundo de la superficie por seguir a la diosa Lolth en la senda del mal. Han " +
                "construido su propia civilización en las profundidades del underdark tomando como " +
                "modelo el camino de Lolth.",
        cha_bonus = 1
    )
)

/**
 * Subclasses
 */
val PREPOPULATE_SUBCLASSES = arrayOf(
    Subclass(
        0,
        "El Infernal",
        0,
        "Has cerrado un trato con un infernal de los Planos Inferiores; un ser de fines " +
                "malvados, a los que incluso tú mismo podrías oponerte. Este tipo de seres desean " +
                "la corrupción y destrucción de todas  las cosas, lo que, en última instancia, " +
                "también te incluye."
    ),
    Subclass(
        1,
        "El Primigenio",
        0,
        "Tu patrón es una misteriosa entidad cuya naturaleza es ajena al tejido de la " +
                "realidad. Puede que provenga del Reino Lejano, un espacio más allá de la realidad, " +
                "o quizá se trate de uno de los dioses antiguos  que solo se recuerdan a través " +
                "de leyendas. Sus motivos son incomprensibles para los mortales y su conocimiento " +
                "es tan inmenso y antiguo que incluso las bibliotecas más grandes palidecen en " +
                "comparación con los vastos secretos que este ser cobija."

    ),
    Subclass(
        2,
        "El Señor Feérico",
        0,
        "Tu patrón es un señor o señora feérico: una criatura de leyenda que atesora secretos " +
                "que ya habían sido olvidados antes de que las razas mortales vieran la luz. Las " +
                "motivaciones de una entidad como esta suelen ser incognoscibles y a veces parecen " +
                "caprichosas, pues lo mismo pueden aspirar a aumentar su poder mágico como buscar " +
                "vengarse de un agravio ancestral."
    ),
    Subclass(
        3,
        "Orden del Asesino de Fantasmas",
        1,
        "La Orden del Asesino de Fantasmas es la más antigua y la más ‘pura’ de las órdenes, " +
                "teniendo sus raíces en prácticas divinas y creadas especíﬁ camente para limpiar " +
                "los reinos del azote de la no muerte. Los Asesinos de Fantasmas buscan y estudian " +
                "el momento de la muerte, obsesionándose con el misterio de la transición. Algunos " +
                "permanecerán sentados junto a los enfermos terminales para ser testigos cercanos " +
                "de su fallecimiento, mientras otros irán tan lejos como para tener deliberadamente " +
                "experiencias cercanas a la muerte, permitiéndoles aﬁ nar sus sentidos a los reinos " +
                "etéreos del más allá."
    )
)

/**
 * Traits
 */
val PREPOPULATE_TRAITS = arrayOf(
    Trait(
        0,
        "Visión en la Oscuridad",
        "Eres capaz de percibir luz tenue hasta a 60 pies como si hubiera luz brillante, y esa " +
                "misma distancia en la oscuridad como si fuera luz tenue. Eso sí, no puedes distinguir " +
                "colores en la oscuridad, solo tonos de gris."
    ),
    Trait(
        1,
        "Resistencia Enana",
        "Tienes ventaja en las tiradas de salvación contra veneno y posees resistencia al " +
                "daño de veneno."
    ),
    Trait(
        2,
        "Entrenamiento de Combate Enano",
        "Eres competente con hachas de guerra, hachas de mano, martillos de guerra y martillos " +
                "ligeros."
    ),
    Trait(
        3,
        "Competencia con Herramientas",
        "Eres competente con las herramientas de artesano que elijas de entre las siguientes: " +
                "herramientas de albañil, herramientas de herrero o suministros de cervecero."
    ),
    Trait(
        4,
        "Afinidad con la Piedra",
        "Cuando hagas una prueba de Inteligencia (Historia) que tenga relación con el origen " +
                "de un trabajo en piedra, se te considerará competente en la habilidad Historia y " +
                "añadirás dos veces tu bonificador por competencia a la tirada, en lugar de solo una."
    ),
    Trait(
        5,
        "Aguante Enano",
        "Tus puntos de golpe máximos se incrementan en 1, y aumentarán en 1 más cada vez que " +
                "subas un nivel."
    ),
    Trait(
        6,
        "Entrenamiento con Armadura Enana",
        "Eres competente con armaduras ligeras y medias."
    ),
    Trait(
        7,
        "Resistencia Infernal",
        "Posees resistencia al daño de fuego."
    ),
    Trait(
        8,
        "Linaje Infernal",
        "Conoces el truco Taumaturgia. Cuando llegas a nivel 3, puedes lanzar el truco " +
                "Reprensión Infernal como conjuro de nivel 2 una vez usando este atributo y recuperas " +
                "la capacidad para hacerlo tras realizar un descanso largo. Cuando alcanzas el nivel " +
                "5, eres capaz de lanzar el conjuro Oscuridad una vez empleando este atributo y " +
                "recuperas la capacidad para hacerlo tras realizar un descanso largo. El Carisma " +
                "es tu aptitud mágica para estos conjuros."
    )
)

/**
 * Traits - Races
 */
val PREPOPULATE_TRAITS_RACES = arrayOf(
    TraitRace(
        0,
        0,
        0
    ),
    TraitRace(
        0,
        0,
        1
    ),
    TraitRace(
        0,
        0,
        2
    ),
    TraitRace(
        0,
        0,
        3
    ),
    TraitRace(
        0,
        0,
        4
    ),
    TraitRace(
        0,
        2,
        0
    ),
    TraitRace(
        0,
        2,
        7
    ),
    TraitRace(
        0,
        2,
        8
    )
)

/**
 * Traits - Subraces
 */
val PREPOPULATE_TRAITS_SUBRACES = arrayOf(
    TraitSubrace(
        0,
        0,
        5
    ),
    TraitSubrace(
        0,
        1,
        6
    )
)

/**
 * Alignments
 */
val PREPOPULATE_ALIGNMENTS = arrayOf(
    Alignment(
        0,
        "Legal Bueno"
    ),
    Alignment(
        0,
        "Neutral Bueno"
    ),
    Alignment(
        0,
        "Caótico Bueno"
    ),
    Alignment(
        0,
        "Legal Neutral"
    ),
    Alignment(
        0,
        "Neutral"
    ),
    Alignment(
        0,
        "Caótico Neutral"
    ),
    Alignment(
        0,
        "Legal Malvado"
    ),
    Alignment(
        0,
        "Neutral Malvado"
    ),
    Alignment(
        0,
        "Caótico Malvado"
    )
)