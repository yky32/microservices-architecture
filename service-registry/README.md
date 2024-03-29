
## HA Service Registry

```javascript
spring:
  profiles: default
server:
  port: 9000
eureka:
  instance:
    hostname: default-eureka-server.com
  client:
    registerWithEureka: false
    fetchRegistry: false
    defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/

---

spring:
  profiles: eureka-1
  application:
    name: eureka-server-clustered
server:
  port: 9001
eureka:
  instance:
    hostname: eureka-1-server.com
  client:
    registerWithEureka: true
    fetchRegistry: true
    serviceUrl:
      defaultZone: http://eureka-2-server.com:9002/eureka/,http://eureka-3-server.com:9003/eureka/

---
spring:
  profiles: eureka-2
  application:
    name: eureka-server-clustered
server:
  port: 9002
eureka:
  instance:
    hostname: eureka-2-server.com
  client:
    registerWithEureka: true
    fetchRegistry: true
    serviceUrl:
      defaultZone: http://eureka-1-server.com:9001/eureka/,http://eureka-3-server.com:9003/eureka/

---
spring:
  profiles: eureka-3
  application:
    name: eureka-server-clustered
server:
  port: 9003
eureka:
  instance:
    hostname: eureka-3-server.com
  client:
    registerWithEureka: true
    fetchRegistry: true
    serviceUrl:
      defaultZone: http://eureka-1-server.com:9001/eureka/,http://eureka-2-server.com:9002/eureka/
```