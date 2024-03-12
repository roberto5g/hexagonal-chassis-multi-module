#!/bin/bash

mvn clean package

VERSION=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout | tr -d '\r')

sed "s/\${JAR_VERSION}/$VERSION/g" docker-compose.yml | docker-compose -f - up -d --build
