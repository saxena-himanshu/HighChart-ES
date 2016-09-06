package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.Messages
import play.api.Play.current
import play.api.i18n.Messages.Implicits._
import service.ChartService
import javax.inject._
import play.api.libs.json._
import domain.JsonFormat.barJsonFormat

@Singleton
class Application @Inject()(chartService: ChartService) extends Controller {

  def index = Action {
    Ok(views.html.lineChart(Messages("subheader.time_line")))
  }

  def lineChart = Action {
    Ok(views.html.lineChart(Messages("subheader.time_line")))
  }

  def columnAndBarChart = Action {
    val (categories, data) = chartService.getBarChartData
    Ok(views.html.columnAndBar(Messages("subheader.bar_column"), Json.toJson(categories), Json.toJson(data)))
  }

  def areaAndPieChart = Action {
    Ok(views.html.pieAndArea(Messages("subheader.area_pie")))
  }

  def bubbleChart = Action {
    Ok(views.html.bubble(Messages("subheader.bubble")))
  }
}
