#!/bin/sh

cd ../../../
cd services/substract-service

gradle wrapper
./gradlew :openApiGenerate --rerun-tasks
echo "Completed"
