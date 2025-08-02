# Online-Food-Delivery-Web-App
A full-stack web application for online food ordering built using **Spring Boot**, **React**, **JWT-based authentication**, and **MySQL**. Customers can browse menus, place orders, and track them, while restaurant owners can manage menus, view revenue, and handle orders.

## 🚀 Features

### 👤 Authentication
- User registration and login
- Role-based access: `ROLE_CUSTOMER`, `ROLE_RESTAURANT_OWNER`
- JWT token-based secure authentication
- Email verification and order confirmation via Spring Mail

### 🍽️ Customer Functionality
- Browse restaurant menus
- Add items to cart and place orders
- View order status and history

### 🍳 Restaurant Owner Functionality
- Manage food items (CRUD)
- View and manage incoming orders
- View total revenue and sales analytics

### 🌐 Tech Stack

| Frontend | Backend | Database | Other |
|----------|---------|----------|-------|
| React (with Redux, Axios, MUI, Tailwind CSS) | Spring Boot, Spring Security, Spring Data JPA, Spring Mail | MySQL | JWT, RESTful APIs |

---
    
## ⚙️ Setup Instructions

### 1. Clone the Repository
```
git clone https://github.com/your-username/food-delivery-app.git
cd food-delivery-app
```
### 2. Backend Setup (Spring Boot)
- Navigate to the backend folder:
```
cd backend
```
- Configure your database in application.properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/food_ordering_system?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=your password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
- Run the backend:
```
mvn spring-boot:run
```
### 3. Frontend Setup (React)
- Navigate to the frontend folder:
```
cd ../frontend
```
- Install dependencies and run the app:
```
npm install
npm start
```
