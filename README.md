# DSHE-DMS

### Prerequisites
- Java 17
- Gradle 8.x
- Postgres 15

### Initial task after cloning

- Setup postgres (or docker image) and create a database with name `dshe_dms`
- Create a file with name `dev.gradle` at the application root level (side by side with `build.gradle` file) with these contents making necessary changes as per your environment:
- Create a file with name `application-dev.yml` in the resources root (side by side with `application.yml`)
```
ext.liquibase_config = [
   developerName : "Your Name",
   //"jdbc:h2:mem:testdb"
   liquibase_db_url : "jdbc:postgresql://postgres:5432/dshe_dms",
   liquibase_db_user : "your-db-user",
   liquibase_db_password : "your-db-password",
   liquibase_db_driver : "org.postgresql.Driver"
]
```

- If does not exist, create a folder with name `migrations` inside resources/db/changelog folder
- 