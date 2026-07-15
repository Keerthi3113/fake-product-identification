# 🛡️ Fake Product Identification System

## 📌 Overview

The **Fake Product Identification System** is a full-stack web application developed to help users identify whether a product is likely to be genuine or fake. The application allows users to manually enter product details or scan a QR code using their device camera. The entered information is sent to a Java Spring Boot backend, where validation rules are applied to determine whether the product is likely genuine or suspicious.

This project was developed as a **college hackathon mini project** to demonstrate the integration of frontend technologies with a Java backend.

---

# ✨ Features

- Product verification using product details
- QR Code scanning using device camera
- REST API using Spring Boot
- Responsive user interface
- Instant verification result
- Simple rule-based fake product detection
- Easy to understand project structure

---

# 🛠 Technologies Used

## Frontend

- HTML5
- CSS3
- JavaScript
- HTML5 QR Code Library

## Backend

- Java
- Spring Boot
- Maven
- REST API

## Tools

- Visual Studio Code
- IntelliJ IDEA / Spring Tool Suite
- Git
- GitHub
- Postman (API Testing)

---

# 📂 Project Structure

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
│   │   │   │           │      ProductController.java
│   │   │   │           ├── service
│   │   │   │           │      ProductService.java
│   │   │   │           ├── model
│   │   │   │           │      Product.java
│   │   │   │           └── BackendApplication.java
│   │   │   └── resources
│   │   │          application.properties
│   │   └── test
│   └── pom.xml
│
└── frontend
    ├── index.html
    ├── style.css
    └── script.js
```

---

# ⚙️ Installation

## Step 1

Clone the repository

```bash
git clone https://github.com/Keerthi3113/fake-product-identification.git
```

---

## Step 2

Open the project

```bash
cd fake-product-identification
```

---

## Step 3

Run the Spring Boot Backend

```bash
cd backend
mvn spring-boot:run
```

Backend will start at

```
http://localhost:8080
```

---

## Step 4

Run Frontend

Open

```
frontend/index.html
```

using **Live Server** in Visual Studio Code.

Frontend runs at

```
http://127.0.0.1:5500
```

---

# 🚀 How the System Works

### Manual Verification

1. Enter Product Name
2. Enter Brand Name
3. Enter Product Code
4. Enter Seller Name
5. Click **Verify Product**
6. Result is displayed

---

### QR Code Verification

1. Click **Start Scan**
2. Allow camera permission
3. Scan product QR code
4. Product code is filled automatically
5. Click **Verify Product**
6. Verification result is displayed

---

# 🔗 REST API

### Verify Product

**POST**

```
http://localhost:8080/verify
```

### Sample Request

```json
{
    "productName":"Nike Shoes",
    "brand":"Nike",
    "productCode":"NIKE123456",
    "seller":"Amazon"
}
```

### Sample Response

```
Likely Genuine Product
```

or

```
Warning: Possibly Fake Product
```

---

# 📷 Project Screenshots

You can add screenshots here after running the project.

Example:

```
screenshots/

Home Page

QR Scanner

Verification Result
```

---

# 🔮 Future Enhancements

- MySQL Database Integration
- Machine Learning based fake detection
- Blockchain product authentication
- Admin Dashboard
- User Login System
- Product History
- Mobile Application
- Barcode Scanner
- Email Notification

---

# 🎯 Applications

- E-Commerce Platforms
- Pharmaceutical Industry
- Electronics Industry
- Fashion Products
- FMCG Products
- Luxury Goods Authentication

---

# 👨‍💻 Developed By

**Guna Lalitha Keerthi Inavalli**

Bachelor of Technology (B.Tech)

---

# 📜 License

This project is developed for educational and learning purposes.

---

## ⭐ If you like this project, consider giving it a Star on GitHub.