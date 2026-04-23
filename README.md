🚀 Project Management System – Backend
📌 Overview

A Spring Boot-based REST API for a full-featured Project Management System supporting authentication, project handling, issue tracking, comments, chat, and subscriptions.

The system uses JWT-based authentication and follows a modular layered architecture.

🧠 Architecture & Workflow
i) User logs in via frontend (React)
ii) Server validates credentials
iii) JWT token is generated and returned
iv) Token is stored in localStorage
v) All subsequent requests include JWT in headers
vi) Backend verifies token before processing requests

🛠️ Tech Stack
Backend
-> Java 17
-> Spring Boot
-> Spring Security
-> Spring Data JPA
-> JWT Authentication (jjwt)
Database
-> MySQL
Other Integrations
-> Razorpay (Payments)
-> Email Service (Spring Mail)
Build Tool
-> Maven

📂 Project Structure
src/main/java/com/pratyay/
│
├── config/              # Security & JWT configuration
├── controller/          # REST Controllers
├── model/               # Entity classes
├── repository/          # JPA Repositories
├── request/             # Request DTOs
├── response/            # Response DTOs
├── service/             # Business logic
│
└── ProjectmanagementsystemApplication.java

🔐 Authentication
-> JWT-based authentication
-> Secure endpoints using Spring Security
-> Token validation on every request

📡 API Endpoints
👤 User
-> POST /user_sign_up
-> POST /user_sign-in
-> GET /profile

📁 Project Service
-> POST /create_project
-> GET /get_project_by_id
-> GET /getprojects_by_userid
-> DELETE /delete_project_by_id
-> GET /search_project

🐞 Issue Service
-> POST /create_issue
-> GET /get_issue_project_id
-> PUT /update_issue_status
-> PUT /add_user_to_issue
-> DELETE /delete_by_issueid

💬 Chat
-> GET /get_chat_from_projectid
-> GET /get_messages_using_projectid
-> POST /send_message

📝 Comment Service
-> POST /add_comment
-> GET /get_all_comments
-> DELETE /delete_issue

🧪 API Testing
i) APIs tested using Postman
ii) Organized collections for:
    -> User
    -> Project
    -> Issue
    -> Chat
    -> Comment
    
⚙️ Setup & Installation:
1️⃣ Clone the Repository
git clone https://github.com/your-username/project-management-backend.git
cd project-management-backend

2️⃣ Configure Environment
Create application-dev.properties:
spring.datasource.url=YOUR_DB_URL
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD
jwt.secret=YOUR_SECRET_KEY

3️⃣ Run the Application
./mvnw spring-boot:run
OR in IntelliJ:
--spring.profiles.active=dev

4️⃣ Server Runs On
http://localhost:8080
🔑 Request Headers Example
Authorization: Bearer <your_jwt_token>

💳 Payment Integration
Integrated with Razorpay for subscription/payment features

📦 Dependencies Highlights
From pom.xml:
-> Spring Boot Starter Web
-> Spring Security
-> Spring Data JPA
-> JWT (jjwt)
-> MySQL Connector
-> Lombok
-> Razorpay SDK

🚀 Features
🔐 JWT Authentication & Authorization
📁 Project Management
🐞 Issue Tracking
💬 Real-time Chat (project-based)
📝 Comments System
💳 Payment Integration
📧 Email Support

📌 Future Improvements
-> WebSocket for real-time chat
-> Role-based access control (RBAC)
-> Docker deployment
-> API documentation (Swagger)

🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first.

📄 License
This project is licensed under the MIT License.

👨‍💻 Author
Pratyay
