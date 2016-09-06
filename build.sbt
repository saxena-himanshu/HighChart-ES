name := "highchart-es"

version := "0.1"

scalaVersion := "2.11.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "org.elasticsearch" % "elasticsearch" % "2.3.3",
  "com.typesafe.play" %% "play-json" % "2.5.3"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
