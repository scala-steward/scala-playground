//ThisBuild / scalaVersion := "2.12.13"
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false

update / evictionWarningOptions := EvictionWarningOptions.empty

addSbtPlugin("com.timushev.sbt" % "sbt-updates"  % "0.5.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-git"      % "1.0.0")
addSbtPlugin("io.spray"         % "sbt-revolver" % "0.9.1")
addSbtPlugin("org.scalameta"    % "sbt-scalafmt" % "2.4.2")
