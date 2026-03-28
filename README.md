# Hospital Management API

A secure, production-ready REST API for managing hospital operations built with Java Spring Boot. Features JWT authentication, role-based access control, and full CRUD operations for departments, doctors, patients, and appointments.

## Live Demo

Base URL: `https://hospital-production-db4b.up.railway.app`

## Tech Stack

- **Java 21**
- **Spring Boot 3.5**
- **Spring Security + JWT** for authentication
- **Spring Data JPA + Hibernate** for database access
- **PostgreSQL** for the database
- **Maven** for dependency management
- **Deployed on Railway**

## Features

- User registration and login with JWT authentication
- Role-based access control (PATIENT, DOCTOR, ADMIN roles)
- Department management — create and organize hospital departments
- Doctor profiles linked to their departments
- Patient registration and management
- Appointment scheduling between patients and doctors
- Secure endpoints requiring authentication
- Proper error handling with meaningful HTTP status codes

## Project Structure
```
src/main/java/com/iggy/hospital/
├── controller/       # REST API endpoints
├── service/          # Business logic
├── repository/       # Database access
├── entity/           # JPA entities
├── security/         # JWT and Spring Security config
```

## Getting Started

### Prerequisites
- Java 21
- PostgreSQL
- Maven

### Setup

1. Clone the repository
```bash
git clone https://github.com/erdkash1/hospital.git
cd hospital
```

2. Create a PostgreSQL database
```sql
CREATE DATABASE hospital_db;
```

3. Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/hospital_db
spring.datasource.username=your_username
spring.datasource.password=your_password
jwt.secret=your_base64_encoded_secret
jwt.expiration=86400000
```

4. Run the application
```bash
./mvnw spring-boot:run
```

The API will start on `http://localhost:8080`

## Authentication

This API uses JWT authentication. To access protected endpoints:

1. Register or login to get a token
2. Add the token to the `Authorization` header of every request:
```
Authorization: Bearer your_token_here
```

## API Endpoints

### Auth
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| POST | `/auth/register` | Register a new user | No |
| POST | `/auth/login` | Login and get JWT token | No |

### Departments
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/departments` | Get all departments | Yes |
| GET | `/departments/{id}` | Get department by ID | Yes |
| POST | `/departments` | Create a department | Admin only |
| PUT | `/departments/{id}` | Update a department | Admin only |
| DELETE | `/departments/{id}` | Delete a department | Admin only |

### Doctors
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/doctors` | Get all doctors | Yes |
| GET | `/doctors/{id}` | Get doctor by ID | Yes |
| POST | `/doctors` | Add a doctor | Admin only |
| PUT | `/doctors/{id}` | Update a doctor | Admin only |
| DELETE | `/doctors/{id}` | Delete a doctor | Admin only |

### Patients
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/patients` | Get all patients | Yes |
| GET | `/patients/{id}` | Get patient by ID | Yes |
| POST | `/patients` | Register a patient | Yes |
| PUT | `/patients/{id}` | Update a patient | Yes |
| DELETE | `/patients/{id}` | Delete a patient | Admin only |

### Appointments
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/appointments` | Get all appointments | Yes |
| GET | `/appointments/{id}` | Get appointment by ID | Yes |
| POST | `/appointments` | Book an appointment | Yes |
| PUT | `/appointments/{id}` | Update an appointment | Yes |
| DELETE | `/appointments/{id}` | Cancel an appointment | Yes |

## Example Requests

### Register
**POST** `https://hospital-production-db4b.up.railway.app/auth/register`
```json
{
    "name": "John Doe",
    "email": "john@example.com",
    "password": "password123",
    "role": "PATIENT"
}
```

### Book an Appointment
**POST** `https://hospital-production-db4b.up.railway.app/appointments`
```json
{
    "doctorId": 1,
    "patientId": 1,
    "appointmentDate": "2026-04-01T10:00:00",
    "reason": "General checkup"
}
```

## Author

Erdenesuren Shirmen — Senior Computer Science Student
GitHub: [@erdkash1](https://github.com/erdkash1)
```

