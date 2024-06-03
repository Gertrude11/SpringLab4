# Spring Configuration,profiles and Spring boot web development

This is a demonstration of configuring a Spring Boot application, managing profiles, and implementing RESTful APIs.

## Configuration
1. Properties Files
The application's configuration is managed using properties files:

- application.properties: Contains general application configurations.
- application-dev.properties: Contains configurations specific to the development environment.

## RESTful API
The application exposes a RESTful API to manage employees:

### 1. Get All Employees
URL: GET /api/employees
Description: Retrieves a list of all employeess.
Response: JSON array containing employees objects.
### 2. Get Employee by ID
URL: GET /api/employees/{id}
Description: Retrieves a employee by its ID.
Response: JSON object representing the employee.
### 3. Create Employee
URL: POST /api/employees
Description: Creates a new employee.
Request Body: JSON object representing the new employee.
Response: JSON object representing the created employee.
### 4. Update Employee
URL: PUT /api/employees
Description: Updates an existing employee.
Request Body: JSON object representing the updated employee.
Response: JSON object representing the updated employee.
### 5. Delete Employee
URL: DELETE /api/employees/{id}
Description: Deletes a employee by its ID.
Response: No content.
## Running the Application
To run the application locally:

- Clone this repository.
- Configure the application properties as needed for your environment.
- Set the active profile (dev ) based on your environment.
- Build and run the application using Maven or your preferred IDE.
- Test the RESTful API endpoints using a tool like Postman.
