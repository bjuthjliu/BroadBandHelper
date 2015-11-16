import scala.util.Random
import scala.collection.mutable.ArrayBuffer

val a = ArrayBuffer[String]("YYX","mcDonald","kfc", "Pepper Lunch","7-11","7-11","DFG", "ZL","SX","Family Mart","mcDonald","kfc","DFG","ZL","SX","Family Mart", "QingFeng", "culiang", "culiang", "7-11")

println( a( Random.nextInt(a.length)  ) )
