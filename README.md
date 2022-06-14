[![SpringBoot CI/CD Pipeline](https://github.com/yky32/together-parent/actions/workflows/workflow.yml/badge.svg?branch=main)](https://github.com/yky32/together-parent/actions/workflows/workflow.yml)

# together-parent

* Api-Gateway
* Profile-Service
* User-Service
* Service-Registry

# Command
* mvn clean package dockerfile:push 

# K8S's naming of services
`podname-{replica-index}.{service}.default.svc.cluster.local`
