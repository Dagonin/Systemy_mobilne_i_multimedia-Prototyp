package com.example.mobilki.data.repository

import com.example.mobilki.R

import com.example.mobilki.data.model.Product

object ProductsRepository {
    private val products = listOf(
        Product(
            id = 1,
            name = "Jabłko",
            category = "Owoce",
            description = "Jadalny, kulisty owoc drzew z rodzaju jabłoń Malus. Jabłka odmian uprawnych o mieszańcowym pochodzeniu, uznawanych za gatunek jabłoń domowa Malus domestica, są istotnym komercyjnie owocem o soczystym i chrupkim miąższu. Są spożywane na surowo, a także po obróbce kulinarnej. Smak dojrzałych jabłek jabłoni domowej jest słodko-kwaskowaty, rozmaite odmiany mogą być bardziej lub mniej słodkie lub kwaśne. Jabłka są kształtem zbliżone do kuli, z zagłębieniem na szczycie, z którego wystaje szypułka (pot. ogonek), na którym jabłko rośnie na drzewie, oraz z wylotem gniazda nasiennego u dołu. Przeciętne jabłko waży około 150 gramów. Miąższ jabłka jest sztywny, chrupki i pełen przezroczystego soku. Po długim przechowywaniu jabłko staje się miękkie i pomarszczone, jednak nadal jadalne. Skórka jabłka jest gładka i cienka, ściśle przylegająca do miąższu, dająca się obierać lub polerować. Kolor skórki jabłka występuje w odcieniach zieleni, a po dojrzeniu również żółci lub czerwieni, często zmieszanych ze sobą. Miąższ przybiera barwę od bardzo jasnej (zbliżonej do białej) po jasnożółtą, przy czym warstwy leżące blisko skórki mogą być lekko zabarwione na zielono, różowo itp. (czasem z widocznymi kolorowymi „żyłkami”) – w zależności od jej koloru. Jabłka mogą ulec obiciu, po czym miejsce obicia staje się miękkie i brązowe, a miąższ pod obiciem zaczyna się psuć i tracić właściwości odżywcze. Po pokrojeniu lub obraniu z dostępem do tlenu miąższ jabłka zaczyna utleniać się na powierzchni, która zmienia kolor na brązowy. Dojrzałe jabłka wydzielają lekko wyczuwalny, słodkawy zapach.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 2,
            name = "Cytryna",
            category = "Owoce",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 3,
            name = "Gruszka",
            category = "Owoce",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 4,
            name = "Banan",
            category = "Owoce",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 5,
            name = "Sałata",
            category = "Warzywa",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 6,
            name = "Marchew",
            category = "Warzywa",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 7,
            name = "Ziemniak",
            category = "Warzywa",
            description = "Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 8,
            name = "Ogórek ziemny",
            category = "Warzywa",
            description = "Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 9,
            name = "Pszenica",
            category = "Zboża",
            description = "Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 10,
            name = "Żyto",
            category = "Zboża",
            description = "Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 11,
            name = "Owies",
            category = "Zboża",
            description = "Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 12,
            name = "Ryż",
            category = "Zboża",
            description = "Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
    )

    fun getProductsByCategory(category: String) = products.filter { it.category == category }
    fun getProductById(id: Int) = products.first { it.id == id }
}