Testausdokumentaatio

K�sin testaaminen:

Automaattisia testej� on riitt�m�t�n m��r� koska ohjelmalogiikkaa ei ollut aluksi kovinkaan paljon toteutettuna enk� voinut olemattomalle logiikalle toteuttaa automaattisia testej�. Kun k�ytt�liittym� oli viimein toteutettu, tuli ohjelman toiminnan k�sin testaaminen k�yt�nn�ss� mahdolliseksi.  Gapper ja Seeker eiv�t aluksi pysyneet pelialueen sis�ll� mutta bugi korjattiin asettamalla pelialueelle sis�- ja ulkorajat. Gapperin ja Seekerin suunnanmuutos onnistui vain risteyksiss� mutta bugi saatiin korjatuksi 16.10. T�m� oli mielest�ni hienoa sill� nyt suunnanmuutos onnistuu koko sallitulla pelialueella ja peli muuttui pelattavammaksi.

Ohjelman olemassaolevat ja tunnetut bugit: 

- Toista kentt�� ei voi k�ytt�� koska pelin scene� hallinnoivaa mekanismia ei ole toteutettu.
- Toiminnallisuudeltaan puutteellisti toteutetut luokat: pistelaskuri, kentta, tronviiva, ruutu.
- Peli pit�� sammuttaa ja k�ynnist�� uudelleen jos haluaa pelata uuden pelin el�mien loputtua.