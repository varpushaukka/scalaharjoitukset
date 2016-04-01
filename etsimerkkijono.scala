//raakile tämäkin
def etsimerkkijono(word: String, tiedosto: String): String = {
   val lines = scala.io.Source.fromFile(tiedosto).mkString
   if (lines contains word) return "jee"
}


