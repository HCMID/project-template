// Build file for an MID editorial repository.
// This file should live in the root directory of your repository.

resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("neelsmith", "maven")


scalaVersion := "2.12.8"
licenses += ("GPL-3.0",url("https://opensource.org/licenses/gpl-3.0.html"))
resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  // Used by all projects:
  "edu.holycross.shot.cite" %% "xcite" % "4.2.1",
  "edu.holycross.shot" %% "scm" % "7.2.0",
  "edu.holycross.shot" %% "ohco2" % "10.18.2",
  "edu.holycross.shot" %% "citeobj" % "7.4.0",
  "edu.holycross.shot" %% "cex" % "6.4.0",
  "edu.holycross.shot" %% "midvalidator" % "12.2.2",

  // Must have at least one MidOrthography class
  "edu.holycross.shot" %% "latphone" % "2.0.0"
)

//enablePlugins(TutPlugin)
//tutTargetDirectory := file("docs")
//tutSourceDirectory := file("tut")
