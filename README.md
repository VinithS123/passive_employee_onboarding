
# Employee Onboarding API
## Description
##### This sequence diagram shows how the Employee Onboarding API works for adding and retrieving employees. I used Swagger to generate the REST API structure and DTO classes automatically, and MapStruct to handle the conversion between DTOs and entities. I implemented two operations: POST to add a new employee and GET to fetch all employees. In the POST flow, employee data is received, converted, saved to the database, and the response is returned to the client. In the GET flow, all employee records are retrieved, converted back to DTOs, and sent to the client.

## UML Diagram
<img width="938" height="892" alt="Untitled" src="https://github.com/user-attachments/assets/9e7e0e65-9c62-4f24-8fc0-bdd6e7905dc8" />


## Technologies Used
* Java 21
* Spring Boot
* Maven
* Spring Data JPA
* Mapstruct
* Postman
* PostgreSQL
* Swagger for API Documentation

## Database Configuration 

```
spring.datasource.url=jdbc:postgresql://localhost:5432/{databasename}
spring.datasource.username=[username]
spring.datasource.password=[password]
spring.datasource.driver-class-name = org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
```

# API Endpoint
- POST http://localhost:8080/api/v1/employees
- GET http://localhost:8080/api/v1/employees

# Functionality

- Create: Add new employee into the database. Employee details are customerId, customerName, role, department and salary.
- Fetch Employee: get all employees from the database.

# Project Structure
```
src/main/java
  controller
  entity
  mapper
  repository
  service
src/main/resources
  application.properties
  swagger.yaml
```
