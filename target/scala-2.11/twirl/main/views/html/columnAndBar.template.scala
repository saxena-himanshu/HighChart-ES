
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object columnAndBar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class columnAndBar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

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
						<h3 class="panel-title">"""),_display_(/*16.32*/Messages("label.bar")),format.raw/*16.53*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="barChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->
		
		<div class="row">
		
			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*33.32*/Messages("label.stacked")),format.raw/*33.57*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="barStackedChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->

		<div class="row">

			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*50.32*/Messages("label.column")),format.raw/*50.56*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="columnChart" class="chart-holder"></div>
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
object columnAndBar extends columnAndBar_Scope0.columnAndBar
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 12:47:41 IST 2016
                  SOURCE: /home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/app/views/columnAndBar.scala.html
                  HASH: 36cd946ddcd721e8c0b33b75de2d31fb53c0cf3c
                  MATRIX: 564->1|714->56|742->59|777->74|804->76|825->89|864->91|892->93|1120->294|1162->315|1522->648|1568->673|1931->1009|1976->1033
                  LINES: 20->1|25->1|27->3|27->3|28->4|28->4|28->4|30->6|40->16|40->16|57->33|57->33|74->50|74->50
                  -- GENERATED --
              */
          