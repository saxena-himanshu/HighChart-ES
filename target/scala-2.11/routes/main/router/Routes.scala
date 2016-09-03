
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/conf/routes
// @DATE:Sat Sep 03 12:39:55 IST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_1: controllers.Application,
  // @LINE:16
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_1: controllers.Application,
    // @LINE:16
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """line""", """controllers.Application.lineChart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """columnAndBarChart""", """controllers.Application.columnAndBarChart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """areaAndPieChart""", """controllers.Application.areaAndPieChart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """areaAndPieChart""", """controllers.Application.areaAndPieChart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bubbleChart""", """controllers.Application.bubbleChart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_lineChart1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("line")))
  )
  private[this] lazy val controllers_Application_lineChart1_invoker = createInvoker(
    Application_1.lineChart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "lineChart",
      Nil,
      "GET",
      """""",
      this.prefix + """line"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_columnAndBarChart2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("columnAndBarChart")))
  )
  private[this] lazy val controllers_Application_columnAndBarChart2_invoker = createInvoker(
    Application_1.columnAndBarChart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "columnAndBarChart",
      Nil,
      "GET",
      """""",
      this.prefix + """columnAndBarChart"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_areaAndPieChart3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("areaAndPieChart")))
  )
  private[this] lazy val controllers_Application_areaAndPieChart3_invoker = createInvoker(
    Application_1.areaAndPieChart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "areaAndPieChart",
      Nil,
      "GET",
      """""",
      this.prefix + """areaAndPieChart"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_areaAndPieChart4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("areaAndPieChart")))
  )
  private[this] lazy val controllers_Application_areaAndPieChart4_invoker = createInvoker(
    Application_1.areaAndPieChart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "areaAndPieChart",
      Nil,
      "GET",
      """""",
      this.prefix + """areaAndPieChart"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_bubbleChart5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bubbleChart")))
  )
  private[this] lazy val controllers_Application_bubbleChart5_invoker = createInvoker(
    Application_1.bubbleChart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "bubbleChart",
      Nil,
      "GET",
      """""",
      this.prefix + """bubbleChart"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_at6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:8
    case controllers_Application_lineChart1_route(params) =>
      call { 
        controllers_Application_lineChart1_invoker.call(Application_1.lineChart)
      }
  
    // @LINE:9
    case controllers_Application_columnAndBarChart2_route(params) =>
      call { 
        controllers_Application_columnAndBarChart2_invoker.call(Application_1.columnAndBarChart)
      }
  
    // @LINE:10
    case controllers_Application_areaAndPieChart3_route(params) =>
      call { 
        controllers_Application_areaAndPieChart3_invoker.call(Application_1.areaAndPieChart)
      }
  
    // @LINE:11
    case controllers_Application_areaAndPieChart4_route(params) =>
      call { 
        controllers_Application_areaAndPieChart4_invoker.call(Application_1.areaAndPieChart)
      }
  
    // @LINE:12
    case controllers_Application_bubbleChart5_route(params) =>
      call { 
        controllers_Application_bubbleChart5_invoker.call(Application_1.bubbleChart)
      }
  
    // @LINE:16
    case controllers_Assets_at6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(Assets_0.at(path, file))
      }
  }
}
