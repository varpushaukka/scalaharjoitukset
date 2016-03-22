import scala.io.StdIn._

def klomio(korkeus: Int, tahdet: Int) {
   if (korkeus == 0) return
   println(" " * korkeus + "*" + "**" * tahdet)
   klomio(korkeus - 1, tahdet + 1)
}

var korkeus = readInt
klomio(korkeus, 0)

