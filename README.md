# TemAvg
Average Daily Temperature (IOC)

Goal First-Commit
Using Inversion of the control 

Functional requirements//
The application will calcul the average dayily temperature based on the data from the DB. 
For the beginning the sum of the dailys temperatures will be entered manualy

Techical requirements// 
All the parts of the application needs to be open for the extension and closed for the modification. 

V1 dependency injection using static way//
DAO and METIER are closed for the modification and open for the extensions. But the party PRESENTATION is open for the modification, he depends on the instance of the class. 

V2 dependency injection using Spring annotaton//
All the 3 tiers are closed for the modification and open to the extension 

V1 dependency injection using static way
V2 dependency injection using Spring .xml file

Tools//
Java 
Spring
MYSQL data base

