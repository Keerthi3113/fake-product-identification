# 🛡️ Fake Product Identification System

## 📌 Overview

The **Fake Product Identification System** is a full-stack web application developed using **Spring Boot, Java, HTML, CSS, and JavaScript**. It helps users verify whether a product appears genuine by validating the product details entered manually or obtained by scanning a QR code.

The system provides a clean and interactive user interface with a verification report, making it suitable as an academic mini project.

---
## 🚀 Live Demo
🔗 https://keerthi3113.github.io/fake-product-identification/

---
## ✨ Features

- Product verification using product details
- QR Code scanning using the device camera
- Verification report displayed in a separate panel
- Responsive and modern user interface
- REST API using Spring Boot
- Rule-based product validation
- Easy-to-understand project structure
- Fast verification results

---

## 🛠️ Technologies Used

### Frontend

- HTML5
- CSS3
- JavaScript
- HTML5 QR Code Library

### Backend

- Java
- Spring Boot
- Maven
- REST API

### Tools

- Visual Studio Code
- IntelliJ IDEA / Spring Tool Suite
- Git
- GitHub
- Postman

---

## 📂 Project Structure

```
FakeProductIdentification
│
├── backend
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── fakeproduct
│   │   │   │           ├── controller
│   │   │   │           │   └── ProductController.java
│   │   │   │           ├── model
│   │   │   │           │   └── Product.java
│   │   │   │           ├── service
│   │   │   │           │   └── ProductService.java
│   │   │   │           └── BackendApplication.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   └── pom.xml
│
├── frontend
│   ├── index.html
│   ├── style.css
│   └── script.js
│
└── README.md
```

---

## 🚀 How to Run

### Clone the repository

```bash
git clone https://github.com/Keerthi3113/fake-product-identification.git
```

### Navigate to the backend folder

```bash
cd FakeProductIdentification/backend
```

### Run the Spring Boot application

```bash
mvn spring-boot:run
```

The backend will start at:

```
http://localhost:8080
```

### Open the frontend

Open:

```
frontend/index.html
```

using **Live Server** in Visual Studio Code.

---

## 📖 How to Use

1. Enter the product details.
2. Or scan the product QR code.
3. Click **Verify Product**.
4. The verification report will appear on the right side.
5. The system displays whether the product appears genuine based on validation rules.

---

## 🔮 Future Enhancements

- Database integration (MySQL)
- Barcode verification
- AI/ML-based fake product detection
- Manufacturer API integration
- User authentication
- Product history tracking
- Image recognition for products

---

## 👩‍💻 Developed By

**Inavalli Guna Lalitha Keerthi**

Mini Project – Fake Product Identification System
