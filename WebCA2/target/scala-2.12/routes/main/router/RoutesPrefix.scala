
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/fuck off/WebDev-CA2/WebCA2/conf/routes
// @DATE:Fri Nov 24 15:01:17 GMT 2017


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
