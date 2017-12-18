
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brandon/Web/WebDev-CA2/WebCA2/conf/routes
// @DATE:Mon Dec 18 17:42:00 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
