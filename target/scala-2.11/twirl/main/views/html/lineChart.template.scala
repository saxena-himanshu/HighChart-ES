
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object lineChart_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class lineChart extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit msg: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/navbar(message)),format.raw/*3.17*/("""
"""),_display_(/*4.2*/main(message)/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""

"""),format.raw/*6.1*/("""<div class="main">
	<div class="container">

		
		<div class="row">
		
			<div class="col-md-12">

				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*16.32*/Messages("label.line")),format.raw/*16.54*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="lineChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->

		<div class="row">

			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*33.32*/Messages("label.time")),format.raw/*33.54*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="timeSeriesChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->

		</div><!-- /row -->

	</div><!-- /container -->

</div><!-- /main -->
""")))}))
      }
    }
  }

  def render(message:String,msg:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(message)(msg)

  def f:((String) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (message) => (msg) => apply(message)(msg)

  def ref: this.type = this

}


}

/**/
object lineChart extends lineChart_Scope0.lineChart
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 12:47:41 IST 2016
                  SOURCE: /home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/app/views/lineChart.scala.html
                  HASH: 04e91a9afa94b20769307f4f561676448e7a2098
                  MATRIX: 558->1|708->56|736->59|771->74|798->76|819->89|858->91|886->93|1111->291|1154->313|1511->643|1554->665
                  LINES: 20->1|25->1|27->3|27->3|28->4|28->4|28->4|30->6|40->16|40->16|57->33|57->33
                  -- GENERATED --
              */
          