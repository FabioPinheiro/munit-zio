addSbtPlugin("org.scalameta"  % "sbt-scalafmt"   % "2.4.6")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.10")

val scalaJSVersion = sys.env.getOrElse("SCALAJS_VERSION", "1.10.1")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.2.0")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"              % scalaJSVersion)
