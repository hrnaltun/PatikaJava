## FlightManagementSystem



Design a class diagram according to the problem statement below.

Try to use the principles of Object-Oriented Programming and the relationships between classes (Encapsulation, Inheritance, Polymorphism, Abstraction)

Kodluyoruz Insurance Company wants to build a 12-story office building and equip it with the latest elevator technology.
The company wants you to create a software simulator that models the operations of the building's elevators to see if they will meet the traffic flow needs within the building.

The building will have five elevators, each capable of going up to 12 floors of the building.
Each elevator has a capacity of approximately six adult passengers. The elevators are designed to be energy efficient, so they only move when needed.
Each elevator has its own door, floor indicator light, and control panel.
The control panel has destination buttons, door open and close buttons, and an emergency signal button.

Each floor in the building has a door for each of the five elevator shafts and an arrival bell for each door.
The arrival bell indicates that the elevators have arrived at a floor.
A signal light above each door indicates the arrival of the elevator and the direction in which the elevator is moving.
Each floor also has three sets of elevator call buttons.

A person calls an elevator by pressing the appropriate call button (up or down).
A programmer assigns one of the five elevators to go to the floor where the call started.
Once in the elevator, a passenger typically presses one or more destination buttons.
As the elevator moves from floor to floor, an indicator light inside the elevator informs passengers of the elevator's location.
The arrival of an elevator on a floor is indicated by the indicator light above the outer elevator door being lit and the floor bell ringing.
When an elevator stops on a floor, both sets of doors open automatically for a predetermined period of time, allowing passengers to enter and exit the elevator.

The simulator uses a "clock" to simulate real-time passage and time stamps and log the events that occur in the simulation.
A random number generator is used by the simulator to generate passengers and determine the departure and arrival floors for each passenger.

Here is the uml diagram:
-



![oop2](https://github.com/DTPAaron/PatikaJava/blob/master/src/OOP/ElevatorSimulation/ElevatorSimulation.jpg)
