
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/fuck you/WebDev-CA2/WebCA2/conf/routes
// @DATE:Fri Nov 24 13:17:51 GMT 2017


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
