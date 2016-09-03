
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object bubble_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class bubble extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

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
						<h3 class="panel-title">"""),_display_(/*13.32*/Messages("label.bubble")),format.raw/*13.56*/("""</h3>
					</div>
					<div class="panel-body">
						<div id="bubbleChart" class="chart-holder"></div>
					</div>
				</div>

			</div><!-- /span12 -->
			
		</div><!-- /row -->
		
	</div><!-- /container -->

</div><!-- /main -->
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(message:String,msg:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(message)(msg)

  def f:((String) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (message) => (msg) => apply(message)(msg)

  def ref: this.type = this

}


}

/**/
object bubble extends bubble_Scope0.bubble
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 12:46:25 IST 2016
                  SOURCE: /home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/app/views/bubble.scala.html
                  HASH: 5df27226854e8097dd05090563aec068c7939cb3
                  MATRIX: 552->1|702->56|730->59|765->74|792->76|813->89|852->91|880->93|1100->286|1145->310|1408->543
                  LINES: 20->1|25->1|27->3|27->3|28->4|28->4|28->4|30->6|37->13|37->13|51->27
                  -- GENERATED --
              */
          