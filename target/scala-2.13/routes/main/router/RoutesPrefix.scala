// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mkurz/namespace-reverse-router-bug/conf/routes
// @DATE:Mon Mar 30 12:59:14 CEST 2020


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
