# Thomes-Travels-java

## 📌 Problem Statement
Thomas Travels wants to automate their customer travel service process.
Each driver has the following details:
- Driver ID
- Driver Name
- Category (Auto / Car / Lorry)
- Total Distance Travelled

This project is developed using Java and follows Object-Oriented Programming principles.

---

## 🛠️ Technologies Used
- Java
- Eclipse IDE
- OOP Concepts
- Arrays & ArrayList
- GitHub

---

## 📂 Package Structure
All Java classes are created inside the `com` package.

---

## 📄 Classes Description

### 1️⃣ Driver.java
Represents a driver with:
- driverId
- driverName
- category
- totalDistance  
Includes constructors, getters, and setters.

---

### 2️⃣ Travels.java
Contains business logic methods:

- `isCarDriver(Driver[])`  
  → Checks whether at least one driver belongs to **Car** category.

- `retrivebyDriverId(Driver[], int)`  
  → Searches driver by ID and returns formatted details.

- `retriveCountOfDriver(Driver[], String)`  
  → Returns count of drivers based on category.

- `retriveDriver(Driver[], String)`  
  → Returns all drivers belonging to a given category.

- `RetriveMaximumDistanceTravelledDriver(Driver[])`  
  → Returns the driver who travelled maximum distance.

---

### 3️⃣ TestDriver.java
Tester class with `main()` method.
Creates Driver objects and tests all methods in `Travels` class.

---

## ▶️ Sample Output
true
Driver name is Raju belonging to the category auto traveled 90.09 KM so far.
1
Balu
Max Distance Driver: Kamyar (95.0 KM)

---

## ✅ Key Learning Outcomes
- Java OOP implementation
- Array handling
- Searching & filtering logic
- Method design
- Clean project structure

---

## 👤 Author
**Anjana Devi Adina**  
B.Tech – Computer Science (2025)  
Java Developer (Fresher)
