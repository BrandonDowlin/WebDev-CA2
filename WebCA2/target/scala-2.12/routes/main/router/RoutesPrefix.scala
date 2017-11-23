
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Documents/WebDev-CA2-master/WebCA2 Play/conf/routes
// @DATE:Thu Nov 23 21:44:34 GMT 2017


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
