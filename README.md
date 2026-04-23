# 🚀 Project Management System – Backend

## 📌 Overview

A **Spring Boot-based REST API** for a full-featured **Project Management System** supporting:

* Authentication
* Project handling
* Issue tracking
* Comments
* Chat
* Subscriptions

The system uses **JWT-based authentication** and follows a **modular layered architecture**.

---

## 🧠 Architecture & Workflow

1. User logs in via frontend (React)
2. Server validates credentials
3. JWT token is generated and returned
4. Token is stored in localStorage
5. All subsequent requests include JWT in headers
6. Backend verifies token before processing requests

---

## 🛠️ Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA
* JWT (jjwt)

### Database

* MySQL

### Other Integrations

* Razorpay (Payments)
* Email Service (Spring Mail)

### Build Tool

* Maven

---

## 📂 Project Structure

```
src/main/java/com/pratyay/
│
├── config/        # Security & JWT configuration
├── controller/    # REST Controllers
├── model/         # Entity classes
├── repository/    # JPA Repositories
├── request/       # Request DTOs
├── response/      # Response DTOs
├── service/       # Business logic
│
└── ProjectmanagementsystemApplication.java
```

---

## 🔐 Authentication

* JWT-based authentication
* Secured endpoints using Spring Security
* Token validation on every request

---

## 📡 API Endpoints

### 👤 User

* `POST /user_sign_up`
* `POST /user_sign-in`
* `GET /profile`

### 📁 Project Service

* `POST /create_project`
* `GET /get_project_by_id`
* `GET /getprojects_by_userid`
* `DELETE /delete_project_by_id`
* `GET /search_project`

### 🐞 Issue Service

* `POST /create_issue`
* `GET /get_issue_project_id`
* `PUT /update_issue_status`
* `PUT /add_user_to_issue`
* `DELETE /delete_by_issueid`

### 💬 Chat

* `GET /get_chat_from_projectid`
* `GET /get_messages_using_projectid`
* `POST /send_message`

### 📝 Comment Service

* `POST /add_comment`
* `GET /get_all_comments`
* `DELETE /delete_issue`

---

## 🧪 API Testing

* Tested using **Postman**
* Organized collections for:

  * User
  * Project
  * Issue
  * Chat
  * Comment

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/project-management-backend.git
cd project-management-backend
```

### 2️⃣ Configure Environment

Create `application-dev.properties`:

```properties
spring.datasource.url=YOUR_DB_URL
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD
jwt.secret=YOUR_SECRET_KEY
```

### 3️⃣ Run the Application

```bash
./mvnw spring-boot:run
```

OR (IntelliJ):

```
--spring.profiles.active=dev
```

### 4️⃣ Server Runs On

```
http://localhost:8080
```

---

## 🔑 Request Header Example

```
Authorization: Bearer <your_jwt_token>
```

---

## 💳 Payment Integration

* Integrated with **Razorpay**

---

## 📦 Dependencies Highlights

* Spring Boot Starter Web
* Spring Security
* Spring Data JPA
* JWT (jjwt)
* MySQL Connector
* Lombok
* Razorpay SDK

---

## 🚀 Features

* 🔐 JWT Authentication & Authorization
* 📁 Project Management
* 🐞 Issue Tracking
* 💬 Project-based Chat
* 📝 Comments System
* 💳 Payment Integration
* 📧 Email Support

---

## 📌 Future Improvements

* WebSocket for real-time chat
* Role-based access control (RBAC)
* Docker deployment
* Swagger API documentation

---

## 🤝 Contributing

Pull requests are welcome. For major changes, open an issue first.

---

## 📄 License

MIT License

---

## 👨‍💻 Author

**Pratyay**
