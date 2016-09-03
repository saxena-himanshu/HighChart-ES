
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navbar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(selectedSubNavbar: String)(implicit msg: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.67*/("""

"""),format.raw/*3.1*/("""<nav class="navbar navbar-inverse" role="navigation">
	<div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" target="_blank" href="http://www.highcharts.com/">Highcharts</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class=""""),_display_(/*19.21*/if(Messages("subheader.time_line") == selectedSubNavbar)/*19.77*/{_display_(Seq[Any](format.raw/*19.78*/("""active""")))}),format.raw/*19.85*/("""">
        	<a href=""""),_display_(/*20.20*/routes/*20.26*/.Application.lineChart),format.raw/*20.48*/("""">
        		<i class="icon-tasks"></i>
        		<span>"""),_display_(/*22.18*/Messages("subheader.time_line")),format.raw/*22.49*/("""</span>
        	</a>
        </li>
        <li class=""""),_display_(/*25.21*/if(Messages("subheader.bar_column") == selectedSubNavbar)/*25.78*/{_display_(Seq[Any](format.raw/*25.79*/("""active""")))}),format.raw/*25.86*/("""">
        	<a href=""""),_display_(/*26.20*/routes/*26.26*/.Application.columnAndBarChart),format.raw/*26.56*/("""">
        		<i class=" icon-barcode"></i>
        		<span>"""),_display_(/*28.18*/Messages("subheader.bar_column")),format.raw/*28.50*/("""</span>
        	</a>
        </li>
        <li class=""""),_display_(/*31.21*/if(Messages("subheader.area_pie") == selectedSubNavbar)/*31.76*/{_display_(Seq[Any](format.raw/*31.77*/("""active""")))}),format.raw/*31.84*/("""">
        	<a href=""""),_display_(/*32.20*/routes/*32.26*/.Application.areaAndPieChart),format.raw/*32.54*/("""">
        		<i class="icon-th-large"></i>
        		<span>"""),_display_(/*34.18*/Messages("subheader.area_pie")),format.raw/*34.48*/("""</span>
        	</a>
        </li>
        <li class=""""),_display_(/*37.21*/if(Messages("subheader.bubble") == selectedSubNavbar)/*37.74*/{_display_(Seq[Any](format.raw/*37.75*/("""active""")))}),format.raw/*37.82*/("""">
        	<a href=""""),_display_(/*38.20*/routes/*38.26*/.Application.bubbleChart),format.raw/*38.50*/("""">
        		<i class=" icon-tint"></i>
        		<span>"""),_display_(/*40.18*/Messages("subheader.bubble")),format.raw/*40.46*/("""</span>
        	</a>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

"""))
      }
    }
  }

  def render(selectedSubNavbar:String,msg:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(selectedSubNavbar)(msg)

  def f:((String) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (selectedSubNavbar) => (msg) => apply(selectedSubNavbar)(msg)

  def ref: this.type = this

}


}

/**/
object navbar extends navbar_Scope0.navbar
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 12:48:38 IST 2016
                  SOURCE: /home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/app/views/navbar.scala.html
                  HASH: d851eafd8cca2e429059cb66e2d40b7b8fb0ffa5
                  MATRIX: 552->1|712->66|740->68|1570->871|1635->927|1674->928|1712->935|1761->957|1776->963|1819->985|1903->1042|1955->1073|2038->1129|2104->1186|2143->1187|2181->1194|2230->1216|2245->1222|2296->1252|2383->1312|2436->1344|2519->1400|2583->1455|2622->1456|2660->1463|2709->1485|2724->1491|2773->1519|2860->1579|2911->1609|2994->1665|3056->1718|3095->1719|3133->1726|3182->1748|3197->1754|3242->1778|3326->1835|3375->1863
                  LINES: 20->1|25->1|27->3|43->19|43->19|43->19|43->19|44->20|44->20|44->20|46->22|46->22|49->25|49->25|49->25|49->25|50->26|50->26|50->26|52->28|52->28|55->31|55->31|55->31|55->31|56->32|56->32|56->32|58->34|58->34|61->37|61->37|61->37|61->37|62->38|62->38|62->38|64->40|64->40
                  -- GENERATED --
              */
          