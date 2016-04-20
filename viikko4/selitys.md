a) 
		val lista = for (i <- 1 to 5; j <- i to 5; if i*j%2 != 0) yield(i*j)
		lista.foreach(println)

listaan sijoitetaan yieldin muodostama listakeräelmä, jossa on kaikki parilliset i:n ja j:n tulot. Lopuksi tulostetaan listan sisältö.

b)
Ensin muodostetaan lista l, jossa on luvut yhdestä viiteen. Seuraavaksi muodostetaan array m, jossa on luvut viidestä yhdeksään. Array on kuin lista, mutta sisältää vain yhdentyyppisiä arvoja ja sen pituutta ei voi muuttaa. Seuraavaksi muodostetaan indeksimuuttujat a ja b.
Seuraavaksi jokaiseen m:n arvoon summataan l:n samassa kohdassa oleva arvo. Ja lopuksi tulostetaan.

c) Tällä ohjelmalla ilmeisesti halutaan demota miten nimiavaruus toimii scalassa. Aluksi määritellään muuttujat a, b ja c. Sitten määritellään aaltosulkeiden sisällä uudestaan b ja c. Ja vielä näiden aaltosulkeiden sisällä uudestaan c. Kun sisimpien aaltosulkeiden sisällä pyydetään tulostamaan a, b ja c, se nodattaa hierarkiaa, jossa käytetään oman avaruutensa c:tä, ylemmän tason b:tä ja ylimmän a:ta. Kun siirrytään pois sisimmistä sulkeista, se ei näe enää sisimmissä sulkeissa määriteltyä c:tä. Kun siirrytään kokonaan sulkeiden ulkopuolelle, muuttujien arvot ovat samat kuin alun perin määritellyt.

d) 
