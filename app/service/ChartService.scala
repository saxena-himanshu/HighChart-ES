package service

import domain.BarChart
import domain.ColumnChart

/**
  * Created by supriya on 3/9/16.
  */
class ChartService {

  /**
    *
    * @return
    */
  def getBarChartData: (List[String], List[BarChart]) = {
    val categories = List("Africa", "America", "Asia", "Europe", "Oceania")
    //val b1 = BarChart("Tokyo", List(49.9, 71.5, 106.4, 129.2, 144.0))
    //val b2 = BarChart("New York", List(105.0, 104.3, 91.2, 83.5, 106.6))
    //val b3 = BarChart("London", List(59.6, 52.4, 65.2, 59.3, 51.2))
    // val b4 = BarChart("Berlin", List(42.4, 33.2, 34.5, 39.7, 52.6))

    val b1 = BarChart("Tokyo", List(49.9))
    val b2 = BarChart("New York", List(105.0))
    val b3 = BarChart("London", List(59.6))
    val b4 = BarChart("Berlin", List(42.4))

    (categories, List(b1, b2, b3, b4))
  }

  def getColumnChartData: List[ColumnChart] = {
    List(
      ColumnChart("London", 49.7),
      ColumnChart("America", 67.7),
      ColumnChart("Canada", 43.2),
      ColumnChart("Berlin", 14.3))
  }

}
