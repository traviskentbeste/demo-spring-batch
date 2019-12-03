# spring-batch-demo
Spring Batch Demo

Table of contents
=================
<!--ts-->
   * [Installation](#installation)
   * [H2 Database](#h2-database)
<!--te-->

Installation
============

built with https://start.spring.io/

```
spring boot devtools
spring web
spring data jpa
h2 database
spring batch
```

H2 Database
============
Console URL: http://localhost:8080/h2-console

Helpful SQL to run
* First run will not have anything entered in
* Second run will have data in the user table
* Subsequent runs will have same data but updated timestamps
```
select * from user;
   
select * from batch_job_execution;
select * from batch_job_execution_context;
select * from batch_job_instance;
select * from batch_step_execution;
select * from batch_step_execution_context;
```
