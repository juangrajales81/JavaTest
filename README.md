# JavaTest
Java Test for Creative Works

How to use:


1. Rigth click on the project, Run as -> Spring Boot App

2. Use on Postman the following endpoints:


a) Create a single record
METHOD: POST 
URL: localhost:8080/api/projects
BODY:
{
    "projectName":"example 1",
    "clientName":"Joe"
    
}


b)Return ALL records

METHOD: GET
URL: localhost:8080/api/projects


c) Return a single record

METHOD: GET 
URL: localhost:8080/api/projects/1


d) Update a record
METHOD: PUT 
URL: localhost:8080/api/projects/1
BODY:
{
    "deliveryDate": "2020-08-17",
    "isFinished": true
}


e) Delete a record

METHOD: DELETE 
URL: localhost:8080/api/projects/1

