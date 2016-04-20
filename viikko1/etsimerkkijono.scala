//raakile tämäkin
def etsimerkkijono(word: String, tiedosto: String)  {
   val lines = scala.io.Source.fromFile(tiedosto).mkString
   if (lines contains word) print(lines indexOf word)
}


etsimerkkijono("kolmio", "file.html")
