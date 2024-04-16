#!/bin/bash

#sh build.sh

docker-compose down
docker system prune -f

docker-compose up