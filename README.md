# Hospital Management API

A secure, production-ready REST API for managing hospital operations built with Java Spring Boot. Features JWT authentication, role-based access control, and full CRUD operations for departments, doctors, patients, and appointments.

## Live URL
https://hospital-production-db4b.up.railway.app

## Tech Stack
- Java 21
- Spring Boot 3.5.11
- Spring Security + JWT Authentication
- Spring Data JPA + Hibernate
- PostgreSQL
- Maven
- Deployed on Railway

## Features
- JWT secured endpoints
- Role based access (PATIENT, DOCTOR, ADMIN)
- Department management
- Doctor profiles linked to departments
- Patient registration and management
- Appointment scheduling between patients and doctors

## API Endpoints

### Auth (public)
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /auth/register | Register a new user |
| POST | /auth/login | Login and receive JWT token |

### Departments (requires JWT)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /departments | Get all departments |
| GET | /departments/{id} | Get department by id |
| POST | /departments | Create a department |
| PUT | /departments/{id} | Update a department |
| DELETE | /departments/{id} | Delete a department |

### Doctors (requires JWT)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /doctors | Get all doctors |
| GET | /doctors/{id} | Get doctor by id |
| POST | /doctors | Create a doctor |
| PUT | /doctors/{id} | Update a doctor |
| DELETE | /doctors/{id} | Delete a doctor |

### Patients (requires JWT)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /patients | Get all patients |
| GET | /patients/{id} | Get patient by id |
| POST | /patients | Create a patient |
| PUT | /patients/{id} | Update a patient |
| DELETE | /patients/{id} | Delete a patient |

### Appointments (requires JWT)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /appointments | Get all appointments |
| GET | /appointments/{id} | Get appointment by id |
| POST | /appointments | Book an appointment |
| PUT | /appointments/{id} | Update an appointment |
| DELETE | /appointments/{id} | Cancel an appointment |

## How to Run Locally

### Prerequisites
- Java 21
- PostgreSQL
- Maven

### Setup
1. Clone the repository
```
   git clone https://github.com/erdkash1/hospital.git
```
2. Create a PostgreSQL database called `hospital_db`
3. Update `src/main/resources/application.properties`:
```
   spring.datasource.url=jdbc:postgresql://localhost:5432/hospital_db
   spring.datasource.username=postgres
   spring.datasource.password=yourpassword
```
4. Run the application:
```
   mvn spring-boot:run
```

## Authentication
All endpoints except `/auth/**` require a JWT token.

1. Register a user at `POST /auth/register`
2. Login at `POST /auth/login` to get your token
3. Add the token to your requests:
    - Header: `Authorization: Bearer your_token_here`
    - Or use Postman's Auth tab → Bearer Token

## Project Structure
```
src/main/java/com/iggy/hospital/
├── entity/         # Database models
├── repository/     # Data access layer
├── service/        # Business logic
├── controller/     # REST endpoints
└── security/       # JWT authentication
```