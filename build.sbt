lazy val root: Project = (project in file("."))
  .enablePlugins(PlayWeb)
  .settings(
    name := "namespace-reverse-router-bug",
    scalaVersion := "2.13.1",
    namespaceReverseRouter := true,
  )
