import sbt._
object Dependencies {

  lazy val akkaHttpV = "10.1.5"
  lazy val akkaV = "2.5.12"
  lazy val jettyV = "8.1.12.v20130726"
  lazy val pureConfigV = "0.9.2"
  lazy val metricsScalaV = "3.5.9"
  lazy val prometheusV = "0.4.0"
  lazy val catsEffectV = "1.0.0"
  lazy val configV = "1.3.2"
  lazy val scalikejdbcV = "3.3.1"
  lazy val scalaTestV = "3.0.4"
  lazy val scodecV = "1.1.5"
  lazy val playV = "2.6.19"
  lazy val awsV = "1.11.423"
  lazy val jaxbV = "2.3.0"
  lazy val ip4sV = "1.1.1"

  lazy val apiDependencies = Seq(
    "com.typesafe.akka"         %% "akka-http"                      % akkaHttpV,
    "com.typesafe.akka"         %% "akka-http-spray-json"           % akkaHttpV,
    "de.heikoseeberger"         %% "akka-http-json4s"               % "1.21.0",
    "com.typesafe.akka"         %% "akka-slf4j"                     % akkaV,
    "com.typesafe.akka"         %% "akka-actor"                     % akkaV,
    "com.aaronbedra"            %  "orchard"                        % "0.1.1",
    "com.amazonaws"             %  "aws-java-sdk-core"              % awsV withSources(),
    "com.github.ben-manes.caffeine" % "caffeine"                    % "2.2.7",
    "com.github.cb372"          %% "scalacache-caffeine"            % "0.9.4",
    "com.google.protobuf"       %  "protobuf-java"                  % "2.6.1",
    "dnsjava"                   %  "dnsjava"                        % "2.1.7",
    "org.apache.commons"        %  "commons-lang3"                  % "3.4",
    "org.apache.commons"        %  "commons-text"                   % "1.4",
    "org.flywaydb"              %  "flyway-core"                    % "5.1.4",
    "org.json4s"                %% "json4s-ext"                     % "3.5.3",
    "org.json4s"                %% "json4s-jackson"                 % "3.5.3",
    "org.scalikejdbc"           %% "scalikejdbc"                    % scalikejdbcV,
    "org.scalikejdbc"           %% "scalikejdbc-config"             % scalikejdbcV,
    "org.scodec"                %% "scodec-bits"                    % scodecV,
    "org.slf4j"                 %  "slf4j-api"                      % "1.7.25",
    "co.fs2"                    %% "fs2-core"                       % "1.0.0",
    "com.github.pureconfig"     %% "pureconfig"                     % pureConfigV,
    "com.github.pureconfig"     %% "pureconfig-cats-effect"         % pureConfigV,
    "io.prometheus"             % "simpleclient_hotspot"            % prometheusV,
    "io.prometheus"             % "simpleclient_dropwizard"         % prometheusV,
    "io.prometheus"             % "simpleclient_common"             % prometheusV,
    "com.typesafe"              % "config"                          % configV,
    "org.typelevel"             %% "cats-effect"                    % catsEffectV,
    "com.47deg"                 %% "github4s"                       % "0.18.6",
    "com.comcast"               %% "ip4s-core"                      % ip4sV,
    "com.comcast"               %% "ip4s-cats"                      % ip4sV
  )

  lazy val coreDependencies = Seq(
    "org.typelevel"             %% "cats-effect"                    % catsEffectV,
    "com.typesafe"              %  "config"                         % configV,
    "joda-time"                 %  "joda-time"                      % "2.8.1",
    "org.scodec"                %% "scodec-bits"                    % scodecV,
    "nl.grons"                  %% "metrics-scala"                  % metricsScalaV,
    "org.apache.commons"        %  "commons-text"                   % "1.4",
    "com.github.pureconfig"     %% "pureconfig"                     % pureConfigV,
    "com.github.pureconfig"     %% "pureconfig-cats-effect"         % pureConfigV,
    "javax.xml.bind"            %  "jaxb-api"                       % jaxbV % "provided",
    "com.sun.xml.bind"          %  "jaxb-core"                      % jaxbV,
    "com.sun.xml.bind"          %  "jaxb-impl"                      % jaxbV,
    "ch.qos.logback"            %  "logback-classic"                % "1.0.7"
  )

  lazy val dynamoDBDependencies = Seq(
    "com.amazonaws"             %  "aws-java-sdk-core"              % awsV withSources(),
    "com.amazonaws"             %  "aws-java-sdk-dynamodb"          % awsV withSources()
  )

  lazy val mysqlDependencies = Seq(
    "org.flywaydb"              %  "flyway-core"                    % "5.1.4",
    "org.mariadb.jdbc"          %  "mariadb-java-client"            % "2.3.0",
    "org.scalikejdbc"           %% "scalikejdbc"                    % scalikejdbcV,
    "org.scalikejdbc"           %% "scalikejdbc-config"             % scalikejdbcV,
    "com.zaxxer"                %  "HikariCP"                       % "3.2.0"
  )

  lazy val sqsDependencies = Seq(
    "com.amazonaws"             %  "aws-java-sdk-core"              % awsV withSources(),
    "com.amazonaws"             %  "aws-java-sdk-sqs"               % awsV withSources()
  )

  lazy val commonTestDependencies = Seq(
    "org.scalatest"             %% "scalatest"                      % scalaTestV,
    "org.scalacheck"            %% "scalacheck"                     % "1.13.4",
    "com.ironcorelabs"          %% "cats-scalatest"                 % "2.3.1",
    "org.mockito"               %  "mockito-core"                   % "1.10.19"
  )

  lazy val apiTestDependencies = commonTestDependencies ++ Seq(
    "com.typesafe.akka"         %% "akka-http-testkit"              % akkaHttpV,
    "junit"                     %  "junit"                          % "4.12"
  )

  lazy val portalDependencies = Seq(
    "com.typesafe.play"         %% "play-json"                      % "2.6.10",
    "com.amazonaws"             %  "aws-java-sdk-core"              % awsV withSources(),
    "com.amazonaws"             %  "aws-java-sdk-dynamodb"          % awsV withSources(),
    "com.typesafe.play"         %% "play-jdbc"                      % playV,
    "com.typesafe.play"         %% "play-guice"                     % playV,
    "com.typesafe.play"         %% "play-ahc-ws"                    % playV,
    "com.typesafe.play"         %% "play-specs2"                    % playV % "test"
  )
}
