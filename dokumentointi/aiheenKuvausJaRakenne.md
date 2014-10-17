  Ohjelman aihe: Gapper-pelin remake: Super-Gapper 2014

  Kuvaus: Super-Gapper on nuolinäppäimillä pelattava reaaliaikainen peli.

Inspiraationa toiminut alkuperäinen Gapper on tuntemattoman tekijän PC-peli vuodelta 1986. Gapperissa oli nelivärinen CGA-grafiikka joten Super-Gapperiin on laitettua tribuutiksi alkuperäistä mukailevat värit. Gapper on hieman sukua Pac-manille.

  Pelimekaniikka:

Pelaajan täytyy liikkua kentässä siten ettei Gapper törmää Seekeriin. Kun Gapper osuu Seekeriin, vähennetään elämä ja kenttä alkaa alusta niin että mitään viivoja ei ole väritetty. Kun Gapper osuu Seekeriin ja Gapperin elämät vähenevät nollaan, peli päättyy.


  
  Pelimekaniikan laajennus jota ei Super-Gapperissa ole toteutettu:

Gapperin tavoitteena on käydä ruudukon jokaisessa viivassa niin, ettei Seeker saa Gapperia kiinni. Kun kaikki alueet on väritetty, alkaa uusi kenttä. Gapperin ja Seekerin nopeus vaihtelee kenttäkohtaisesti.
 


  Pisteytys: 

Pelaaja saa pisteitä väistelemällä mahdollisimman pitkään Seekeriä.



  Pisteytyksen laajennus jota ei Super-Gapperissa ole toteutettu:

Kenttä koostuu ruudukosta, ensimmäisen kentän ruudukko on kokoa 3x3, tästä voi siis saada 3 x 3 x 50 pistettä.
Toisen kentän ruudukko 4x4. Kun ruutu on ympäröity, saa pelaaja 50 pistettä.



  Käyttöliittymä:

Nuolinäppäimet: Ylös, alas, oikea, vasen.





  Ohjelman rakenteen kuvaus:

Ohjelmassa on seuraavat luokat: 
App, Gapperpeli, Kayttoliittyma, Nappaimistonkuuntelija, Paivitettava, Piirtoalusta, Kentta, Ruutu, Tronviiva, Gapper, Liikkuja, Seeker, Suunta, Pistelaskuri. Lisäksi jokaisella luokalla on oma testiluokkansa.

App on ohjelman käynnistävä main-luokka joka käynnistää Gapperpelin. Gapperpeli luo Gapperin, Seekerin ja Kenttäluokan ilmentymät. 

Kayttoliittyma-luokka käyttää näppäimistönkuuntelijaa, päivitettävää ja piirtoalustaa. 
Nappaimistonkuuntelija kääntää pelaajan antamat painallukset uusiksi suunniksi jotka gapper ottaa jos kulkusuunta on sallittu. Paivitettava on interface jota piirtolalusta käyttää. Päivitettävä huolehtii piirtoalustan päivittämisestä muutosten jälkeen ja Gapperpeli käyttää sitä.

Gapper ja Seeker ovat Liikkuja-luokan ilmentymiä, niillä voi olla Suunta-enumeraattorin määrittämät suunnat.

  Ohjelman vajaatoiminnallisen rakenteen kuvaus:

Kenttä sisältää arraylistin Ruutuja ja toisen arraylistin Tronviivoja. Gapperpeli ei osaa käyttää niitä koska niiden toiminnallisuutta ei ehdittu saada käyttöön. Myöskin Pistelaskuri on kirjanpitoluokka joka kirjaisi tronviivojen ja ruutujen tilan mukaisesti pisteet jos se olisi jo pystytty toteuttamaan.
