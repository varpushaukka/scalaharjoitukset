import scala.io.StdIn._

def karkausvuosiko(): Boolean = {
   val vuosi = readInt
   if (vuosi % 4 == 0)
      if (vuosi % 400 == 0 && vuosi % 4000 != 0) true
      else if (vuosi % 100 == 0 | vuosi % 100 == 0)
         false
      else true
   else false
}

println(karkausvuosiko())
