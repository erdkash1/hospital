# Community Skill Exchange API

A RESTful API that connects people who want to share skills with those who want to learn them. No money involved — just community members helping each other for free.

## Live Demo

Base URL: `https://skill-exchange-production.up.railway.app`

## Tech Stack

- **Java 21**
- **Spring Boot 3.5**
- **Spring Security + JWT** for authentication
- **Spring Data JPA + Hibernate** for database access
- **PostgreSQL** for the database
- **Maven** for dependency management
- **Deployed on Railway**

## How It Works

1. Register as a MEMBER
2. Browse available skills by category
3. Post a skill offer — "I can teach Guitar"
4. Post a skill request — "I want to learn Guitar"
5. When matched, request status updates to MATCHED
6. Community members help each other for free

## Project Structure
```
src/main/java/com/iggy/skillexchange/
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
git clone https://github.com/erdkash1/Skill-Exchange.git
cd Skill-Exchange
```

2. Create a PostgreSQL database
```sql
CREATE DATABASE skillexchange_db;
```

3. Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/skillexchange_db
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
| POST | `/auth/register` | Register as a member | No |
| POST | `/auth/login` | Login and get JWT token | No |

### Skills
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/skills` | Browse all skills | Yes |
| GET | `/skills/{id}` | Get skill by ID | Yes |
| GET | `/skills/category/{category}` | Find skills by category | Yes |
| POST | `/skills` | Create a skill | Yes |
| DELETE | `/skills/{id}` | Delete a skill | Yes |

### Skill Offers
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/offers` | See all offers | Yes |
| GET | `/offers/{id}` | Get offer by ID | Yes |
| POST | `/offers` | Post a skill you can teach | Yes |
| DELETE | `/offers/{id}` | Remove your offer | Yes |

### Skill Requests
| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/requests` | See all requests | Yes |
| GET | `/requests/{id}` | Get request by ID | Yes |
| POST | `/requests` | Post a skill you want to learn | Yes |
| PATCH | `/requests/{id}/status` | Update status (OPEN/MATCHED/CLOSED) | Yes |
| DELETE | `/requests/{id}` | Remove your request | Yes |

## Example Requests

### Register
**POST** `https://skill-exchange-production.up.railway.app/auth/register`
```json
{
    "name": "John Doe",
    "email": "john@example.com",
    "password": "password123"
}
```

### Post a Skill Offer
**POST** `https://skill-exchange-production.up.railway.app/offers`
```json
{
    "skillId": 1,
    "description": "I can teach beginner guitar lessons online"
}
```

### Post a Skill Request
**POST** `https://skill-exchange-production.up.railway.app/requests`
```json
{
    "skillId": 1,
    "description": "Looking to learn basic guitar chords"
}
```

## Author

Erdenesuren Shirmen — Senior Computer Science Student
GitHub: [@erdkash1](https://github.com/erdkash1)
```