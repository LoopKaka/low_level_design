building
--------
building_id INT PK
address VARCHAR


floor
-----
floor_id INT PK
building_id INT FK -> building.building_id
floor_panel_id INT


elevator
--------
elevator_id INT PK
building_id INT FK -> building.building_id
current_floor INT FK -> floor.floor_id
elevator_state ENUM(IDLE, MOVING, MAINTENANCE)
door_state ENUM(OPEN, CLOSED)
direction ENUM(UP, DOWN, IDLE)
max_load BIGINT
current_load BIGINT


floor_request
-------------
request_id INT PK
current_floor INT FK -> floor.floor_id
direction ENUM(UP, DOWN)
assigned_elevator_id INT FK -> elevator.elevator_id, NULLABLE
current_time TIMESTAMP


cabin_request
-------------
request_id INT PK
elevator_id INT FK -> elevator.elevator_id
target_floor INT FK -> floor.floor_id
current_time TIMESTAMP
