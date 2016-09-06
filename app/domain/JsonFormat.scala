package domain

import play.api.libs.json._
/**
  * Created by supriya on 3/9/16.
  */
object JsonFormat {

  implicit val barJsonFormat = Json.format[BarChart]

}
