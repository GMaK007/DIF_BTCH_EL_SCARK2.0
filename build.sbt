
name := "DIF_BTCH_EL_SCARK2.0"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.4",
  "org.apache.spark" %% "spark-sql" % "2.4.4",
  "com.typesafe" % "config" % "1.3.2",
  "com.microsoft.sqlserver" % "mssql-jdbc" % "6.1.0.jre8" % "provided",
  "org.xerial" % "sqlite-jdbc" % "3.27.2"
)