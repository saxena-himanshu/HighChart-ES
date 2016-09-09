package domain

import play.api.libs.json._


//import Tuples._ 
/**
  * Created by supriya on 3/9/16.
  */
case class BarChart(name: String, data: List[Double])

case class ColumnChart(name: String, value: Double)

//case class ColumnChart(name:String,count:Double)
//case class ColumnChart(category:Tuple2[String,Double])