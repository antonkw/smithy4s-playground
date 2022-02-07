import Dependencies._
import com.typesafe.sbt.SbtGit.GitKeys._
import com.typesafe.sbt.SbtGit.git.defaultTagByVersionStrategy
import sbt.UpperStateOps.UpperStateOpsImpl
ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "io.antonkw"
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / scalafmtOnCompile := false
ThisBuild / versionScheme := Some("semver-spec")

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:_",
  "-unchecked",
//  "-Wunused:imports,patvars,privates,locals,explicits,synthetics",
  "-Xfatal-warnings",
  "-Ymacro-annotations",
  "-Xsource:3"
)

ThisBuild / scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0"
ThisBuild / useGitDescribe := true
ThisBuild / resolvers += Resolver.jcenterRepo
ThisBuild / autoAPIMappings := true

//enablePlugins(GitVersioning)


lazy val root =
  project
    .in(file("."))
    .enablePlugins(BuildInfoPlugin, Smithy4sCodegenPlugin)
    .settings(

      libraryDependencies ++= Seq(
        compilerPlugin(CompilerPlugins.`context-applied`),
        compilerPlugin(CompilerPlugins.`kind-projector`),
        compilerPlugin(CompilerPlugins.`better-monadic-for`),
        compilerPlugin(CompilerPlugins.`deriving-macro`),
        Libraries.newtype,
        Libraries.refinedCore,
        Libraries.circeCore,
        Libraries.catsCore,
        Libraries.catsEffect,
        Libraries.refinedCats,
        Libraries.chimney,
        Libraries.smithy4s,
        Libraries.http4sEmber,
        Libraries.smithy4sHttp4s,
        Libraries.smithy4sHttp4sSwagger
      )
    )
