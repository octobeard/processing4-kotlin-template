import java.net.URI

plugins {
    application
    kotlin("jvm") version "1.6.10"
}

group = "com.octobeard"
version = "1.0-SNAPSHOT"

val lwjglVersion = "3.3.1"
val libp5xVersion = "0.353.0-beta-3"
val osNatives = "natives-macos"
//val osNatives = "natives-linux"
//val osNatives = "natives-linux-arm64"

repositories {
    mavenCentral()
    //maven { url = URI("https://jitpack.io") }
}

dependencies {
    implementation(kotlin("stdlib"))
    // import processing4 beta 6 library via jitpack maven mirror
    // https://github.com/codelerity/libp5x-examples/

    // import libp5x project to import processing 3.5.3 dependency with opengl native bindings
    implementation("org.praxislive.libp5x:processing-core:$libp5xVersion")
    implementation("org.praxislive.libp5x:processing-lwjgl:$libp5xVersion")
    implementation(platform("org.lwjgl:lwjgl-bom:$lwjglVersion"))
    implementation(fileTree(mapOf("dir" to "libs/lwjgl-release-3.3.1", "include" to listOf("*.jar"))))

    // import HYPE jar in libs directory 2.x
    implementation(fileTree(mapOf("dir" to "libs/hype", "include" to listOf("*.jar"))))
    // import minim library 2.2.2
    implementation(fileTree(mapOf("dir" to "libs/minim", "include" to listOf("*.jar"))))
}

application {
    mainClass.set("MainKt")
    applicationDefaultJvmArgs = listOf(
        "-Djava.awt.headless=true",
        "-XstartOnFirstThread",
        "-XX:+IgnoreUnrecognizedVMOptions"
    )
}