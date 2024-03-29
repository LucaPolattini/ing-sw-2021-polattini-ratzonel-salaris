# Prova finale di Ingegneria del Software 2021
## Gruppo GC10

- ### 910003 Luca Polattini 
- ### 909986 Ariel Ratzonel  
- ### 910033 Matias Salaris



## Implemented functionalities 

| Functionality | 
|:-----------------------|
| Basic rules | 
| Complete rules |
| Socket | 
| CLI | 
| Multiple games |




## Test coverage 
![Screenshot Coverage](https://raw.githubusercontent.com/LucaPolattini/ing-sw-2021-polattini-ratzonel-salaris/master/Coverage/Coverage02_07_21.JPG?token=ATCFD3GVBR4PEQZ6PRVO4K3A5CDAQ)

(Total number of tests: 60)



## How to generate the JAR archives from terminal
1. Move to the project folder
2. Run the command 
```
mvn package 
```
3. Locate the generated JAR files in the /target folder



## How to run the application
The generated JAR ships all 2 applications, that can be accessed as follows:

### Server
Remember to specify the port number.
It is recommended to run this as Administrator.
```
java -jar GC10-1.0-SNAPSHOT-jar-with-dependencies.jar -server port
```

Example: java -jar GC10-1.0-SNAPSHOT-jar-with-dependencies.jar -server 1334
### CLI
Remember to specify the port number and the server's IPv4 address.
```
java -jar GC10-1.0-SNAPSHOT-jar-with-dependencies.jar -cli port IPv4
```
N.B. The server's IPv4 address must be written without dots.

Example: java -jar GC10-1.0-SNAPSHOT-jar-with-dependencies.jar -cli 1334 84 221 232 254
