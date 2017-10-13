name := "serverActor"

version := "2.5"

scalaVersion := "2.10.6"

//assemblyJarName in assembly := "ServerActor-assembly-2.0.jar"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.10" % "2.2.0",
  "com.typesafe.akka" % "akka-remote_2.10" % "2.2.0",
  "log4j" % "log4j" % "1.2.17",
  "org.apache.spark" % "spark-core_2.10" % "2.0.0" % "provided",
  "org.apache.spark" %"spark-mllib_2.10" % "2.0.0" % "provided"
)


//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.5.0"


//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.2.0"




//libraryDependencies += "com.typesafe.akka" % "akka-remote_2.11" % "2.5.0"


//libraryDependencies += "com.typesafe.akka" % "akka-remote_2.10" % "2.2.0"


//libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "2.2.0" //% "provided"

//libraryDependencies += "org.apache.spark" % "spark-mllib_2.10" % "2.2.0" //% "provided"




//libraryDependencies += "com.typesafe.akka" % "akka-protobuf_2.11" % "2.5.0"

//libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.1"

