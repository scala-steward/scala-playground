import sbt._

object Dependencies {
  case object com {
    case object github {
      case object alexarchambault {
        val `scalacheck-shapeless_1.14` = "com.github.alexarchambault" %% "scalacheck-shapeless_1.14" % "1.2.5"
      }
    }

    case object olegpy {
      val `better-monadic-for` = "com.olegpy" %% "better-monadic-for" % "0.3.1"
    }
  }

  case object org {
    case object augustjune {
      val `context-applied` = "org.augustjune" %% "context-applied" % "0.1.4"
    }

    case object scalacheck {
      val scalacheck = "org.scalacheck" %% "scalacheck" % "1.15.3"
    }

    case object scalatest {
      val scalatest = "org.scalatest" %% "scalatest" % "3.2.8"
    }

    case object scalatestplus {
      val `scalacheck-1-14` = "org.scalatestplus" %% "scalacheck-1-14" % "3.2.2.0"
    }

    case object typelevel {
      val `discipline-scalatest` = "org.typelevel" %% "discipline-scalatest" % "2.1.4"
      val `kind-projector`       = "org.typelevel" %% "kind-projector"       % "0.11.3" cross CrossVersion.full
      val catsCore               = "org.typelevel" %% "cats-core"            % "2.6.0"
    }
  }

  case object io {
    case object scalaland {
      val chimney     = "io.scalaland" %% "chimney"      % "0.6.1"
      val chimneyCats = "io.scalaland" %% "chimney-cats" % "0.6.1"
    }
  }
}
