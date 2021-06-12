# java9-getting-started

## Compile
```javac -d java9-getting-started/output/ --module-source-path java9-getting-started $(find java9-getting-started -name "*.java")```
> -d is a output directory path <br>
> --module-source-path is a path to the directory containing all modules <br>
> $(find java9-getting-started -name "*.java") gives all java files to compile <br>  


## Run
```java -p java9-getting-started/output/com.localhost.backend:java9-getting-started/output/com.localhost.database:java9-getting-started/output/com.localhost.cache -m com.localhost.backend/com.localhost.backend.Processor```<br><br>
```java --module-path java9-getting-started/output/com.localhost.backend:java9-getting-started/output/com.localhost.database:java9-getting-started/output/com.localhost.cache --module com.localhost.backend/com.localhost.backend.Processor```
> -p or --module-path is a path to compiled module classes<br>
> -m or -module is a path of module class to run
