# cuencadev
## verificar estado de salud del micro
mvn quarkus:add-extension -Dextension="quarkus-smallrye-health"
## micro esta vivo
curl http://localhost:8080/health/live
##   micro funcionado
curl http://localhost:8080/health/ready
## info de cpu, memora, etc de micro
curl --header "Accept:application/json" localhost:8080/metrics

./mvnw quarkus:add-extension -Dextensions="quarkus-smallrye-metrics"
## para compilar-correr
 ./mvnw compile quarkus:dev