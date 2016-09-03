
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pieAndArea_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class pieAndArea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit msg: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/navbar(message)),format.raw/*3.17*/("""

"""),_display_(/*5.2*/main(message)/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""

"""),format.raw/*7.1*/("""<div class="main">
	<div class="container">

		<div class="row">
		
			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*16.32*/Messages("label.pie")),format.raw/*16.53*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="pieChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->
		
		<div class="row">
		
			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*33.32*/Messages("label.area")),format.raw/*33.54*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="areaChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->

		<div class="row">

			<div class="col-md-12">
			
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">"""),_display_(/*50.32*/Messages("label.combination")),format.raw/*50.61*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="comboChart" class="chart-holder"></div>
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
object pieAndArea extends pieAndArea_Scope0.pieAndArea
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 12:47:41 IST 2016
                  SOURCE: /home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/app/views/pieAndArea.scala.html
                  HASH: af2aa55d04830ed469b065c2b86bbb4d93d95c27
                  MATRIX: 560->1|710->56|738->59|773->74|801->77|822->90|861->92|889->94|1114->292|1156->313|1516->646|1559->668|1916->998|1966->1027
                  LINES: 20->1|25->1|27->3|27->3|29->5|29->5|29->5|31->7|40->16|40->16|57->33|57->33|74->50|74->50
                  -- GENERATED --
              */
          