# Community WebApp - Social Discussion Platform

A modern community-driven web application for social discussions and content sharing, built with Java Spring Boot.

## Features

- User Authentication & Authorization (JWT)
- Create and manage communities
- Create, edit, and delete posts
- Comment on posts
- Upvote/Downvote system
- User profiles
- Email notifications

## Tech Stack

- **Backend**: Java 21, Spring Boot 3.2.0
- **Security**: Spring Security, JWT
- **Database**: MySQL (configurable)
- **ORM**: Spring Data JPA, Hibernate
- **Build Tool**: Gradle
- **Mail**: Spring Mail

## Prerequisites

- JDK 21 or higher
- MySQL 8.0 or higher
- Gradle 8.x (wrapper included)

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone <your-repo-url>
   cd community-webapp
   ```

2. **Configure Database**
   - Create a MySQL database named `community_webapp`
   ```sql
   CREATE DATABASE community_webapp;
   ```
   - Update `src/main/resources/application.properties` with your database credentials

3. **Configure JWT Secret**
   - Update the `jwt.secret` in `application.properties` with a secure secret key

4. **Configure Email (Optional)**
   - Update mail settings in `application.properties` if you want email notifications

5. **Build the project**
   ```bash
   ./gradlew build
   ```

6. **Run the application**
   ```bash
   ./gradlew bootRun
   ```
   Or simply run:
   ```bash
   run.bat
   ```

The application will start on `http://localhost:8080`

## Project Structure

```
community-webapp/
├── src/main/java/com/example/redditclone/
│   ├── config/         # Security and app configuration
│   ├── controller/     # REST API endpoints
│   ├── dto/            # Data Transfer Objects
│   ├── exception/      # Custom exceptions
│   ├── model/          # JPA entities
│   ├── repository/     # Database repositories
│   ├── security/       # JWT and authentication
│   └── service/        # Business logic
├── src/main/resources/
│   ├── application.properties  # Application configuration
│   └── static/         # HTML pages (signup, login, dashboard)
├── run.bat            # Build and run script
└── start.bat          # Quick start script
```

## API Endpoints

### Authentication
- `POST /api/auth/signup` - Register new user
- `POST /api/auth/login` - User login (returns JWT token)

### Communities (To be implemented)
- `GET /api/communities` - Get all communities
- `POST /api/communities` - Create community
- `GET /api/communities/{id}` - Get community by ID

### Posts (To be implemented)
- `GET /api/posts` - Get all posts
- `POST /api/posts` - Create new post
- `GET /api/posts/{id}` - Get post by ID
- `PUT /api/posts/{id}` - Update post
- `DELETE /api/posts/{id}` - Delete post

### Comments (To be implemented)
- `POST /api/comments` - Add comment
- `GET /api/posts/{postId}/comments` - Get comments for a post

### Votes (To be implemented)
- `POST /api/votes` - Vote on a post

## Pages

- **Signup**: `http://localhost:8080/signup.html`
- **Login**: `http://localhost:8080/login.html`
- **Dashboard**: `http://localhost:8080/dashboard.html`

## Contributing

Feel free to submit issues and pull requests.

## License

This project is open source and available under the MIT License.
