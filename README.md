# my-rest-application

ApplicationContext = myapplication

http://localhost:8080/myapplication/mydocuments/documents


# greety setup
apply plugin: 'war'
apply plugin: 'org.gretty'

war {
    from 'src/media/images'
}

buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath 'org.gretty:gretty:2.3.0'
    }
}

repositories {
    jcenter()
}

if (!project.plugins.findPlugin(org.akhikhl.gretty.GrettyPlugin))
    project.apply(plugin: org.akhikhl.gretty.GrettyPlugin)