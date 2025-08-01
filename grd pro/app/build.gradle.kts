plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit test framework.
    testImplementation(libs.junit)

    // This dependency is used by the application.
    implementation(libs.guava)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
tasks.test { 
useJUnit() 
testLogging { 
events("passed", "failed", "skipped") 
exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL 
showStandardStreams = true 
 
} 
outputs.upToDateWhen { false }
} 
application {
    // Define the main class for the application.
    mainClass = "org.example.App"
}
