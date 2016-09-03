
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String)(implicit msg: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
"""),_display_(/*2.2*/navbar(message)),format.raw/*2.17*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),_display_(/*5.6*/play20/*5.12*/.welcome(message)),format.raw/*5.29*/("""
    
    

""")))}),format.raw/*9.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 12:47:41 IST 2016
                  SOURCE: /home/himanshu/Extra/PlayTemp/HighChart-With-ES/highchart-es/app/views/index.scala.html
                  HASH: 27d70fd0b297de964e168fff88e57a4cafbf3cd2
                  MATRIX: 550->1|700->56|727->58|762->73|789->75|820->98|859->100|891->107|905->113|942->130|984->143
                  LINES: 20->1|25->1|26->2|26->2|27->3|27->3|27->3|29->5|29->5|29->5|33->9
                  -- GENERATED --
              */
          