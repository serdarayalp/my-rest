# my-rest-application

# greety setup

```
apply plugin: 'org.gretty'

repositories {
    jcenter()
}

buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath 'org.gretty:gretty:2.3.0'
    }
}

if (!project.plugins.findPlugin(org.akhikhl.gretty.GrettyPlugin))
    project.apply(plugin: org.akhikhl.gretty.GrettyPlugin)
```    

    
# Start with Greety
```
gradle jettyRun
http://localhost:8080/my-rest-application/mydocuments/documents
```

# Start with Tomcat
```
ApplicationContext = myapplication
http://localhost:8080/myapplication/mydocuments/documents
```