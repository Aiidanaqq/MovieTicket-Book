# Movie Ticket Booking System

## Project Description

This is a Java-based Movie Ticket Booking System,designed using the Model-View-Controller (MVC) design pattern.The application allows users to book movie tickets, view available movies,and manage bookings.It provides a graphical user interface (GUI) built with JavaFX and interacts with a PostgreSQL database to store movie and booking information.

The system includes the following features:
- Adding,updating,and deleting movies.
- Viewing all movies in the database.
- Booking tickets for selected movies with date and seat information.
- Managing bookings: adding,updating,and deleting bookings.
- User-friendly interface with message notifications for incorrect inputs.

---

## Project Requirements List

- Movie Management:
  1. Add a new movie with details such as title,genre,duration,release date,and rating.
  2. View a list of all available movies.
  3. Update movie details.
  4. Delete a movie from the database.

- Booking Management:
  5. Add a new booking (user name,movie title,seat count,showtime,booking date).
  6. View all bookings.
  7. Update booking details (user name,movie title,seat count,etc.).
  8. Delete a booking.

- Database Interaction:
  9. Database connection using JDBC to interact with a PostgreSQL database.
  10. Store and retrieve movie and booking data through SQL queries.

- User Interface:
  11. Graphical user interface (GUI) built with JavaFX.
  12. Input validation and user notifications for incorrect data or missing information.
  13. Responsive design for different screen sizes.
  
- Testing:
  14. Unit tests for the business logic of the Movie and Booking models.
  15. Ensuring the system functions correctly through integration tests.

---

## Team Members

- Team - Project Leaders
- Kokumova Aidana - UI/UX Designer, Front-End Developer
- Rahmatova Leyla - Backend Developer,Database Specialist
- Bekten uly Mukhammed - Presentation,Testing Specialist

---

## Roles of Group Members

- All three: 
  - Responsible for overall project coordination, integration of the Model-View-Controller (MVC) architecture, and backend development, particularly for the Movie and Booking DAOs.
  
- Kokumova Aidana: 
  - Designed the user interface using JavaFX and implemented all view components, ensuring a user-friendly design and responsive layout.

- Rahmatova Leyla: 
  - Focused on the database design and the development of the data access layers (DAO) for interacting with the PostgreSQL database. Ensured data integrity and efficient queries.

- Bekten uly Mukhammed: 
  - Responsible for testing the system, both manual and automated testing, and ensuring all use cases and edge cases are covered. Created a presentation.

---

## Screenshots

- Main Interface:  
  ![Main Interface](path-to-your-screenshot.png)
  
- Movie Booking Screen:  
  ![Booking Screen](path-to-your-screenshot.png)

---

## UML Class Diagram

The UML Class Diagram outlines the structure of the Movie Ticket Booking System, including the relationships between the Movie, Booking, and DAO classes.  
![UML Diagram](path-to-your-uml-diagram.png)

---

## Code Structure

### Model:
- Movie.java: Represents the Movie entity,with attributes like title,genre,duration,release date,and rating.
- Booking.java: Represents a Booking entity,containing information like user name,movie title,seat count,showtime,and booking date.

### View:
- HelloApplication.java: The main entry point for the JavaFX application that initializes the GUI and launches the main stage.
- HelloController.java: Handles user input,including booking tickets,validating user data,and updating the GUI with notifications.

### Controller:
- MovieDAO.java: Provides data access methods for movie-related operations (CRUD-Create,Read,Update,Delete).
- BookingDAO.java: Handles database operations related to bookings.
- DAOInterface.java: A generic interface that both MovieDAO and BookingDAO implement to handle CRUD operations.
- ### Database:
- PostgreSQL is used as the database for storing movies and bookings.The system connects to the database through JDBC.

---

## Unit Testing

Unit tests for model methods are provided in the test directory.Tests ensure that the business logic for movies and bookings are functioning correctly, especially for CRUD operations.For testing,we used JUnit.

---

## How to Run the Application

1. Clone the repository:
   ```bash
   git clone [https://github.com/your-username/movie-ticket-booking.git](https://github.com/Bektenovich/projectOOP.git)
   
---

## Presentation

Presentation is located in our Google Docs and can be found in the following link:  
[Presentation](https://link-to-google-docs)

---
