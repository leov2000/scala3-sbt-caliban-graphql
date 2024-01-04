name := "scala-caliban-graphql"

version := "0.1"

scalaVersion := "3.3.1"

val pekkoTypedActorVersion = "1.0.2"
val pekkoHttpVersion = "1.0.0"
val calibanVersion = "2.5.0"
val circeVersion = "1.9.6"
val zioVersion = "2.0.20"
val logbackVersion = "1.3.0"
val scalaLoggingVersion = "3.9.5"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % logbackVersion,
  "com.github.ghostdogpr" %% "caliban" % calibanVersion,
  "com.github.ghostdogpr" %% "caliban-pekko-http" % calibanVersion,
  "org.apache.pekko" %% "pekko-http" % pekkoHttpVersion,
  "org.apache.pekko" %% "pekko-actor-typed" % pekkoTypedActorVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % circeVersion,
  "com.typesafe.scala-logging" %% "scala-logging" % scalaLoggingVersion,
  "dev.zio" %% "zio" % zioVersion,
  "dev.zio" %% "zio-streams" % zioVersion
)
