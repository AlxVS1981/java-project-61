plugins {
    id("java")
    application
    id("com.github.ben-manes.versions") version "0.51.0"
    id("org.sonarqube") version "7.1.0.6387"
}

sonarqube {
    properties {
        property("sonar.projectKey", "AlxVS1981_java-project-61")
        property("sonar.organization", "alxvs1981")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

application {
    mainClass.set("hexlet.code.App")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

