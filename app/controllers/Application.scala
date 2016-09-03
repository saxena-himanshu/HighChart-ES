package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.Messages
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

class Application extends Controller {

  def index = Action {
    Ok(views.html.lineChart(Messages("subheader.time_line")))
  }

  def lineChart = Action {
    Ok(views.html.lineChart(Messages("subheader.time_line")))
  }

  def columnAndBarChart = Action {
    val categoryList = List("Africa", "America", "Asia", "Europe", "Oceania")
    val categories = List("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
    val name = "Tokyo"
    val data = List(49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4)
    val name2 = "New York"
    val data2 = List(83.6, 78.8, 98.5, 93.4, 106.0, 84.5, 105.0, 104.3, 91.2, 83.5, 106.6, 92.3)
    val name3 = "London"
    val data3 = List(48.9, 38.8, 39.3, 41.4, 47.0, 48.3, 59.0, 59.6, 52.4, 65.2, 59.3, 51.2)
    val name4 = "Berlin"
    val data4 = List(42.4, 33.2, 34.5, 39.7, 52.6, 75.5, 57.4, 60.4, 47.6, 39.1, 46.8, 51.1)
    Ok(views.html.columnAndBar(Messages("subheader.bar_column")))
  }

  def areaAndPieChart = Action {
    Ok(views.html.pieAndArea(Messages("subheader.area_pie")))
  }

  def bubbleChart = Action {
    Ok(views.html.bubble(Messages("subheader.bubble")))
  }
}
