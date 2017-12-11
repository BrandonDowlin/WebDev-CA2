
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/WebDev-CA2/WebCA2/conf/routes
// @DATE:Mon Dec 11 14:32:54 GMT 2017


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
