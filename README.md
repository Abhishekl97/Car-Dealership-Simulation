# Car Dealership Simulation in Java

## Overview

The Car Dealership Simulation is a Java-based project that simulates the operations of a car dealership. Users can engage in activities such as buying, selling, repairing, cleaning, and racing cars. The simulation leverages Object-Oriented Programming (OOP) principles and incorporates several common software design patterns.

# Features

**Car Transactions:** Simulate the buying and selling of cars.

**Maintenance Services:** Include car repair and cleaning operations.

**Racing Events:** Users can participate in racing events to check which racer is the best.

**Design Patterns:** Utilizes design patterns such as Observer, Strategy, Decorator, Factory, Singleton, and Command for modular and maintainable code.

**UML Diagrams:** Includes comprehensive UML diagrams to illustrate the interactions between different classes, methods, and variables.

**Simulation Results:** View the results of a 30-day simulation run in the SimResults.txt file.

# Technologies Used

**Programming Language:** Java.

**Design Patterns:** Observer, Strategy, Decorator, Factory, Singleton, Command.

**Documentation:** UML Diagrams.

Java version - 19.0.1

# Assumptions made in the code:

1) Day 1 is considered as Monday. Therefore the 7th day, 14th day, 21st day and 28th days are Sundays.

2) A predefined ArrayList has been defined to get the names of the staff and the vehicles.

3) All the data has been stored in Arraylists of arraylists.

4) For Staff ArrayLists Staff[0] represents Interns.

5) For Staff ArrayLists Staff[1] represents Mechanics.

6) For Staff ArrayLists Staff[2] represents Salesperson.

7) For Staff ArrayLists Staff[3] represents Driver.

8) For all the variables from Staff class such as staff_status, days_worked, staff_salary 0th ArrayList will correspond to Interns, 1st ArrayList will correspond to Mechanics and 2nd ArrayList will correspond to Salesperson.

9) For vehicle ArrayLists vehicle[0] represents Cars.

10) For vehicle ArrayLists vehicle[1] represents Pickup.

11) For vehicle ArrayLists vehicle[2] represents PerformanceCar.

12) For vehicle ArrayLists vehicle[3] represents Motorcycles.

13) For vehicle ArrayLists vehicle[4] represents MonsterTrucks.

14) For vehicle ArrayLists vehicle[5] represents ElectricCars.

15) For all the variables from Vehicle class such as vehicle, status, cost_price, sales_price 0th ArrayList will correspond to Cars, 1st ArrayList will correspond to Pickup, 2nd ArrayList will correspond to PerformanceCar, 3rd ArrayList will correspond to Motorcycles, 4th ArrayList will correspond to MonsterTrucks, 5th ArrayList will correspond to ElectricCars, 6th Arraylist will correspond to BudgetCar, 7th Arraylist will correspond to LuxuryCar and 8th Arraylist will correspond to SuperCar.

16) Bonus is decided based on the car type. Pickup gets 200, PerformanceCar 225, Motorcycles 250, Monster Trucks 275.

17) Driver gets a normal pay of 2000.

18) The vehicles in race_vehicles will be associated with the drivers (all names from staff[3]) having same index numbers. For example, race_vehicles.get(i) will have a driver staff[3].get(i) and its count of races won will be race_won.get(i).

19) After the end of each day bonus amount is initialized to 0 for the next day.

20) quit status is also initialized again for the next day.

21) After the driver gets injured and quits, driver details are also removed from active drivers.

22) Sale bonus for Motorcycles, Monster Trucks and Electric Cars is 150, 175, 200.

23) BudgetCar does not enter Race Events while LuxuryCar and SuperCar enter Race Events.


# Usage

**Buy and Sell Cars:** Simulate transactions to buy and sell cars within the dealership.

**Repair and Clean Cars:** Perform maintenance tasks to keep cars in top condition.

**Race Cars:** Engage in racing events to evaluate driver performance.

**View Results:** After running the simulation, check the SimResults.txt file for a summary of the 30-day simulation activities.

# UML Diagrams

The project includes UML diagrams that provide a visual representation of the system's structure and interactions:

**Class Diagrams:** Illustrate the static structure of the system, showing classes and their relationships.

**Sequence Diagrams:** Show how objects interact in a particular sequence.

**Activity Diagrams:** Represent the workflow of various processes within the system.

# Contact

For any questions or further information, you can reach me at abhisheklimaye97@gmail.com.

Thank you for visiting the Car Dealership Simulation project!
