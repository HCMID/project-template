// Build file for an HMT editorial repository.
// This file should live in the root directory of your repository.

resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("neelsmith", "maven")


scalacOptions in (Compile, console) ++= Seq(
  "-i", "scripts/ortho.sc"
)

scalaVersion := "2.12.4"
libraryDependencies ++= Seq(
  "edu.holycross.shot.cite" %% "xcite" % "3.6.0",
  "edu.holycross.shot" %% "ohco2" % "10.9.0",
  "edu.holycross.shot" %% "dse" % "4.2.0",
  "edu.holycross.shot" %% "scm" % "6.1.1",

  "org.homermultitext" %% "hmtcexbuilder" % "3.2.0",

  "edu.holycross.shot" %% "midvalidator" % "1.3.0"

)
