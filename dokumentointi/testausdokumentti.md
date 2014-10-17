Testausdokumentaatio

Käsin testaaminen:

Automaattisia testejä on riittämätön määrä koska ohjelmalogiikkaa ei ollut aluksi kovinkaan paljon toteutettuna enkä voinut olemattomalle logiikalle toteuttaa automaattisia testejä. Kun käyttöliittymä oli viimein toteutettu, tuli ohjelman toiminnan käsin testaaminen käytännössä mahdolliseksi.  Gapper ja Seeker eivät aluksi pysyneet pelialueen sisällä mutta bugi korjattiin asettamalla pelialueelle sisä- ja ulkorajat. Gapperin ja Seekerin suunnanmuutos onnistui vain risteyksissä mutta bugi saatiin korjatuksi 16.10. Tämä oli mielestäni hienoa sillä nyt suunnanmuutos onnistuu koko sallitulla pelialueella ja peli muuttui pelattavammaksi.

Ohjelman olemassaolevat ja tunnetut bugit: 

- Toista kenttää ei voi käyttää koska pelin sceneä hallinnoivaa mekanismia ei ole toteutettu.
- Toiminnallisuudeltaan puutteellisti toteutetut luokat: pistelaskuri, kentta, tronviiva, ruutu.
- Peli pitää sammuttaa ja käynnistää uudelleen jos haluaa pelata uuden pelin elämien loputtua.