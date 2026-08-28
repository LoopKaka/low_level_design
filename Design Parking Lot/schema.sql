PARKING_LOT
------------
id PK
name


PARKING_FLOOR
-------------
id PK
parking_lot_id FK
floor_number


PARKING_SPOT
------------
id PK
floor_id FK
spot_number
spot_type
status


OPERATOR
--------
id PK
name
phone
employee_id UNIQUE


GATE
----
id PK
parking_lot_id FK
gate_number
gate_type
gate_status
operator_id FK


VEHICLE
-------
id PK
vehicle_number UNIQUE
vehicle_type


TICKET
------
id PK
ticket_number UNIQUE
vehicle_id FK
parking_spot_id FK
entry_gate_id FK
entry_operator_id FK
entry_time
exit_time
status


PARKING_SESSION
---------------
id PK
vehicle_id FK
parking_spot_id FK
ticket_id FK UNIQUE
entry_time
exit_time


BILL
----
id PK
ticket_id FK
amount DECIMAL(12,2)
generated_at
status
generated_by FK


PAYMENT
-------
id PK
bill_id FK
amount DECIMAL(12,2)
payment_mode
payment_status
transaction_id
paid_at