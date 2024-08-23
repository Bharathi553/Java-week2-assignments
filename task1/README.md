# Java Week 2 Assignments

## Project Overview

This project is a Java-based Inventory Management System using Spring Boot, Spring Data JPA, and MySQL.
The application provides RESTful APIs to manage items in an inventory, including CRUD operations.

## Setup Instructions

### Prerequisites

- JDK 17 or higher
- Maven
- MySQL Database
- IntelliJ IDEA

### Dependencies

We have to ensure the following dependencies are included in the `pom.xml` :

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- MySQL Connector/J

### Configuration

1. **Database Configuration:**

   Update the `application.properties` file `src/main/resources` with the database details:

   spring.datasource.url=jdbc:mysql://localhost:3306/inventory_management
   spring.datasource.username=user
   spring.datasource.password=Bharathi@2655
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

Run the Application:

we have to use Maven to build and run the application

./mvnw spring-boot:run 

### API Endpoints

1. Create Item
   URL: http://localhost:8080/items
   Method: POST

   Request Body:

   {
   "name": "Iphone15ProMax",
   "description": "This is Iphone15ProMax",
   "quantity": 10,
   "price": 1500.0
   },

   Response:

   {
   "id": 1,
   "name": "Iphone15ProMax",
   "description": "This is Iphone15ProMax",
   "quantity": 10,
   "price": 1500.0
   }

2. Get All Items
   URL: http://localhost:8080/items
   Method: GET

   Response:

   [
   {
   "id": 1,
   "name": "Iphone15ProMax",
   "description": "This is Iphone15ProMax",
   "quantity": 10,
   "price": 1500.0
   },
   {
   "id": 2,
   "name": "SamsungS23Ultra",
   "description": "This is SamsungS23Ultra",
   "quantity": 5,
   "price": 1300.0
   },
   {
   "id": 3,
   "name": "AirpodsPro",
   "description": "This is Apple Airpods pro",
   "quantity": 6,
   "price": 350.0
   },
   {
   "id": 4,
   "name": "SamsungWatch",
   "description": "This is Samsung Watch",
   "quantity": 3,
   "price": 300.0
   },
   {
   "id": 5,
   "name": "HpEliteBook",
   "description": "This is Hp Elite Book Laptop",
   "quantity": 12,
   "price": 800.0
   },
   {
   "id": 8,
   "name": "SonyTv",
   "description": "This is Sony TV",
   "quantity": 2,
   "price": 700.0
   },
   {
   "id": 9,
   "name": "JBL",
   "description": "This is JBL Bluetooth Speaker",
   "quantity": 6,
   "price": 130.0
   }
   ]

3. Get Item by ID
   URL: http://localhost:8080/items/{id}
   Method: GET
   URL Parameters: id (for example 1)

   Response:

   {
   "id": 1,
   "name": "Iphone15ProMax",
   "description": "This is Iphone15ProMax",
   "quantity": 10,
   "price": 1500.0
   }

4. Update Item
   URL: http://localhost:8080/items/{id} (for example 2)
   Method: PUT
   Request Body:

   {
   "name": "SamsungS23Ultra",
   "description": "This is Samsung mobile",
   "quantity": 8,
   "price": 1400
   }

   Response:

   {
   "id": 2,
   "name": "SamsungS23Ultra",
   "description": "This is Samsung mobile",
   "quantity": 8,
   "price": 1400
   }

5. Delete Item
   URL: http://localhost:8080/items/{id}
   Method: DELETE
   URL Parameters: id (e.g., 1)
   Response:
   []  200 OK

### Sample Data

Below is sample data to populate the item table:

[
{
"id": 1,
"name": "Iphone15ProMax",
"description": "This is Iphone15ProMax",
"quantity": 10,
"price": 1500.0
},
{
"id": 2,
"name": "SamsungS23Ultra",
"description": "This is SamsungS23Ultra",
"quantity": 5,
"price": 1300.0
},
{
"id": 3,
"name": "AirpodsPro",
"description": "This is Apple Airpods pro",
"quantity": 6,
"price": 350.0
},
{
"id": 4,
"name": "SamsungWatch",
"description": "This is Samsung Watch",
"quantity": 3,
"price": 300.0
},
{
"id": 5,
"name": "HpEliteBook",
"description": "This is Hp Elite Book Laptop",
"quantity": 12,
"price": 800.0
},
{
"id": 8,
"name": "SonyTv",
"description": "This is Sony TV",
"quantity": 2,
"price": 700.0
},
{
"id": 9,
"name": "JBL",
"description": "This is JBL Bluetooth Speaker",
"quantity": 6,
"price": 130.0
}
]

### Usage Examples

1. Retrieve All Items
   Request: curl -X GET http://localhost:8080/items
   Response:
   [
   {
   "id": 1,
   "name": "Iphone15ProMax",
   "description": "This is Iphone15ProMax",
   "quantity": 10,
   "price": 1500.0
   },
   {
   "id": 2,
   "name": "SamsungS23Ultra",
   "description": "This is SamsungS23Ultra",
   "quantity": 5,
   "price": 1300.0
   },
   {
   "id": 3,
   "name": "AirpodsPro",
   "description": "This is Apple Airpods pro",
   "quantity": 6,
   "price": 350.0
   },
   {
   "id": 4,
   "name": "SamsungWatch",
   "description": "This is Samsung Watch",
   "quantity": 3,
   "price": 300.0
   },
   {
   "id": 5,
   "name": "HpEliteBook",
   "description": "This is Hp Elite Book Laptop",
   "quantity": 12,
   "price": 800.0
   },
   {
   "id": 8,
   "name": "SonyTv",
   "description": "This is Sony TV",
   "quantity": 2,
   "price": 700.0
   },
   {
   "id": 9,
   "name": "JBL",
   "description": "This is JBL Bluetooth Speaker",
   "quantity": 6,
   "price": 130.0
   }
   ]
2. Retrieve Item by ID
   Request: curl -X GET http://localhost:8080/items/1
   Response:
   {
   "id": 1,
   "name": "Iphone15ProMax",
   "description": "This is Iphone15ProMax",
   "quantity": 10,
   "price": 1500.0
   }

3. Create a New Item
   Request: curl -X POST http://localhost:8080/items \
   -H "Content-Type: application/json" \
   -d '{
   "name": "MacbookM3Chip",
   "description": "This is the Apple Macbook M3 Chip",
   "quantity": 7,
   "price": 1300.0
   }'
   Response:

{
"id": 10,
"name": "MacbookM3Chip",
"description": "This is the Apple Macbook M3 Chip",
"quantity": 7,
"price": 1300.0
}

4. Update an Item
   Request: curl -X PUT http://localhost:8080/items/1 \
   -H "Content-Type: application/json" \
   -d '{
   "name": "Iphone15ProMax",
   "description": "Iphone15ProMax is the latest model in Iphone",
   "quantity": 15,
   "price": 1550.0
   }'
   Response:
{
"id": 1,
"name": "Iphone15ProMax",
"description": "Iphone15ProMax is the latest model in Iphone",
"quantity": 15,
"price": 1550.0
}

5. Delete an Item
   Request: curl -X DELETE http://localhost:8080/items/1
   Response: 200 OK

### Error Handling

The application uses global exception handling for the following exceptions:

RuntimeException: Returns 404 Not Found with the exception message.
IllegalArgumentException: Returns 400 Bad Request with the exception message.