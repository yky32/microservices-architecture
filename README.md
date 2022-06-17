# Microservices

* Api-Gateway
* Profile-Service
* User-Service
* Service-Registry

# Command
* mvn clean package dockerfile:push 

# K8S's naming of services
`httpL://podname-{replica-index}.{service}.default.svc.cluster.local` <br>
`http://eureka-0.eureka.default.svc.cluster.local:8761/eureka`

# OpenAPI - Swagger 
https://springdoc.org/
