plugins {
   `java-library`
   groovy
}

val groovyVersion:String? by project

dependencies {
   api("org.codehaus.groovy:groovy:${groovyVersion?:"2.5.8"}")
   implementation(project(":producer"))
}


