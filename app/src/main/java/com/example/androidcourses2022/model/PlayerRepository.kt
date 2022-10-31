package com.example.androidcourses2022.model

object PlayerRepository {

    val players = mutableListOf(
        MainItems.Player(id = 0,
            name = "Manuel Neuer",
            number = 1,
            position = "Goalkeeper",
            age = 36,
            nationality = "German",
            bio = "Manuel Neuer has been the FCB keeper since 2011. The Gelsenkirchen native started out at his hometown club Schalke 04. In 2011 and 2014, he was named German Player of the Year, as well as being voted the Best FIFA Goalkeeper in 2020. Among other things, he's won the treble twice (2013 and 2020) with the men from Munich, and since 2017 he's worn the captain's armband at the record champions. In 2014, Manuel Neuer won the World Cup in Brazil with the German national team.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0000i4-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 1,
            name = "Sven Ulreich",
            number = 26,
            position = "Goalkeeper",
            age = 34,
            nationality = "German",
            bio = "Sven Ulreich started his second spell at FC Bayern in July 2021. The goalkeeper had already played for the German record champions from 2015 to 2020, but then moved to Hamburger SV for a year. He learned his trade in the youth set-up at VfB Stuttgart, for whom he also later played at senior level. During his time at FCB, Ulreich has won the Champions League, the Bundesliga, the DFB Cup, the DFL Supercup and the UEFA Super Cup.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0000lt-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 2,
            name = "Johannes Schenk",
            number = 35,
            position = "Goalkeeper",
            age = 19,
            nationality = "German",
            bio = "Goalkeeper Johannes Schenk has signed a professional contract with FC Bayern until 2024. The 19-year-old came to the German record champions' U16 youth team from 1. FC Nürnberg in 2017 and featured in nine Regionalliga games for the reserves last season.",
            pic = "https://i.bundesliga.com/player/dfl-obj-j01cnb-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 3,
            name = "Dayot Upamecano",
            number = 2,
            position = "Defender",
            age = 23,
            nationality = "French",
            bio = "Dayot Upamecano has been at Bayern since summer 2021. The central defender was born in France and started his professional career at RB Salzburg. He later moved to Leipzig in the Bundesliga, where he played for a total of four years before joining the record champions.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0027kl-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 4,
            name = "Matthijs de Ligt",
            number = 4,
            position = "Defender",
            age = 23,
            nationality = "Dutch",
            bio = "Matthijs de Ligt joined FC Bayern in the summer of 2022. The central defender was born in the Netherlands and started his professional career in Amsterdam with Ajax. He led his team to the league and cup double as the youngest captain in the club's history (2019). For the next season, he moved to Italian record champions Juventus. In Turin, he celebrated one championship, one domestic cup triumph and one Supercup victory.",
            pic = "https://i.bundesliga.com/player/dfl-obj-j017re-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 5,
            name = "Benjamin Pavard",
            number = 5,
            position = "Defender",
            age = 26,
            nationality = "French",
            bio = "Benjamin Pavard grew up in France and began his professional career at OSC Lille. He later moved to Germany to join VfB Stuttgart. He's been part of the FC Bayern defence since the 2019/2020 season and can play both on the right and as a central defender. Pavard won the treble in 2020 with the men from Munich, and in 2018 he became a World Cup winner with the French national team.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0027g0-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 6,
            name = "Alphonso Davies",
            number = 19,
            position = "Defender",
            age = 21,
            nationality = "Canadian",
            bio = "Alphonso Davies was born in Ghana and grew up in Canada. He started his professional career at Vancouver Whitecaps and joined FC Bayern at the beginning of 2019. He won the treble with the men from Munich in 2020.",
            pic = "https://i.bundesliga.com/player/dfl-obj-002fwz-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 7,
            name = "Bouna Sarr",
            number = 20,
            position = "Defender",
            age = 30,
            nationality = "Senegalese",
            bio = "Bouna Sarr is a Senegal international who was born in France. He started out in football with FC Gerland before moving to the youth team at Lyon. The right-back's last stint was at Marseille. He's been part of the FC Bayern squad since the 2020/21 season and, among other things won the FIFA Club World Cup with the men in Munich in 2020.",
            pic = "https://i.bundesliga.com/player/dfl-obj-002gm4-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 8,
            name = "Lucas Hernandez",
            number = 21,
            position = "Defender",
            age = 26,
            nationality = "French",
            bio = "Lucas Hernández is a France international and has been with FC Bayern Munich since the 2019/20 season. The French centre-back was born in Marseille but began playing football at Spanish club Rayo Majadahonda. He later moved to the Atlético Madrid youth setup and was included in the first-team squad a number of times at the age of just 17. Hernández won the treble with FC Bayern in 2020 and the World Cup with France in 2018.",
            pic = "https://i.bundesliga.com/player/dfl-obj-002g0i-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 9,
            name = "Noussair Mazraoui",
            number = 40,
            position = "Defender",
            age = 24,
            nationality = "Moroccan",
            bio = "Noussair Mazraoui (*14.11.1997) is a Moroccan defender who has been at FC Bayern since July 2022. Before joining the German record champions, Mazraoui played for Ajax, where he learned his trade in the youth teams.",
            pic = "https://i.bundesliga.com/player/dfl-obj-j01apo-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 10,
            name = "Josip Stanisic",
            number = 44,
            position = "Defender",
            age = 22,
            nationality = "Croatian",
            bio = "Josip Stanišić was born in Munich and began his football career at TSV 1860 Munich. After that he moved to SC Fürstenfeldbruck, where he played for two years before arriving at FC Bayern in 2017. At first the right-back played for the Bayern youth teams and reserves. He's been part of the first-team squad since 2021 and scored his first Bundesliga goal on 14 May 2022 against VfL Wolfsburg.",
            pic = "https://i.bundesliga.com/player/dfl-obj-002gic-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 11,
            name = "Joshua Kimmich",
            number = 6,
            position = "Midfielder",
            age = 27,
            nationality = "German",
            bio = "Joshua Kimmich plays as a defensive midfielder for FC Bayern. At the age of 12 he left his hometown club VfB Bösingen to join the VfB Stuttgart academy. After six years he left for Leipzig, before moving to Munich in 2015. He's won the double multiple times with Bayern as well as the treble in 2020.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0002f5-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 12,
            name = "Leon Goretzka",
            number = 8,
            position = "Midfielder",
            age = 27,
            nationality = "German",
            bio = "Leon Goretzka took up football in his home city of Bochum. Initially he played for Werner SV 06 Bochum and then after two years joined VfL Bochum, where he stayed for 11 years before going to Schalke 04. He's been occupying the centre of midfield for FC Bayern since 2018. He won six trophies in one year with the Bavarians in 2020. He was also part of the German Olympic team that won the silver medal at the 2016 Olympics in Brazil.",
            pic = "https://i.bundesliga.com/player/dfl-obj-000191-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 13,
            name = "Paul Wanner",
            number = 14,
            position = "Midfielder",
            age = 16,
            nationality = "German",
            bio = "Paul Wanner is a product of the FC Bayern academy and has been a member of the first-team squad since the beginning of 2022. Until 2018 he played for the FV Ravensburg youth team. On 7 January 2022, the Austria-born attacker made his professional debut for Bayern, becoming the youngest player in the club's history at the age of 16 years and 15 days.",
            pic = "https://i.bundesliga.com/player/dfl-obj-j01kel-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 14,
            name = "Marcel Sabitzer",
            number = 18,
            position = "Midfielder",
            age = 28,
            nationality = "Austrian",
            bio = "Marcel Sabitzer is an Austrian midfielder who's been with Bayern since 2021. He started his career with ESV Admira Villach and has also had spells at the likes of Grazer AK, Rapid Wien, RB Salzburg and lastly at RB Leipzig. The Austria international was named his country's Footballer of the Year in 2017.",
            pic = "https://i.bundesliga.com/player/dfl-obj-002666-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 15,
            name = "Ryan Gravenberch",
            number = 38,
            position = "Midfielder",
            age = 20,
            nationality = "Dutch",
            bio = "Ryan Gravenberch (*16.05.2002) is a Dutch midfielder who has been at FC Bayern since July 2022. Before joining the German record champions, Gravenberch played for Ajax, where he learned his trade in the youth teams.",
            pic = "https://i.bundesliga.com/player/dfl-obj-j01b8n-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 16,
            name = "Serge Gnabry",
            number = 7,
            position = "Striker",
            age = 27,
            nationality = "German",
            bio = "Serge Gnabry joined FC Bayern from Werder Bremen in 2017 and was loaned out to TSG 1899 Hoffenheim for his first year. Since 2018 he's been an established member of the record champions' squad. He left his home of Stuttgart in 2011 to move to England and Arsenal, where he developed into a professional and also had a loan spell at West Bromwich Albion. He won the sextuple with Bayern in 2020. Gnabry was voted FCB Player of the Season in his first season in 2018/19.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0027g6-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 17,
            name = "Leroy Sane",
            number = 10,
            position = "Striker",
            age = 26,
            nationality = "German",
            bio = "Leroy Sané has been at FC Bayern since the 2020/21 season. The Germany international started out at SG Watteschneid 09 and joined the Schalke 04 academy after just four years. Sané has also played for Bayer Leverkusen as well as Manchester City in the Premier League, before he returned to the Bundesliga with Bayern. He scored on his league debut for FCB on 18 September 2020 against Schalke 04.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0002au-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 18,
            name = "Kingsley Coman",
            number = 11,
            position = "Striker",
            age = 26,
            nationality = "French",
            bio = "Kingsley Coman is a winger who's been with FC Bayern since 2015. The France international previously played for Juventus. He was trained in the academy of Paris Saint-Germain, where he also played his first professional games. Before his move to the German record champions, Coman had already won both the French and Italian championships.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0026pm-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 19,
            name = "Eric Maxim Choupo-Moting",
            number = 13,
            position = "Striker",
            age = 33,
            nationality = "Cameroonian",
            bio = "Eric Maxim Choupo-Moting is a Cameroon international who joined FC Bayern in autumn 2020. The striker came to the German record champions from Paris Saint-Germain, but his football beginnings can be traced back to his home city of Hamburg. There he played for Altona 93, FC St. Pauli and Hamburger SV among others. That was followed by spells at Mainz, Schalke and Stoke City in England. He is particularly strong in the duels and in the air. In his very first year at Bayern, he won the Bundesliga as well as the FIFA Club World Cup.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0000rp-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 20,
            name = "Sadio Mane",
            number = 17,
            position = "Striker",
            age = 30,
            nationality = "Senegalese",
            bio = "Sadio Mané (*10.04.1992) is a Senegalese winger who has been at FC Bayern since 2022. Mané picked up all the major trophies at his previous stint with Liverpool, winning the Champions League, UEFA Super Cup, FIFA Club World Cup (both in 2019), English Premier League (2020) and FA Cup and English League Cup (2022).",
            pic = "https://i.bundesliga.com/player/dfl-obj-j0117h-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 21,
            name = "Thomas Muller",
            number = 25,
            position = "Striker",
            age = 33,
            nationality = "German",
            bio = "Thomas Müller joined the FC Bayern youth set-up from TSV Pähl in 2000, and has worn the jersey of the German record champions since making his senior debut in the summer of 2008, making him the longest-serving player in the squad. In both 2013 and 2020, the club icon won the treble of Champions League, Bundesliga and DFB Cup with Bayern, and following his 11th league title in the summer of 2022, he's the most successful Bundesliga player in history.",
            pic = "https://i.bundesliga.com/player/dfl-obj-0000ia-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 22,
            name = "Mathys Tel",
            number = 39,
            position = "Striker",
            age = 17,
            nationality = "French",
            bio = "Mathys Tel joined FC Bayern from Stade Rennes in summer 2022. The forward captained the France U17s to the 2022 European Championship title.",
            pic = "https://i.bundesliga.com/player/dfl-obj-j01n65-dfl-clu-00000g-dfl-sea-0001k6.png"),
        MainItems.Player(id = 23,
            name = "Jamal Musiala",
            number = 42,
            position = "Striker",
            age = 19,
            nationality = "German",
            bio = "Jamal Musiala initially moved from Chelsea's youth team to the FC Bayern youth set-up in the summer of 2019. After just a few months there, the forward was called up to the senior squad and, at the age of 17, progressed to become the youngest ever Bundesliga debutant, Bundesliga goalscorer and Champions League goalscorer within just a few months.",
            pic = "https://i.bundesliga.com/player/dfl-obj-002gcr-dfl-clu-00000g-dfl-sea-0001k6.png")
    )

