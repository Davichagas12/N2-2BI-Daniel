# Agile Metodology Management Tool <img align="right" height="40" src="https://cdn.shortpixel.ai/client/q_glossy,ret_img,w_228,h_73/http://ftt.com.br/home/wp-content/uploads/2019/10/logo.png">

<!-- ABOUT THE PROJECT -->
## About The Project

Proposed by [Daniel Carvalho](https://github.com/danielscarvalho) in the Programming Language III subject at [Faculdade de Tecnologia Termomecanica](http://www.ftt.com.br/).
The objective of this project is to create a front-end with a JAVA api that has a connection to a database with more than four tables in the database (MySQL).
We decided to integrate the knowledge that, according to the curriculum of the Computer Engineering course at [Faculdade de Tecnologia Termomecanica](http://www.ftt.com.br/), we should have learned in the classes of Software Engineering. So we created a management tool for squad functions, being the task manager of agile methodologies.


### Built With
* [JAVA](https://https//www.java.com/)
* [MySQL](https://mysql.com/)
* [Maven](https://maven.apache.org/)
* [Spring]()
* [Vue.js]()

## Local development setup

### Database setup

- Create database `sad_task`
- Initialize database with scripts in `setup` folder

### Add dev properties file

- Create `src/main/resources/application-dev.properties` with the settings:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sad_task?useSSL=false
spring.datasource.username=<your username>
spring.datasource.password=<your password>
```

## Commands

- Use `mvn test` to run the tests of the back-end and the front-end
- Use `mvn spring-boot:run` to start the back-end
- Use `npm run serve` inside the `front-end` directory to start the front-end
- Use `mvn install` to build both the front-end and the back-end
- Use `java -jar target/app-0.0.1-SNAPSHOT.jar` to start the bundled application


## Authors

Lucas Araújo Veloso
<br>
Davi Oliveira Chagas Almeida
<br>
Renato Xavier Tavares
