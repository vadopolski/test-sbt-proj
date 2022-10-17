object model {

  case class RootInterface(
                            name: Name,
                            capital: Seq[String],
                            region: String,
                            area: Int,
                          )

  case class Name(official: String)


}
