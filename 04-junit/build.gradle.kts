plugins {
    java
    scala
    jacoco
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.10")
    val junitVersion = "5.9.2"
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

// Enables JUnit Platform (needed for JUnit 5)
tasks.named<Test>("test") {
    useJUnitPlatform()
}
