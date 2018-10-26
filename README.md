# springboot-microservices-starter

	- ZUUL for Proxy/API gateway
	- EUREKA for Load balancing
	- KEYCLOACK for Identity and Access Management

- ZUUL Server (http://localhost:8762)
	-- startup - mvn install && mvn spring-boot:run
- EUREKA Server (http://localhost:8761) 
	-- startup - mvn install && mvn spring-boot:run
- KEYCLOACK Server (http://localhost:8180)
    -- startup - .\standalone.bat -Djboss.socket.binding.port-offset=100
- API (http://localhost:8080)
	-- startup - mvn install && mvn spring-boot:run
	
- Upload or create Keyclock realm using zuul-server/config/quickstart-realm.json	
	
- Authenticate and get your API token.

	POST /auth/realms/spring-boot-quickstart/protocol/openid-connect/token HTTP/1.1
	Host: localhost
	Authorization: Basic YXBwLWF1dGh6LXJlc3Qtc3ByaW5nYm9vdDpzZWNyZXQ=
	Content-Type: application/x-www-form-urlencoded
	cache-control: no-cache
	Postman-Token: 6c331f76-0485-4f34-ac86-82df9a3485f1
	username=alicepassword=alicegrant_type=password
	
- Access microservice using JWT.

	GET /api/v1/resourceb HTTP/1.1
	Host: localhost
	Authorization: Bearer <JSON Web Token>
	cache-control: no-cache
	Postman-Token: 52b7a4a5-5b42-41e9-a81e-2f3007c92e9a