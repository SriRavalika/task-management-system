Task Management System

A RESTful Task Management System built using Java, Spring Boot, Spring Security, and MySQL. This application allows users to manage tasks, register and log in securely, and access role-based endpoints.

Technologies Used

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST API
- Postman

Features

- Create, view, update, and delete tasks (CRUD)
- User registration and login
- Password encryption using BCrypt
- Role-based authorization (USER and ADMIN)
- Admin and User dashboard APIs
- Task input validation
- Duplicate email prevention
- Custom exception handling
- HTTP status code handling

Task Management APIs

Method| Endpoint| Description
POST| "/tasks"| Create a task
GET| "/tasks"| Get all tasks
PUT| "/tasks/{id}"| Update a task
DELETE| "/tasks/{id}"| Delete a task

User APIs

Method| Endpoint| Description
POST| "/users/register"| Register a new user
POST| "/users/login"| User login

Dashboard APIs

Method| Endpoint| Description
GET| "/admin/dashboard"| Admin dashboard
GET| "/user/dashboard"| User dashboard

Task Fields

- ID
- Title
- Description
- Priority (High, Medium, Low)
- Status (Pending, In Progress, Completed)
- Deadline

Security

- BCrypt password hashing
- Spring Security authentication
- Role-based authorization
- Protected API endpoints

Exception Handling

- 404 – Task Not Found
- 409 – Duplicate Email
- 400 – Validation Error

Database

MySQL database used for storing users and tasks.

How to Run

1. Clone the repository.
2. Configure MySQL credentials in "application.properties".
3. Create the database.
4. Run the application using Eclipse or Maven.
5. Test API endpoints using Postman.

Author

SriRavalika Panchakarlla