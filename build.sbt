name := "template-scala-parallel-leadscoring"

scalaVersion := "2.11.12"
libraryDependencies ++= Seq(
  "org.apache.predictionio"    %% "apache-predictionio-core"          % "0.14.0" % "provided",
  "org.apache.spark" %% "spark-core"    % "1.3.0" % "provided",
  "org.apache.spark" %% "spark-mllib"   % "1.3.0" % "provided")
