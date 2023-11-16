# Generale Guidelines

## Migration
- Before changing anything in the entities, commit your work first
- Make the changes in entities 
- Build the project
- Open the changeLog file and navigate to the end of the file so that you can observe 'what' migration is going to be generated.
- Generate changelog, use gradle task `liquibase:diffChangeLog`. Be careful to run it only once.
- Observe the changeSet. In the generated changeSets, replace the generated author name with your name.
- Build the project again, the changes will be applied in the database (very weird though) 
- It is good to change one entity at a time.
- Do not run `liquibase:update`. Because then you'll not be able to build the project.