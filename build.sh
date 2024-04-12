#!/bin/bash
mvn clean package

VERSION=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout | tr -d '\r')

docker-compose down
docker system prune -f
docker stop $(docker ps -aq) && docker rm $(docker ps -aq)

sed "s/\${JAR_VERSION}/$VERSION/g" docker-compose.yml | docker-compose -f - up -d --build
