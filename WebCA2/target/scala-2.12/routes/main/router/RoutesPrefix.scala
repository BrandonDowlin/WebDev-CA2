
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Documents/stop/WebDev-CA2/WebCA2/conf/routes
// @DATE:Thu Dec 14 22:04:37 GMT 2017


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
