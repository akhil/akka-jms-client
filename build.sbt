name := "akka-jms-client"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.6"

val akkaV = "2.4.0"
val activemqV = "5.10.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "com.typesafe.akka" %% "akka-testkit" % akkaV % Test,
  "org.scalatest" %% "scalatest" % "2.2.4" % Test
  
)

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }
