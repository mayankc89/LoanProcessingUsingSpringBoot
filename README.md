# LoanProcessingUsingSpringBoot
### Travis-CI Build Status  [![Travis-ci Build Status](https://travis-ci.org/mayankc89/LoanProcessingUsingSpringBoot.svg?branch=master)](https://travis-ci.org/mayankc89/LoanProcessingUsingSpringBoot) 

Test Project to process loans using SpringBoot
- Form which accepts
  - Loan Value
  - Property Value
  - Social Security (SSN)
- and returns
  - Loan Id
  - Loan Status (Accepted or Rejected) based on `Loan To Value(LTV)`
- If `LTV` > **40** percent
  - *Loan Status : Rejected*
- Else
  - *Loan Status : Accepted*

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
and can be accessed by typing `localhost:8080` in any browser

### To Stop

To gracefully stop, ctrl-c

### Added CI support using Travis CI
- [Setup](https://docs.travis-ci.com/user/languages/java/)
- [Adding Build Badge](https://toedter.com/2014/05/23/continuous-integration-with-travis-ci/)

### Added Slack Notifications
- [Setup](https://docs.travis-ci.com/user/notifications/#Configuring-slack-notifications)
    - Create a Channel
    - Click on *Add an App or Integration*
    - Paste the code listed for *Simple notifications* in your `.travis.yml` file