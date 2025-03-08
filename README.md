# Real Estate CRUD System
## Objective
The objective of this project is to develop a simple CRUD (Create, Read, Update, Delete) system for managing real estate properties. The goal is to build a basic web application that allows users to perform the following operations on property listings:

* Create new property listings.

* Read or view a list of all properties and individual property details.

* Update existing property details.

* Delete property listings.

## Requirements
### Frontend (HTML + JavaScript)
* Create a simple user interface with forms to capture property information (e.g., address, price, size, description).

* Display a list of all properties with options to view, update, and delete each one.

* Implement client-side validation (e.g., required fields, valid data types).

* Use AJAX or Fetch API to communicate with the backend REST services.

### Backend (Spring Boot REST API)
* Develop RESTful endpoints for each CRUD operation:

* POST to create a new property.

* GET to retrieve all properties or a single property by ID.

* PUT to update an existing property.

* DELETE to remove a property by ID.

### Ensure that each property has the following attributes:

* Property ID (generated automatically)

* Address

* Price

* Size

* Description

### Database (MySQL)
* Create a properties table with columns for ID, address, price, size, and description.

* Use JPA/Hibernate to map the property objects to the database.

* Implement data persistence for all CRUD operations.

### Deployment
* The backend services and the database should be deployed in separate servers in AWS.

## Project Structure
```
CrudSystem/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── eci/
│   │   │       └── arep/
│   │   │           └── crud/
│   │   │               └── CrudSystem/
│   │   │                   ├── controller/
│   │   │                   │   └── PropertyController.java
│   │   │                   ├── model/
│   │   │                   │   └── Property.java
│   │   │                   ├── repository/
│   │   │                   │   └── PropertyRepository.java
│   │   │                   └── CrudSystemApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── index.html
│   │       │   └── styles.css
│   │       ├── application.properties
│   │       └── config.properties
│   └── test/
│       └── java/
│           └── eci/
│               └── arep/
│                   └── crud/
│                       └── CrudSystem/
│                           └── CrudSystemApplicationTests.java
├── target/
├── pom.xml
└── README.md
```
## Getting Started
### Prerequisites
* Java Development Kit (JDK) 11 or higher

* Maven

* MySQL

* AWS account (for deployment)

## Installation
1. **Clone the Repository**
   ```bash
   git clone https://github.com/Sana1610/Arep-05.git
   ```

2. **Navigate to the Project Directory**
   ```bash
   cd Arep-05/
   ```

3. **Install Dependencies**
   * Ensure you have Java and Maven installed.
   * Build the project with Maven:
   ```bash
   mvn clean install
   ```

4. **Configure the Database**
   * Update `src/main/resources/application.properties` with your MySQL database credentials and connection details.

5. **Run the Application**
   ```bash
   java -jar target/CrudSystem-0.0.1-SNAPSHOT.jar
   ```

6. **Access the Application**
   * Open your web browser and navigate to:
   ```
   http://ec2-52-91-53-35.compute-1.amazonaws.com:8080
   ```

## Deployment to AWS
### Deploy the MySQL database

* Launch an EC2 instance and install MySQL.

* Configure the security group to allow traffic on port 3306.

* Update the application.properties file with the new database URL and credentials.

### Deploy the Spring Boot application

* Launch another EC2 instance and install Java.

* Verify Java version.

  ``` bash
  java --version
  ```

* Copy the .jar file to the instance.

* Run the application:

  ``` bash
  java -jar CrudSystem-0.0.1-SNAPSHOT.jar
  ```

### Acknowledgments
* Spring Boot

* MySQL

* AWS

* HTML/JavaScript

### Deployment Video

https://github.com/user-attachments/assets/82b517ad-ee35-4e6d-b5da-fce0b2cab73f

## License

This project is licensed under the MIT License.

## Contact

For any questions or further information, feel free to reach out:

Santiago Alberto Naranjo Abril
Email: santiresox@hotmail.com



