
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/conf/routes
// @DATE:Sat Sep 03 12:39:55 IST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def columnAndBarChart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.columnAndBarChart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "columnAndBarChart"})
        }
      """
    )
  
    // @LINE:12
    def bubbleChart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.bubbleChart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bubbleChart"})
        }
      """
    )
  
    // @LINE:8
    def lineChart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.lineChart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "line"})
        }
      """
    )
  
    // @LINE:10
    def areaAndPieChart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.areaAndPieChart",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "areaAndPieChart"})
          }
        
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
