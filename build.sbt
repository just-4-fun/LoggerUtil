
lazy val logger = project.in(file("."))
  .settings(commonSettings: _*)
  .settings(testSettings: _*)
  .settings(paradiseSettings: _*)

lazy val commonSettings = Seq(
	name := "logger"
	, organization := "just4fun"
	, version := "1.0-SNAPSHOT"
	, scalaVersion := "2.11.7"
	, exportJars := true
	, licenses := Seq("BSD-style" -> url("http://www.opensource.org/licenses/bsd-license.php"))
	, homepage := Some(url("https://github.com/just-4-fun"))
)

lazy val testSettings = Seq(
	publishArtifact in Test := false
	, mainClass in(Test, run) := Some("just4fun.utils.logger.test.Test") // command > test:run
	, libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)

lazy val paradiseSettings = Seq(
	resolvers += Resolver.sonatypeRepo("snapshots")
	, resolvers += Resolver.sonatypeRepo("releases")
	, addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0-M5" cross CrossVersion.full)
	, libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-reflect" % _)
)

// link this project via:
// libraryDependencies += "just4fun" %% "logger" % "1.0-SNAPSHOT"

// to publish locally: publishLocal
// run update in linking projects

