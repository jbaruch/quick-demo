pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven {
            url = uri("https://repo.gradle.org/gradle/enterprise-libs-release-candidates-local/")
        }
    }
}

plugins {
    id("com.gradle.enterprise") version "3.13.4"
}

gradleEnterprise {
    buildScan {
        server = "https://events.gradle.com"
        publishAlways()
        capture {
            isTaskInputFiles = true
        }
    }
}

rootProject.name = "quick-demo"
