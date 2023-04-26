ThisBuild / organization := "com.santosh"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.2.2"

val ScalaTestVersion  = "3.2.15"
val ScalasticVersion  = "3.2.15"

lazy val root = (project in file("."))
  .settings(
    name := "scala-algorithms",
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % ScalasticVersion,
      "org.scalatest" %% "scalatest" % ScalaTestVersion % Test,
    ),
  )
