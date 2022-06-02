# together-parent

* Api-Gateway
* Profile-Service
* User-Service
* Service

# Command
* mvn clean package dockerfile:push 

# K8S's naming of services
`podname-{replica-index}.{service}.default.svc.cluster.local`