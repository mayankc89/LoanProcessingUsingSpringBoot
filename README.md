# LoanProcessingUsingSpringBoot
Test Project to process loans using SpringBoot

## Getting Started

### Requirements

- Java 8
- Maven

### Build and Start
```bash
git clone https://github.com/mayankc89/LoanProcessingUsingSpringBoot.git
cd LoanProcessingUsingSpringBoot
mvn clean package
```

Now, we're ready to launch the service:
- Make sure you're inside the folder `LoanProcessingUsingSpringBoot` and execute

  - To start from terminal
  ```bash
  java -jar target/loan.processing-1.0-SNAPSHOT.jar
  ```
  - Or click on Run Application in your IDE
  
This will start the service on the default port of `8080` connected to a local [`HSQLDB`](http://hsqldb.org/)
