// Build file for an MID editorial repository.
// This file should live in the root directory of your repository.

resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("neelsmith", "maven")


scalaVersion := "2.12.8"
licenses += ("GPL-3.0",url("https://opensource.org/licenses/gpl-3.0.html"))
resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  "edu.holycross.shot.cite" %% "xcite" % "3.7.0",
  "edu.holycross.shot" %% "scm" % "6.2.0",
  "edu.holycross.shot" %% "ohco2" % "10.11.1",
  "edu.holycross.shot" %% "citeobj" % "7.2.0",
  "edu.holycross.shot" %% "cex" % "6.2.1",
  "edu.holycross.shot" %% "midvalidator" % "5.3.0"
)

enablePlugins(TutPlugin)

tutTargetDirectory := file("docs")
tutSourceDirectory := file("tut")
