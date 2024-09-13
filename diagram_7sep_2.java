/*
+-----------------------+
|       Airline         |
+-----------------------+
| - name: String        |
| - flights: List<Flight>|
+-----------------------+
| + addFlight(flight: Flight): void   |
| + displayFlights(): void            |
+-----------------------+
            |
            |
           has
            |
+-----------------------+
|        Flight         |
+-----------------------+
| - flightNumber: String|
| - destination: String |
| - departureDate: Date |
+-----------------------+
| + getDetails(): String|
+-----------------------+
*/