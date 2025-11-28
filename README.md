# Reddit Clone - Community Web Application

A community-driven web application similar to Reddit, built with Java Spring Boot.

## Features

- User Authentication & Authorization (JWT)
- Create and manage subreddits (communities)
- Create, edit, and delete posts
- Comment on posts
- Upvote/Downvote system
- User profiles
- Email notifications

## Tech Stack

- **Backend**: Java 17, Spring Boot 3.2.0
- **Security**: Spring Security, JWT
- **Database**: MySQL (configurable)
- **ORM**: Spring Data JPA, Hibernate
- **Build Tool**: Gradle
- **Mail**: Spring Mail

## Prerequisites

- JDK 17 or higher
- MySQL 8.0 or higher
- Gradle 8.x (wrapper included)

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone <your-repo-url>
   cd reddit-clone
   ```

2. **Configure Database**
   - Create a MySQL database named `reddit_db`
   ```sql
   CREATE DATABASE reddit_db;
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

The application will start on `http://localhost:8080`

## Project Structure

```
reddit-clone/
├── src/main/java/com/example/redditclone/
│   ├── config/         # Security and app configuration
│   ├── controller/     # REST API endpoints
│   ├── dto/            # Data Transfer Objects
│   ├── exception/      # Custom exceptions
│   ├── model/          # JPA entities
│   ├── repository/     # Database repositories
│   ├── security/       # JWT and authentication
│   └── service/        # Business logic
└── src/main/resources/
    └── application.properties  # Application configuration
```

## API Endpoints (To be implemented)

### Authentication
- `POST /api/auth/signup` - Register new user
- `POST /api/auth/login` - User login

### Subreddits
- `GET /api/subreddits` - Get all subreddits
- `POST /api/subreddits` - Create subreddit
- `GET /api/subreddits/{id}` - Get subreddit by ID

### Posts
- `GET /api/posts` - Get all posts
- `POST /api/posts` - Create new post
- `GET /api/posts/{id}` - Get post by ID
- `PUT /api/posts/{id}` - Update post
- `DELETE /api/posts/{id}` - Delete post

### Comments
- `POST /api/comments` - Add comment
- `GET /api/posts/{postId}/comments` - Get comments for a post

### Votes
- `POST /api/votes` - Vote on a post

## Contributing

Feel free to submit issues and pull requests.

## License

This project is open source and available under the MIT License.
