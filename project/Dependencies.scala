import Dependencies.Versions
import sbt._

object Dependencies {
  case object Versions {
    val cats       = "2.6.1"
    val catsEffect = "3.1.0"
    val newtype    = "0.4.4"
    val refined    = "0.9.27"

    val chimney          = "0.6.1"
    val betterMonadicFor = "0.3.1"
    val kindProjector    = "0.13.0"
    val deriving         = "3.0.0-M3"
    val contextApplied   = "0.1.4"
    val skunk            = "0.1.1"
    val circe            = "0.14.1"
    val shapeless        = "2.3.3"
    val jackson          = "2.12.3"
    val smithy4s         = "0.12.0"

    val log4cats = "2.0.1"
    val logback  = "1.2.3"

    val junit               = "5.7.0"
    val junitInterface      = "0.9.1"
    val scalaCheck          = "1.15.4"
    val scalaTest           = "3.2.9"
    val scalaTestPlus       = "3.2.9.0"
    val disciplineScalaTest = "2.1.5"
    val weaver              = "0.7.4"
  }

  case object Libraries {
    def cats(artifact: String): ModuleID    = "org.typelevel" %% artifact % Versions.cats
    def circe(artifact: String): ModuleID   = "io.circe"      %% artifact % Versions.circe
    def refined(artifact: String): ModuleID = "eu.timepit"    %% artifact % Versions.refined

    val catsCore   = cats("cats-core")
    val catsEffect = "org.typelevel" %% "cats-effect" % Versions.catsEffect

    val skunk        = "org.tpolecat" %% "skunk-core"  % Versions.skunk
    val skunkCirce   = "org.tpolecat" %% "skunk-circe" % Versions.skunk
    val skunkRefined = "org.tpolecat" %% "refined"     % Versions.skunk

    val refinedCore     = refined("refined")
    val refinedCats     = refined("refined-cats")
    val chimney         = "io.scalaland"                 %% "chimney"          % Versions.chimney
    val log4cats        = "org.typelevel"                %% "log4cats-slf4j"   % Versions.log4cats
    val newtype         = "io.estatico"                  %% "newtype"          % Versions.newtype
    val circeCore       = circe("circe-core")
    val circeGeneric    = circe("circe-generic")
    val circeParser     = circe("circe-parser")
    val shapeless       = "com.chuusai"                  %% "shapeless"        % Versions.shapeless
    val scalaTestSuite  = "org.scalatest"                %% "scalatest"        % Versions.scalaTest
    val jacksonCore     = "com.fasterxml.jackson.core"    % "jackson-core"     % Versions.jackson
    val jacksonDatabind = "com.fasterxml.jackson.core"    % "jackson-databind" % Versions.jackson
    val smithy4s        = "com.disneystreaming.smithy4s" %% "smithy4s-core"    % Versions.smithy4s
    val smithy4sHttp4s = "com.disneystreaming.smithy4s" %% "smithy4s-http4s" % Versions.smithy4s
    val smithy4sHttp4sSwagger = "com.disneystreaming.smithy4s" %% "smithy4s-http4s-swagger" % Versions.smithy4s


    // Runtime
    val logback = "ch.qos.logback" % "logback-classic" % Versions.logback

    // Test
    val junit               = "org.junit.jupiter"    % "junit-jupiter-api"    % Versions.junit
    val junitInterface      = "net.aichler"          % "jupiter-interface"    % Versions.junitInterface
    val scalaCheck          = "org.scalacheck"      %% "scalacheck"           % Versions.scalaCheck          % Test
    val scalaTest           = "org.scalatest"       %% "scalatest"            % Versions.scalaTest           % Test
    val disciplineScalaTest = "org.typelevel"       %% "discipline-scalatest" % Versions.disciplineScalaTest % Test
    val scalaTestPlus       = "org.scalatestplus"   %% "scalacheck-1-15"      % Versions.scalaTestPlus
    val weaverCats          = "com.disneystreaming" %% "weaver-cats"          % Versions.weaver
    val weaverScalaCheck    = "com.disneystreaming" %% "weaver-scalacheck"    % Versions.weaver
    val weaverDiscipline    = "com.disneystreaming" %% "weaver-discipline"    % Versions.weaver

    val http4sEmber = "org.http4s" %% "http4s-ember-server" % "0.23.7"


    val catsLaws = cats("cats-laws")
  }

  case object CompilerPlugins {
    val `context-applied`    = "org.augustjune" %% "context-applied"      % Versions.contextApplied
    val `kind-projector`     = "org.typelevel"  %% "kind-projector"       % Versions.kindProjector cross CrossVersion.full
    val `better-monadic-for` = "com.olegpy"     %% "better-monadic-for"   % Versions.betterMonadicFor
    val `deriving-macro`     = "org.scalaz"      % "scalaz-deriving_2.13" % Versions.deriving
  }
}
