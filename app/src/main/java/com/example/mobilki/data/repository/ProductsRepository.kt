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
            description = "Cytryna zwyczajna Citrus limon (L.) Burm., nazywana też cytryną właściwą lub po prostu cytryną – gatunek roślin z rodziny rutowatych (Rutaceae Juss.). Pochodzi z południowo-wschodnich Chin, lecz współcześnie nie występuje tam ani w stanie dzikim, ani nie jest tam uprawiana. Prawdopodobnie powstała w wyniku skrzyżowania limy (Citrus aurantifolia syn. C. latifolia) z cytronem (Citrus medica). Do Europy trafiła w średniowieczu (starożytni Rzymianie znali i uprawiali tylko cytrony Citrus medica).",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 3,
            name = "Gruszka",
            category = "Owoce",
            description = "Grusza (Pyrus L.) – rodzaj w większości niewielkich drzew z rodziny różowatych (Rosaceae). Systematyka grusz jest bardzo zawiła. Gatunki łatwo się ze sobą krzyżują, tworząc liczne podgatunki i formy przejściowe. Dlatego wśród systematyków brak zgody co do podziału grusz, rozgraniczenia i liczby ich gatunków oraz odmian botanicznych. Obecnie szacuje się (w zależności od autora), że rodzaj Pyrus zawiera do 72 gatunków. Pierwotnie cały rodzaj występował w strefie umiarkowanej Eurazji nie sięgając jednak tak daleko na północ jak jabłoń, gdyż wymagania cieplne grusz są wyższe. W Polsce popularnie uprawiana i dziczejąca jest grusza pospolita P. communis. Podawana jako dziko występująca jest także grusza polna Pyrus pyraster, w innych ujęciach synonimizowana z gruszą pospolitą.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 4,
            name = "Banan",
            category = "Owoce",
            description = "Banan zwyczajny, banan właściwy, błogosława, figa rajska, muza, pizang, banan zaostrzony (Musa paradisiaca L., Musa × paradisiaca, Musa paradisiaca var. sapientum, Musa acuminata × balbisiana) – gatunek rośliny jednoliściennej należący do rodziny bananowatych (Musaceae), powszechnie uprawiany dla owoców. Banan zwyczajny jest hybrydą prawdopodobnie dwóch gatunków dzikich: Musa acuminata i Musa balbisiana; nazwa Musa paradisiaca odnosi się tylko do roślin uprawnych będących hybrydami taksonów rodzicielskich niezależnie od ich ploidii i kombinacji genomów. Nie stwierdzono występowania banana zwyczajnego w stanie dzikim. Najważniejsza roślina uprawna w krajach o klimacie tropikalnym.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 5,
            name = "Sałata",
            category = "Warzywa",
            description = "Sałata (Lactuca L.) – rodzaj roślin z rodziny astrowatych (Asteraceae). Obejmuje w zależności od ujęcia ok. 60 lub ponad 100 gatunków. Rośliny te są szeroko rozprzestrzenione na półkuli północnej oraz w Afryce na półkuli południowej. W Polsce rodzaj reprezentowany jest przez rośliny uprawiane lub introdukowane.Najważniejszą rośliną użytkową w obrębie rodzaju jest sałata siewna L. sativa, która w licznych odmianach uprawnych jest popularnie uprawiana i spożywana na całym świecie, a zwłaszcza w Azji, Europie i w Ameryce Północnej i Środkowej. Jadalna jest także sałata indyjska L. indica. Jako roślina lecznicza wykorzystywana była sałata jadowita L. virosa.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 6,
            name = "Marchew",
            category = "Warzywa",
            description = "Marchew (Daucus L. 1753) – rodzaj roślin z rodziny selerowatych. Rodzaj liczy w zależności od ujęcia 44–45 lub 60 gatunków. W tym drugim wypadku włączane są tu m.in. rodzaje: Agrocharis, Margotia, Melanoselinum, Pseudorlaya, Turgenia. Rośliny te występują na wszystkich kontynentach, ale centrum zróżnicowania stanowi Europa, południowo-zachodnia i środkowa Azja, zwłaszcza obszar śródziemnomorski. W Polsce rośnie dziko podgatunek typowy marchwi zwyczajnej D. carota subsp. carota i w uprawie marchew zwyczajna jadalna D. carota subsp. sativus. Uprawiana i przejściowo dziczejąca jest poza tym także marchew złocista D. aureus. Ważną rośliną użytkową jest marchew zwyczajna D. carota. Jej podgatunek typowy (subsp. carota) rosnący także w Europie uznawany jest za trujący. Podgatunek jadalny (subsp. sativus) udomowiony został w Afganistanie. Roślina spożywana jest jako warzywo na surowo i przetworzona, także stosowana jest do wyrobu ciast. Jadane są korzenie, które w popularnych współcześnie odmianach mają kolor pomarańczowy, a dawnej i w mniej popularnych odmianach lub w różnych regionach uprawiane są rośliny o korzeniach barwy żółtej, białej lub ciemnoczerwonej (te ostatnie są szczególnie popularne np. w Indiach). Roślina wykorzystywana jest także jako pastewna. Korzenie po upieczeniu wykorzystywane były jako substytut kawy. Olejek uzyskiwany z owoców używany jest do aromatyzowania likierów i w kosmetyce.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 7,
            name = "Ziemniak",
            category = "Warzywa",
            description = "Psianka ziemniak, ziemniak (Solanum tuberosum L.) – gatunek rośliny należący do rodziny psiankowatych. Nazwa „ziemniak” odnosi się zarówno do całej rośliny, jak i do jej jadalnych, bogatych w skrobię bulw pędowych, z powodu których ten gatunek uprawia się na skalę masową. Roślina wywodzi się z Ameryki Południowej, gdzie zaczęto ją uprawiać już tysiące lat temu. Ziemniak został przywieziony do Europy w końcu XVI wieku, a w ciągu następnych stuleci stał się jednym z podstawowych składników jadłospisu na całym świecie. W 2009 był czwartą pod względem wielkości produkcji rośliną uprawną (po kukurydzy, ryżu i pszenicy).",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 8,
            name = "Ogórek siewny (gruntowy)",
            category = "Warzywa",
            description = "Ogórek siewny (Cucumis sativus L.) – gatunek ogórka z rodziny dyniowatych (Cucurbitaceae). Wywodzi się prawdopodobnie z gatunku Cucumis hardwickii dziko rosnącego u podnóża Himalajów. W Indiach uprawiany był już ok. 3 tys. lat temu, później został szeroko rozpowszechniony i obecnie znany jest we wszystkich strefach klimatycznych. Owoce ogórka siewnego wykorzystywane są powszechnie w kuchni wielu krajów. Nazwa odnosi się zarówno do rośliny płożącej, jak i jej cylindrycznych, jadalnych owoców.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 9,
            name = "Pszenica",
            category = "Zboża",
            description = "Pszenica zwyczajna (Triticum aestivum L.) – gatunek pszenicy z rodziny wiechlinowatych. Jest kosmopolityczną rośliną uprawną, której największe uprawy znajdują się w Europie, wschodniej Azji oraz Indiach, obu Amerykach, a także Australii.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 10,
            name = "Żyto",
            category = "Zboża",
            description = "Żyto (Secale L.) – rodzaj roślin jednorocznych, rzadziej dwuletnich z rodziny wiechlinowatych. Liczy 9 gatunków. Rośliny te występują w południowej i południowo-wschodniej Europie, w północnej Afryce oraz zachodniej Azji, na wschodzie sięgając po zachodnie Himalaje i region Sinciang w zachodnich Chinach. Jeden gatunek (S. africanum) rośnie w Południowej Afryce. Ze względów gospodarczych najważniejsze znaczenie ma żyto zwyczajne S. cereale.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 11,
            name = "Owies",
            category = "Zboża",
            description = "Owies (Avena L.) – rodzaj roślin z rodziny wiechlinowatych. Obejmuje 25 gatunków. Rośliny te występują w Europie, Azji i północnej oraz wschodniej Afryce. Kilka gatunków jest uprawianych, głównie owies zwyczajny A. sativa, do najbardziej uciążliwych chwastów należy owies głuchy A. fatua.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 12,
            name = "Ryż",
            category = "Zboża",
            description = "Ryż (Oryza L.) – rodzaj zbóż z rodziny wiechlinowatych obejmujący 25 gatunków. Występuje w strefie klimatów gorących i ciepłych na całym świecie. Ryż spożywczy, będący podstawą wyżywienia 1/3 ludności świata, jest produktem otrzymywanym z ziarna ryżu siewnego.",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
    )

    fun getProductsByCategory(category: String) = products.filter { it.category == category }
    fun getProductById(id: Int) = products.first { it.id == id }
}
