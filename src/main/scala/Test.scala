import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._

import scala.io.{BufferedSource, Source}


object Test extends App {

  import model._


  val source = Source.fromURL("https://raw.githubusercontent.com/mledoze/countries/master/countries.json").mkString


  val decodedFoo = decode[RootInterface](source).toOption


  println(decodedFoo)


}
