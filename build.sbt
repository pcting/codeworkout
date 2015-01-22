name := "codeworkout"

organization := "com.patrickting"

version := "0.1-SNAPSHOT"

description := "Code Challenege Exercises"

publishMavenStyle := true

crossPaths := false

autoScalaLibrary := false

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "compile"
)

mainClass in (Compile, run) := Some("com.patrickting.codeworkout.Criminal")