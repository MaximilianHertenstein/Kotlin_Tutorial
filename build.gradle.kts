plugins {
    kotlin("jvm") version "2.1.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //implementation("junit:junit:4.13.1")
    //implementation("org.junit.jupiter:junit-jupiter:5.12.1")
    testImplementation(kotlin("test"))

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}