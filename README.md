# java-api-docker
This is an example project how to dockerize the java API project





mvn clean install -DskipTests=true

cd docker 

docker build -t java-api . 

kubectl apply -f pod.yaml

kubectl apply -f service.yaml

http://localhost:8080/echo/anymessagehere

http://localhost:8080/api/v1/version/k8s



https://stackoverflow.com/questions/51593129/how-to-get-current-pod-in-kubernetes-java-application

https://stackoverflow.com/questions/68204687/get-k8s-namespace-inside-spring-boot-application

https://medium.com/@talipkorkmaz/kubernetes-downwardapivolumefile-spring-boot-4aa758f910a4

