
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit msg: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheet/main.css")),format.raw/*8.93*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*9.74*/("""" type="text/javascript"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.at("bootstrap-3.1.1/css/bootstrap.css")),format.raw/*10.107*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("bootstrap-3.1.1/css/bootstrap.min.css")),format.raw/*11.111*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.at("images/favicon.png")),format.raw/*12.97*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery.js")),format.raw/*13.64*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("bootstrap-3.1.1/js/bootstrap.js")),format.raw/*14.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("bootstrap-3.1.1/js/bootstrap.min.js")),format.raw/*15.78*/("""" type="text/javascript"></script>
		
		<!-- HighCharts -->
		<script src="http://code.highcharts.com/highcharts.js"></script>
		<script src="http://code.highcharts.com/modules/exporting.js"></script>
		
		"""),_display_(/*21.4*/if(Messages("subheader.time_line") == title)/*21.48*/ {_display_(Seq[Any](format.raw/*21.50*/("""
			"""),format.raw/*22.4*/("""<script src=""""),_display_(/*22.18*/routes/*22.24*/.Assets.at("js/timeAndLineChartHandler.js")),format.raw/*22.67*/("""" type="text/javascript"></script>
		""")))}),format.raw/*23.4*/("""

		"""),_display_(/*25.4*/if(Messages("subheader.bar_column") == title)/*25.49*/ {_display_(Seq[Any](format.raw/*25.51*/("""
			"""),format.raw/*26.4*/("""<script src=""""),_display_(/*26.18*/routes/*26.24*/.Assets.at("js/barAndColumnChartHandler.js")),format.raw/*26.68*/("""" type="text/javascript"></script>
		""")))}),format.raw/*27.4*/("""
		
		"""),_display_(/*29.4*/if(Messages("subheader.area_pie") == title)/*29.47*/{_display_(Seq[Any](format.raw/*29.48*/("""
			"""),format.raw/*30.4*/("""<script src=""""),_display_(/*30.18*/routes/*30.24*/.Assets.at("js/pieAndAreaChartHandler.js")),format.raw/*30.66*/("""" type="text/javascript"></script>
		""")))}),format.raw/*31.4*/("""
		
		"""),_display_(/*33.4*/if(Messages("subheader.bubble") == title)/*33.45*/{_display_(Seq[Any](format.raw/*33.46*/("""
			"""),format.raw/*34.4*/("""<script src="http://code.highcharts.com/highcharts-more.js"></script>
			<script src=""""),_display_(/*35.18*/routes/*35.24*/.Assets.at("js/bubbleChartHandler.js")),format.raw/*35.62*/("""" type="text/javascript"></script>
		""")))}),format.raw/*36.4*/("""

"""),format.raw/*38.1*/("""</head>
    <body>
        """),_display_(/*40.10*/content),format.raw/*40.17*/("""
    """),format.raw/*41.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,msg:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(msg)

  def f:((String) => (Html) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (msg) => apply(title)(content)(msg)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 12:48:23 IST 2016
                  SOURCE: /home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/app/views/main.scala.html
                  HASH: 91b4171a3943e068724ad8b10cd0259c6ff2637a
                  MATRIX: 553->1|716->69|744->71|821->122|846->127|934->189|948->195|1001->228|1052->253|1066->259|1131->304|1246->392|1261->398|1330->445|1413->501|1428->507|1501->558|1589->619|1604->625|1657->657|1709->682|1724->688|1780->723|1864->780|1879->786|1945->831|2029->888|2044->894|2114->943|2347->1150|2400->1194|2440->1196|2471->1200|2512->1214|2527->1220|2591->1263|2659->1301|2690->1306|2744->1351|2784->1353|2815->1357|2856->1371|2871->1377|2936->1421|3004->1459|3037->1466|3089->1509|3128->1510|3159->1514|3200->1528|3215->1534|3278->1576|3346->1614|3379->1621|3429->1662|3468->1663|3499->1667|3613->1754|3628->1760|3687->1798|3755->1836|3784->1838|3839->1866|3867->1873|3899->1878
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|45->21|45->21|45->21|46->22|46->22|46->22|46->22|47->23|49->25|49->25|49->25|50->26|50->26|50->26|50->26|51->27|53->29|53->29|53->29|54->30|54->30|54->30|54->30|55->31|57->33|57->33|57->33|58->34|59->35|59->35|59->35|60->36|62->38|64->40|64->40|65->41
                  -- GENERATED --
              */
          