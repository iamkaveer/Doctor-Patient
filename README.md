# Doctor Patient
## Project Title: Doctor Patient Management System using Spring Boot
### Project Description: 
This project is a backend API implementation for a Doctor Patient Management System. It allows doctors to register their patients and provides functionality to suggest doctors based on patient symptoms. The system is built using the Spring Boot framework with Hibernate for database operations.

## Features

- Add doctors to the database
- Add patients and assign them to doctors
- Suggests doctor to the patients based on their location and symptoms


### Technology Stack:
1. Spring Boot: Java-based framework for building the application.
2. Spring MVC: Provides a Model-View-Controller architecture for managing web requests.
3. Hibernate/JPA: ORM (Object-Relational Mapping) framework for database interactions.
4. MySQL: Relational database management system for storing employee data.

## Installation

1. Clone the repository
2. Import the project into your preferred IDE (e.g., IntelliJ IDEA or Eclipse).
3. Configure the database connection in the application.properties file:
   spring.datasource.url=jdbc:mysql://localhost:3306/doctor_db;

   spring.datasource.username=your_username

   spring.datasource.password=your-password

4. Run the application.
5. Access the application in your web browser:
   http://localhost:8080

### Suggesting Doctors API
The system provides an API to suggest doctors based on a patient's symptom. This API accepts the patient ID and returns the suggested doctors based on the patient's location and symptom. The suggested doctor will have the specialty that matches the patient's symptom.
- Edge-Case 1: If there are no doctors available in the patient's location (outside Delhi, Noida, Faridabad), the response will be "We are still waiting to expand to your location."
- Edge-Case 2: If there are no doctors available for the patient's symptom in that location, the response will be "There isn't any doctor present at your location for your symptom."
