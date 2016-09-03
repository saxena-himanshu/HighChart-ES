
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/conf/routes
// @DATE:Sat Sep 03 12:39:55 IST 2016


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
