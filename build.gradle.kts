plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.7.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.test {
    onlyIf { true }
    useJUnitPlatform()
    //maxParallelForks = 2
    testLogging {
        events("PASSED", "FAILED", "SKIPPED")
        events ("SKIPPED")
        displayGranularity = 1
    }
     predictiveSelection {
         enabled.set(false)
     }
    distribution {
        maxLocalExecutors.set(0)
        enabled.set(false)
    }

}

