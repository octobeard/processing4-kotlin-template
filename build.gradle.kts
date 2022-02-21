import java.net.URI

plugins {
    application
    kotlin("jvm") version "1.6.10"
}

group = "com.octobeard"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = URI("https://jitpack.io") }
}

dependencies {
    implementation(kotlin("stdlib"))
    // import processing4 beta 6 library via jitpack maven mirror
    implementation("com.github.micycle1:processing-core-4:4.0b6c")
    // import HYPE jar in libs directory 2.x
    implementation(fileTree(mapOf("dir" to "libs/hype", "include" to listOf("*.jar"))))
    // import minim library 2.2.2
    implementation(fileTree(mapOf("dir" to "libs/minim", "include" to listOf("*.jar"))))
}

application {
    mainClass.set("MainKt")
}