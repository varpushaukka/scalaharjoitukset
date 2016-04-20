a)
 
		val lista = for (i <- 1 to 5; j <- i to 5; if i*j%2 != 0) yield(i*j)
		lista.foreach(println)

listaan sijoitetaan yieldin muodostama listakeräelmä, jossa on kaikki parilliset i:n ja j:n tulot. Lopuksi tulostetaan listan sisältö.

b)

		val l = List(1,2,3,4,5)
		val m = Array(5,6,7,8,9)
		var a = 0; var b = 0
		l.foreach(x => {m(b)+=x; b+=1})
		m.foreach(println _)


Ensin muodostetaan lista l, jossa on luvut yhdestä viiteen. Seuraavaksi muodostetaan array m, jossa on luvut viidestä yhdeksään. Array on kuin lista, mutta sisältää vain yhdentyyppisiä arvoja ja sen pituutta ei voi muuttaa. Seuraavaksi muodostetaan indeksimuuttujat a ja b.
Seuraavaksi jokaiseen m:n arvoon summataan l:n samassa kohdassa oleva arvo. Ja lopuksi tulostetaan.

c) 

		val a=1; val b=2; val c=3;
		{ val b=4; val c=5;
		  { val c=6;
		    println(a +"/"+ b +"/"+ c);
		  }
		  println(a +"/"+ b +"/"+ c);
		}
		println(a +"/"+ b +"/"+ c)

Tällä ohjelmalla ilmeisesti halutaan demota miten nimiavaruus toimii scalassa. Aluksi määritellään muuttujat a, b ja c. Sitten määritellään aaltosulkeiden sisällä uudestaan b ja c. Ja vielä näiden aaltosulkeiden sisällä uudestaan c. Kun sisimpien aaltosulkeiden sisällä pyydetään tulostamaan a, b ja c, se nodattaa hierarkiaa, jossa käytetään oman avaruutensa c:tä, ylemmän tason b:tä ja ylimmän a:ta. Kun siirrytään pois sisimmistä sulkeista, se ei näe enää sisimmissä sulkeissa määriteltyä c:tä. Kun siirrytään kokonaan sulkeiden ulkopuolelle, muuttujien arvot ovat samat kuin alun perin määritellyt.

d) Tee seuraavalle funktiolle Curry-muunnos funktiona g:

		def f(n: String, i: Int)  {println(n + ": " + i)}

Curry-muunnos: 

		def g(n: String)(i: Int) {println(n + ": " + i)}

Mistä on kysymys?: funktiota f kutsutaan näin: f("moi", 8)
ja funktiota g kutsutaan näin: g("moi")(8)

kun g:lle annetaan yksi argumentti, se palauttaa funktion, jolle voi antaa vielä yhden argumentin, jolloin se toteuttaa funktion.
