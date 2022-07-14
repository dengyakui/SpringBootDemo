# start webapp
```bash
java -javaagent:jacocoagent.jar=includes=*,output=tcpserver,address=*,port=6300,append=true -jar target/springdemo-0.0.1-SNAPSHOT.jar

```

# dump
```bash
java -jar jacococli.jar dump --address localhost --destfile jacoco4.exec  --port 6300
```

# report
```bash
java -jar jacococli.jar report jacoco3.exec --classfiles target/classes --csv jacoco3.csv --html jacoco-html-report3 --name quintos --sourcefiles src/ --xml jacoco3.xml
```

# merge
```bash
#java -jar jacococli.jar merge jacoco3.exec jacoco4.exec --destfile jacoco-merge.exec
java -jar jacococli.jar report jacoco-merge.exec --classfiles target/classes --csv jacoco-merge.csv --html jacoco-html-report-merge --name jaococ-merge --sourcefiles src/ --xml jacoco-merge.xml
```


# exec info
```bash
java -jar jacococli.jar execinfo jacoco-merge.exec
```

# class info
```bash
java -jar jacococli.jar classinfo target/classes
```

# report by multi exec
```bash
java -jar jacococli.jar report jacoco3.exec jacoco4.exec --classfiles target/classes --csv jacoco3-4.csv --html jacoco-html-report3-4 --name quintos --sourcefiles src/ --xml jacoco3-4.xml
```