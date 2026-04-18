Tokens expire after **24 hours** and must be refreshed by logging in again.

---

## API Reference

### Authentication Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|:---:|
| POST | `/auth/register` | Register a new user account | ❌ |
| POST | `/auth/login` | Login and receive JWT token | ❌ |

### Department Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|:---:|
| GET | `/departments` | Retrieve all departments | ✅ |
| GET | `/departments/{id}` | Retrieve department by ID | ✅ |
| POST | `/departments` | Create a new department | 🔒 Admin |
| PUT | `/departments/{id}` | Update a department | 🔒 Admin |
| DELETE | `/departments/{id}` | Delete a department | 🔒 Admin |

### Doctor Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|:---:|
| GET | `/doctors` | Retrieve all doctors | ✅ |
| GET | `/doctors/{id}` | Retrieve doctor by ID | ✅ |
| POST | `/doctors` | Add a new doctor | 🔒 Admin |
| PUT | `/doctors/{id}` | Update a doctor profile | 🔒 Admin |
| DELETE | `/doctors/{id}` | Remove a doctor | 🔒 Admin |

### Patient Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|:---:|
| GET | `/patients` | Retrieve all patients | ✅ |
| GET | `/patients/{id}` | Retrieve patient by ID | ✅ |
| POST | `/patients` | Register a new patient | ✅ |
| PUT | `/patients/{id}` | Update patient record | ✅ |
| DELETE | `/patients/{id}` | Remove a patient | 🔒 Admin |

### Appointment Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|:---:|
| GET | `/appointments` | Retrieve all appointments | ✅ |
| GET | `/appointments/{id}` | Retrieve appointment by ID | ✅ |
| POST | `/appointments` | Book a new appointment | ✅ |
| PUT | `/appointments/{id}` | Update an appointment | ✅ |
| DELETE | `/appointments/{id}` | Cancel an appointment | ✅ |

---

## Example Requests

### Register a New User
```http
POST https://hospital-production-db4b.up.railway.app/auth/register
Content-Type: application/json

{
    "name": "John Doe",
    "email": "john@example.com",
    "password": "password123",
    "role": "PATIENT"
}
```

**Response:**
```json
{
    "token": "eyJhbGciOiJIUzM4NCJ9..."
}
```

### Book an Appointment
```http
POST https://hospital-production-db4b.up.railway.app/appointments
Authorization: Bearer your_token_here
Content-Type: application/json

{
    "doctorId": 1,
    "patientId": 1,
    "appointmentDate": "2026-04-01T10:00:00",
    "reason": "General checkup"
}
```

---

## Error Handling

| HTTP Status | Meaning |
|---|---|
| 200 OK | Request successful |
| 201 Created | Resource created successfully |
| 400 Bad Request | Invalid input or business rule violation |
| 401 Unauthorized | Missing or invalid JWT token |
| 403 Forbidden | Insufficient role permissions |
| 404 Not Found | Requested resource does not exist |
| 500 Internal Server Error | Unexpected server error |

---

## Author

**Erdenesuren Shirmen**
Senior Computer Science Student — Missouri State University (Graduating July 2026)

[![GitHub](https://img.shields.io/badge/GitHub-erdkash1-black)](https://github.com/erdkash1)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Erdenesuren%20Shirmen-blue)](https://linkedin.com/in/erdenesuren-shirmen-0912b425b)