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
        id = 8,
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
        1,
        "Bardo",
        8
    ),
    Class(
        2,
        "Brujo",
        8
    ),
    Class(
        12,
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
    )
)