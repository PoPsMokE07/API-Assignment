# SDE API Round - IRCTC

## Implemented Features


- **Added a New Train:** An endpoint for the admin to create a new train with a source and destination.
- **Get Seat Availability:** Created an endpoint for the users where they can enter the source and destination and fetch all the trains between that route with their availabilities.
- **Book a Seat:** Created an endpoint for the users to book a seat on a particular train. Only one ticket can be booked at a time by a user.
- **Get Specific Booking Details:** Created an endpoint for the users to view details of a specific booking.
- **Real-time Seat Availability:** The app will display how many seats are available between any 2 stations. Users can book a seat if the availability > 0 after logging in. The code is optimized to handle large traffic and race conditions while booking.


### Note

Authentication system could not be implemented due to time constraints.


## Tech Stack

- Java/Spring Boot
- MySQL
- Postman

## Requirements

For building and running the application you need:

- JDK 22
- Maven 

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively, you can use the Spring Boot Maven plugin like so:

```bash

mvn spring-boot:run



