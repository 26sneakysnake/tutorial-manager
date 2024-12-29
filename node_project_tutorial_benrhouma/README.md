Tutorial Manager - Web Project

Repository Information
GitHub Repository URL: [https://github.com/26sneakysnake/tutorial-manager]

Team Members:
Name: Seifeddine BEN RHOUMA | GitHub: @26sneakysnake

Project Overview
The Tutorial Manager project is a full-stack web application developed using Angular for the frontend and Spring Boot for the backend. The application is integrated with a PostgreSQL relational database and implements CRUD operations for managing tutorials.

Key Features
Frontend:

Angular with strict TypeScript typing.
Implements pages with Bootstrap.

Features include:
Listing tutorials.
Adding, updating, and deleting tutorials.
Filtering tutorials by title.
Advanced feature: ag-Grid for tutorial management and HighCharts for visualizing tutorial data.


Backend:

Built with Spring Boot.
RESTful API exposed with Swagger OpenAPI.
Includes CRUD endpoints (Create, Read, Update, Delete).
Connected to a PostgreSQL database.


Database:

Relational database managed with PostgreSQL.
Pre-loaded mock data for easy demonstration.


Work Contributions
Seifeddine BEN RHOUMA (100%) :
Backend development: Implemented the Spring Boot API and Swagger documentation.
Database design and integration with PostgreSQL.
Frontend development: Created Angular components for tutorial management and added advanced features like ag-Grid.
Integrated HighCharts for data visualization.
Configured project structure, added .gitignore for both frontend and backend.
Assisted in connecting frontend with backend APIs.


Project Structure
The repository is organized into two main directories:

Frontend:
Folder: frontend
Developed using Angular.
Command to run:
cd frontend
npm install
ng serve


Backend:
Folder: backend
Developed using Spring Boot.
Command to run:
cd backend
mvn spring-boot:run


API Endpoints
The backend API is accessible at http://localhost:8080/api/. The following endpoints are exposed:

GET /api/tutorials - Retrieve all tutorials.
POST /api/tutorials - Add a new tutorial.
PUT /api/tutorials/{id} - Update a tutorial by ID.
DELETE /api/tutorials/{id} - Delete a tutorial by ID.
GET /api/tutorials/status/{status} - Filter tutorials by status.
API documentation is available via Swagger at: http://localhost:8080/swagger-ui/index.html

Frontend Screenshots
1. ![image](https://github.com/user-attachments/assets/774d68b0-a0cc-4798-87bc-fec5c3bd39f2)
2. ![image](https://github.com/user-attachments/assets/0c067100-431f-4e7d-95b2-bd35f8dea6fc)
3. ![image](https://github.com/user-attachments/assets/b496b307-c90a-4158-b64d-205ec32ff05a)



Setup Instructions
Prerequisites
PostgreSQL:

Create a database named database_web.
Run the following SQL script to create the table:
sql
Copier le code
CREATE TABLE tutorials (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    status BOOLEAN
);
Update the credentials in application.properties (backend):

spring.datasource.url=jdbc:postgresql://localhost:5432/database_web
spring.datasource.username=postgres
spring.datasource.password=your_password


Node.js & npm:

Install Node.js and npm for the Angular frontend.
Java & Maven:

Install Java 11+ and Apache Maven for the Spring Boot backend.
How to Run the Project
Clone the repository:



git clone [https://github.com/26sneakysnake/tutorial-manager.git]
cd node_project_tutorial_benrhouma

Start the backend:


cd backend
mvn spring-boot:run
Start the frontend:


cd frontend
npm install
ng serve

Access the application:

Frontend: http://localhost:4200
Backend API: http://localhost:8080/api/
Swagger API Docs: http://localhost:8080/swagger-ui/index.html


Acknowledgements
Bootstrap: Used for responsive UI design.
Swagger: Used for documenting RESTful APIs.
Angular CLI: Simplified frontend development.
Spring Boot: Enabled fast backend development.

Sources
Project structure inspiration: BezKoder tutorials
Open-source tools and frameworks as listed in LICENSES.txt.
