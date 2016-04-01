// ei toimi, lol
def peli(): String = {
   val koneenLuku = (10*math.random).toInt
   for (i <- 0 to 2)
      var arvaus = readInt
      if (arvaus == koneenLuku) "voitit"
}

      
