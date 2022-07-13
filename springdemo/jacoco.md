# start webapp
```bash
java -javaagent:jacocoagent.jar=includes=*,output=tcpserver,address=*,port=6300,append=true -jar target/springdemo-0.0.1-SNAPSHOT.jar

```

# dump
```bash
java -jar jacococli.jar dump --address localhost --destfile jacoco.exec  --port 6300
```

# report
```bash
java -jar jacococli.jar report jacoco.exec --classfiles target/classes --csv jacoco.csv --html jacoco-html-report --name quintos --sourcefiles src/ --xml jacoco.xml
```