#!bin/bash
cd eurekaServer
./mvnw clean install
cd ..
cd client
./mvnw clean install
cd ..
cd reports
./mvnw clean install
cd ..
cd integration
./mvnw clean install