    val adverts = mutableListOf(
        MainItems.Advert(
            "Waiting for you on our stadium!",
            "https://img.fcbayern.com/image/upload/v1601458426/cms/public/images/allianz-arena/stadion-innenraum/aa_haupttribuene.jpg"
        ),
        MainItems.Advert(
            "Visit our merch store on fcbayern.com/store",
            "https://img.fcbayern.com/image/upload/t_cms-16x9/f_auto/w_660,h_371,c_fill/v1659079643/cms/public/images/allianz-arena/arena-innenbilder/Store3.jpg"
        ),
        MainItems.Advert(
            "Online-museum of FC Bayern on fcbayern.com/museum",
            "https://img.fcbayern.com/image/upload/t_cms-16x9/f_auto/w_1366,h_768,c_fill/cms/public/images/museum/schalen_erlebniswelt.jpg"
        ),
        MainItems.Advert(
            "Support FC Bayern in Champions League",
            "https://wwwimage-us.pplusstatic.com/thumbnails/photos/w1920-q80/marquee/1038640/ucl_sp_hero_landscape_0.jpg"
        )
    )

    val mainItems = mutableListOf<MainItems>().apply {
        add(adverts[adverts.indices.random()].copy())
        var i: Int = 0
        var checker: Int = 0
        while (i < players.size) {
            if (i % 5 == 0 && i != checker) {
                add(adverts[adverts.indices.random()].copy())
                checker = i
            } else {
                add(players[i].copy())
                i++
            }
        }
    }

    fun deleteElem(pos: Int) {
        mainItems.removeAt(pos)
        for (i in pos until mainItems.size - 1) {
            if (mainItems[i] is MainItems.Advert
                && i % 6 != 0) {
                mainItems[i] = mainItems[i + 1].also {
                    mainItems[i + 1] = mainItems[i]
                }
            }
            if (mainItems[mainItems.size - 1] is MainItems.Advert) {
                mainItems.removeAt(mainItems.size - 1)
            }
        }
    }

}