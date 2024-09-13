/*
+----------------------------+
|          Table             |
+----------------------------+
| - tableNumber: int         |
| - size: int                |
| - isAvailable: boolean     |
+----------------------------+
| + setAvailability(status: boolean): void   |
| + getDetails(): String                    |
+----------------------------+
            |
            |
           reserved by
            |
+----------------------------+
|       Reservation          |
+----------------------------+
| - customerName: String     |
| - reservationDate: Date    |
| - table: Table             |
+----------------------------+
| + makeReservation(table: Table): void     |
| + displayReservation(): void              |
+----------------------------+
*/