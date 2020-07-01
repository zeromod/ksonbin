plugins {
    kotlin("jvm") version "1.3.72"
    id("maven-publish")
    kotlin("plugin.serialization") version "1.3.72"
    id("org.jetbrains.dokka") version "0.10.1"
}

group = "in.zeromod"
version = "1.0"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    val ktor = "1.3.2"
    api("io.ktor:ktor-client-cio:$ktor")
    api("io.ktor:ktor-client-json-jvm:$ktor")
    api("io.ktor:ktor-client-serialization-jvm:$ktor")
}
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = "ksonbin"
            from(components["java"])
        }
    }
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks {
    val dokka by getting(org.jetbrains.dokka.gradle.DokkaTask::class) {
        outputFormat = "jekyll"
        outputDirectory = "$rootDir/docs"
    }
}