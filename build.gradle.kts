plugins {
    application
    kotlin("jvm") version "1.6.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    // import HYPE jar in libs directory 2.x
    implementation(fileTree(mapOf("dir" to "libs/hype", "include" to listOf("*.jar"))))
    // import minim library 2.2.2
    implementation(fileTree(mapOf("dir" to "libs/minim", "include" to listOf("*.jar"))))
    // import processing4 beta 6 library
    implementation(fileTree(mapOf("dir" to "libs/processing4", "include" to listOf("*.jar"))))
}

application {
    mainClass.set("MainKt")
}