package com.example.dungeonsdragons.database

import com.example.dungeonsdragons.entitities.*

/**
 * Abilities to fill database's table "abilities_table"
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
 * Skills to fill database's table "skills_table"
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
 * Races to fill database's table "races_table"
 */
val PREPOPULATE_RACES = arrayOf(
    Race(
        id = 0,
        name = "Enano",
        speed = 25,
        cons_bonus = 2,
        align = "La mayoría de los enanos son legales, pues creen firmemente en los beneficios de " +
                "una sociedad bien estructurada.  Además, también tienden a ser buenos, ya " +
                "que poseen un fuerte sentido del juego limpio y creen que todos merecen compartir " +
                "los frutos de un orden justo.",
        age = "Los enanos alcanzan la madurez a la misma edad que los humanos, pero se les considera " +
                "jóvenes hasta los cincuenta años. Viven, de media, unos 350 años.",
        size = "Mediano",
        size_desc = "Los enanos miden entre 4 y 5 pies de altura y pesan unas 150 libras de media."
    ),
    Race(
        id = 1,
        name = "Elfo",
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
                "son esbeltos."
    ),
    Race(
        id = 2,
        name = "Tiefling",
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
                "humanos."
    )
)

/**
 * Classes to fill database's table "classes_table"
 */
val PREPOPULATE_CLASSES = arrayOf(
    Class(
        0,
        "Brujo",
        8
    ),
    Class(
        1,
        "Cazador de Brujas",
        8
    )
)

/**
 * Subraces to fill database's table "subraces_table"
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
        str_bonus = 2
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
 *
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