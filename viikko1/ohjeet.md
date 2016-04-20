# Scalaohjeet javaohjelmoijalle

## funktiot
 - funktiot määritellään def:llä.
 
                        def karkausvuosiko(vuosi: Int): Boolean = {

 - muuttujat nimetään ja niiden tyyppi annetaan kaksoispisteellä erotettuna nimen perään
 - funktion palautustyyppi annetaan kaksoispisteellä erotettuna funktion nimen perään
 - jos palautustyyppiä ei anneta, sen tyyppi on Unit() eli void
 - returnia ei tarvita, voidaan kirjoittaa suoraan se mitä palautetaan

## toistorakenteet
 - scalassa funktioille voi antaa argumentiksi funktioita
 - foreach ja map helpottavat listojen läpikäymistä
 - voi käyttää pythonmaista for i in range(n,m) vastaavasti:

                        for (i <- n to m)

