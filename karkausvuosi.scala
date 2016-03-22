import scala.io.StdIn._

def karkausvuosiko(vuosi: Int): Boolean = {
   if (vuosi % 4 == 0)
      if (vuosi % 400 == 0 && vuosi % 4000 != 0) true
      else if (vuosi % 100 == 0 | vuosi % 100 == 0)
         false
      else true
   else false
}

val ekavuosi = readInt
val tokavuosi = readInt
for (i <- ekavuosi to tokavuosi)
   if (karkausvuosiko(i)) println(i)


