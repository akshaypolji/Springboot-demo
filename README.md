## Springboot Demo Application

This application uses Springboot for hosting a Java web application. 
It uses postgreSQL and JPA for managing repository. 

Compile project `./mvnw clean install`

Run Using `java -jar ./target/demo-0.0.1-SNAPSHOT.jar`

# Access the web app 
1. Greeting `http://localhost:8080/hello?name=Akshay`
2. Add a Student `curl -X POST -d "studentName=Akshay" http://localhost:8080/addStudent`
3. Get Student Details as `http://localhost:8080/getStudent?studentName=Ashwin`


# Dependencies 
Need a PostgreSQL running on localhost
