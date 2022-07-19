# start webapp
```bash
java -javaagent:jacocoagent.jar=includes=*,output=tcpserver,address=*,port=6300,append=true -jar target/springdemo-0.0.1-SNAPSHOT.jar

```

# dump
```bash
java -jar jacococli.jar dump --address localhost --port 6300 --destfile jacoco.exec
```

# report
```bash
java -jar jacococli.jar report D:\output\jacoco-master-branch\round2\jacoco.exec --classfiles D:\output\jacoco-master-branch\round2\classes --csv D:\output\jacoco-master-branch\round2\jacoco.csv --html D:\output\jacoco-master-branch\round2\jacoco-html-report --name quintos --sourcefiles D:\output\jacoco-master-branch\round2\springdemo\src --xml D:\output\jacoco-master-branch\round2\jacoco.xml
```

# merge
```bash
#java -jar jacococli.jar merge D:\output\jacoco-master-branch\round1\jacoco.exec D:\output\jacoco-master-branch\round2\jacoco.exec --destfile D:\output\jacoco-master-branch\roundmerge\jacoco-merge.exec
java -jar jacococli.jar report D:\output\jacoco-master-branch\roundmerge\jacoco-merge.exec --html D:\output\jacoco-master-branch\roundmerge\jacoco-html-report-merge --name jaococ-merge --classfiles D:/output/jacoco-master-branch/round1/classes/
```

# report by multi exec files
```bash
java -jar jacococli.jar report D:\output\jacoco-master-branch\round1\jacoco.exec D:\output\jacoco-master-branch\round2\jacoco.exec --html D:\output\jacoco-master-branch\roundmerge\jacoco-html-report-merge --name jaococ-merge --classfiles D:/output/jacoco-master-branch/round2/classes/
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