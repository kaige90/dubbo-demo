#!/bin/sh
mvn clean -U source:jar deploy -f client.pom.xml -Dmaven.test.skip=true
