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
            gallery = listOf(
                R.drawable.apple1,
                R.drawable.apple2,
                R.raw.apple_vid1
            )

        ),
        Product(
            id = 2,
            name = "Cytryna",
            category = "Owoce",
            description = "Cytryna zwyczajna Citrus limon (L.) Burm., nazywana też cytryną właściwą lub po prostu cytryną – gatunek roślin z rodziny rutowatych (Rutaceae Juss.). Pochodzi z południowo-wschodnich Chin, lecz współcześnie nie występuje tam ani w stanie dzikim, ani nie jest tam uprawiana. Prawdopodobnie powstała w wyniku skrzyżowania limy (Citrus aurantifolia syn. C. latifolia) z cytronem (Citrus medica). Do Europy trafiła w średniowieczu (starożytni Rzymianie znali i uprawiali tylko cytrony Citrus medica).",
            imageRes = R.drawable.lemon1,
            gallery = listOf(
                R.drawable.lemon1,
                R.drawable.lemon2
            )
        ),
        Product(
            id = 3,
            name = "Gruszka",
            category = "Owoce",
            description = "Grusza (Pyrus L.) – rodzaj w większości niewielkich drzew z rodziny różowatych (Rosaceae). Systematyka grusz jest bardzo zawiła. Gatunki łatwo się ze sobą krzyżują, tworząc liczne podgatunki i formy przejściowe. Dlatego wśród systematyków brak zgody co do podziału grusz, rozgraniczenia i liczby ich gatunków oraz odmian botanicznych. Obecnie szacuje się (w zależności od autora), że rodzaj Pyrus zawiera do 72 gatunków. Pierwotnie cały rodzaj występował w strefie umiarkowanej Eurazji nie sięgając jednak tak daleko na północ jak jabłoń, gdyż wymagania cieplne grusz są wyższe. W Polsce popularnie uprawiana i dziczejąca jest grusza pospolita P. communis. Podawana jako dziko występująca jest także grusza polna Pyrus pyraster, w innych ujęciach synonimizowana z gruszą pospolitą.",
            imageRes = R.drawable.pear1,
            gallery = listOf(
                R.drawable.pear1,
                R.drawable.pear2
            )
        ),
        Product(
            id = 4,
            name = "Banan",
            category = "Owoce",
            description = "Banan zwyczajny, banan właściwy, błogosława, figa rajska, muza, pizang, banan zaostrzony (Musa paradisiaca L., Musa × paradisiaca, Musa paradisiaca var. sapientum, Musa acuminata × balbisiana) – gatunek rośliny jednoliściennej należący do rodziny bananowatych (Musaceae), powszechnie uprawiany dla owoców. Banan zwyczajny jest hybrydą prawdopodobnie dwóch gatunków dzikich: Musa acuminata i Musa balbisiana; nazwa Musa paradisiaca odnosi się tylko do roślin uprawnych będących hybrydami taksonów rodzicielskich niezależnie od ich ploidii i kombinacji genomów. Nie stwierdzono występowania banana zwyczajnego w stanie dzikim. Najważniejsza roślina uprawna w krajach o klimacie tropikalnym.",
            imageRes = R.drawable.banany1,
            gallery = listOf(
                R.drawable.banany1,
                R.drawable.banan2
            )
        ),
        Product(
            id = 5,
            name = "Cebula",
            category = "Warzywa",
            description = "Cebula (Allium cepa L.) – zwyczajowa nazwa warzywa należącego do rodziny amarylkowatych. Prawidłowa nazwa botaniczna to czosnek cebula, jest to bowiem gatunek należący do rodzaju czosnek. W użyciu jest jednak głównie nazwa cebula. Inne używane nazwy to: cebula ogrodowa, cebula zwyczajna, dymka[a], skulibaba.",
            imageRes = R.drawable.onion1,
            gallery = listOf(
                R.drawable.onion1,
                R.drawable.onion2
            )
        ),
        Product(
            id = 6,
            name = "Marchew",
            category = "Warzywa",
            description = "Marchew (Daucus L. 1753) – rodzaj roślin z rodziny selerowatych. Rodzaj liczy w zależności od ujęcia 44–45 lub 60 gatunków. W tym drugim wypadku włączane są tu m.in. rodzaje: Agrocharis, Margotia, Melanoselinum, Pseudorlaya, Turgenia. Rośliny te występują na wszystkich kontynentach, ale centrum zróżnicowania stanowi Europa, południowo-zachodnia i środkowa Azja, zwłaszcza obszar śródziemnomorski. W Polsce rośnie dziko podgatunek typowy marchwi zwyczajnej D. carota subsp. carota i w uprawie marchew zwyczajna jadalna D. carota subsp. sativus. Uprawiana i przejściowo dziczejąca jest poza tym także marchew złocista D. aureus. Ważną rośliną użytkową jest marchew zwyczajna D. carota. Jej podgatunek typowy (subsp. carota) rosnący także w Europie uznawany jest za trujący. Podgatunek jadalny (subsp. sativus) udomowiony został w Afganistanie. Roślina spożywana jest jako warzywo na surowo i przetworzona, także stosowana jest do wyrobu ciast. Jadane są korzenie, które w popularnych współcześnie odmianach mają kolor pomarańczowy, a dawnej i w mniej popularnych odmianach lub w różnych regionach uprawiane są rośliny o korzeniach barwy żółtej, białej lub ciemnoczerwonej (te ostatnie są szczególnie popularne np. w Indiach). Roślina wykorzystywana jest także jako pastewna. Korzenie po upieczeniu wykorzystywane były jako substytut kawy. Olejek uzyskiwany z owoców używany jest do aromatyzowania likierów i w kosmetyce.",
            imageRes = R.drawable.carrot1,
            gallery = listOf(
                R.drawable.carrot1,
                R.drawable.carrot2
            )
        ),
        Product(
            id = 7,
            name = "Ziemniak",
            category = "Warzywa",
            description = "Psianka ziemniak, ziemniak (Solanum tuberosum L.) – gatunek rośliny należący do rodziny psiankowatych. Nazwa „ziemniak” odnosi się zarówno do całej rośliny, jak i do jej jadalnych, bogatych w skrobię bulw pędowych, z powodu których ten gatunek uprawia się na skalę masową. Roślina wywodzi się z Ameryki Południowej, gdzie zaczęto ją uprawiać już tysiące lat temu. Ziemniak został przywieziony do Europy w końcu XVI wieku, a w ciągu następnych stuleci stał się jednym z podstawowych składników jadłospisu na całym świecie. W 2009 był czwartą pod względem wielkości produkcji rośliną uprawną (po kukurydzy, ryżu i pszenicy).",
            imageRes = R.drawable.potato1,
            gallery = listOf(
                R.drawable.potato1,
                R.drawable.potato2
            )
        ),
        Product(
            id = 8,
            name = "Ogórek siewny (gruntowy)",
            category = "Warzywa",
            description = "Ogórek siewny (Cucumis sativus L.) – gatunek ogórka z rodziny dyniowatych (Cucurbitaceae). Wywodzi się prawdopodobnie z gatunku Cucumis hardwickii dziko rosnącego u podnóża Himalajów. W Indiach uprawiany był już ok. 3 tys. lat temu, później został szeroko rozpowszechniony i obecnie znany jest we wszystkich strefach klimatycznych. Owoce ogórka siewnego wykorzystywane są powszechnie w kuchni wielu krajów. Nazwa odnosi się zarówno do rośliny płożącej, jak i jej cylindrycznych, jadalnych owoców.",
            imageRes = R.drawable.cucumber1,
            gallery = listOf(
                R.drawable.cucumber1,
                R.drawable.cucumber2
            )
        ),
        Product(
            id = 9,
            name = "Bazylia",
            category = "Zioła",
            description = "Bazylia (Ocimum L.) – rodzaj roślin z rodziny jasnotowatych. Należy do niego 65 gatunków. Zasięg rodzaju obejmuje wszystkie kontynenty w strefie międzyzwrotnikowej, przy czym centrum zróżnicowania gatunkowego stanowi Afryka. Szeroko rozprzestrzeniona jako gatunek uprawiany i introdukowany, także w strefie umiarkowanej jest bazylia pospolita O. basilicum, uprawiana także w Polsce. Wiele gatunków z tego rodzaju uprawianych jest jako aromatyczne zioła, zawierające olejki eteryczne (zob. olejek bazyliowy), używane są jako przyprawy do pożywienia, do wciągania nosem, do odstraszania owadów i jako rośliny lecznicze. Popularną rośliną przyprawową, zwłaszcza w basenie Morza Śródziemnego jest bazylia pospolita O. basilicum, wykorzystywana np. do przyprawiania zapiekanek, sosów, pizzy i likierów. Bazylia amerykańska O. americanum o aromacie przypominającym limonkowy, jest przyprawą dodawaną gł. do owoców morza. Uprawiane jako olejkodajne są także bazylia eugenolowa O. gratissimum i O. × africanum. O. obovatum bywa uprawiana jako ozdobna, ale też jest bioindykatorem miedzi.",
            imageRes = R.drawable.bazylia1,
            gallery = listOf(
                R.drawable.bazylia1,
                R.drawable.bazylia2
            )
        ),
        Product(
            id = 10,
            name = "Kolendra",
            category = "Zioła",
            description = "Kolendra (Coriandrum L.) – rodzaj roślin z rodziny selerowatych. Obejmuje w zależności od ujęcia dwa lub trzy gatunki. Występują one w południowo-zachodniej Azji, gdzie rosną w suchych, trawiastych murawach. W stanie świeżym mają nieprzyjemny zapach określany jako przypominający woń wydzielaną przez pluskwy. Kolendra siewna będąca rośliną przyprawową, jest rośliną użytkową znaną od starożytności. Została szeroko rozpowszechniona na świecie w uprawie i na wszystkich kontynentach strefach umiarkowanych i strefie międzyzwrotnikowej stwierdzona została jako gatunek dziczejący. Największymi producentami są Maroko i Indie.",
            imageRes = R.drawable.kolendra1,
            gallery = listOf(
                R.drawable.kolendra1,
                R.drawable.kolendra2
            )
        ),
        Product(
            id = 11,
            name = "Mięta",
            category = "Zioła",
            description = "Mięta (Mentha L.) – rodzaj roślin z rodziny jasnotowatych (Lamiaceae). W zależności od ujęcia taksonomicznego (stopnia uwzględnienia taksonów mieszańcowych, częstych w tym rodzaju) należy tu od ok. 18–19 do 24 gatunków. Zasięg rodzaju obejmuje wszystkie kontynenty z wyjątkiem Antarktydy i Ameryki Południowej (aczkolwiek na tej drugiej obecne są jako introdukowane). Rośliny te rosną na różnych siedliskach, najczęściej wilgotnych lub mokrych, ale też na suchych stepach. Mięty używane są jako zioła o specyficznym, miętowym aromacie, w kuchni, ale także w ziołolecznictwie. W Ameryce stosowany był tamtejszy gatunek – M. canadensis. W Starożytnym Rzymie głównie mięta nadwodna M. aquatica. Współcześnie największe znaczenie użytkowe mają: mięta zielona M. spicata, mięta wonna M. suaveolens, mięta pieprzowa M. × piperita, mięta długolistna M. longifolia, mięta polej M. pulegium. Jako roślina ozdobna na skalniakach uprawiana bywa mięta Requiena M. requienii.",
            imageRes = R.drawable.mint1,
            gallery = listOf(
                R.drawable.mint1,
                R.drawable.mint2
            )
        ),
        Product(
            id = 12,
            name = "Rozmaryn",
            category = "Zioła",
            description = "Rozmaryn (Rosmarinus L., właśc. Salvia subg. Rosmarinus (L.) J.B.Walker, B.T.Drew & J.G.González) – tradycyjnie wyróżniany rodzaj roślin z rodziny jasnotowatych, współcześnie podrodzaj w obrębie rodzaju szałwia Salvia. Obejmuje trzy gatunki i dwa mieszańce spotykane także w naturze występujące w południowej Europie i obszarze śródziemnomorskim. Rozmaryn lekarski jest popularną i od dawna uprawianą rośliną przyprawową, używaną także do wyrobu olejku rozmarynowego (surowiec m.in. do wyrobu wody kolońskiej), wykorzystywaną leczniczo, cenioną jako roślina miododajna, dawniej wykorzystywaną też na opał, dla poprawy pamięci, do ozdoby podczas pogrzebów i ślubów.",
            imageRes = R.drawable.rozmaryn1,
            gallery = listOf(
                R.drawable.rozmaryn1,
                R.drawable.rozmaryn2
            )
        ),
    )

    fun getProductsByCategory(category: String) = products.filter { it.category == category }
    fun getProductById(id: Int) = products.first { it.id == id }
}
