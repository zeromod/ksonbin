plugins {
    kotlin("jvm") version "1.3.72"
    id("maven-publish")
}

group = "in.zeromod"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    val retrofit = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:${retrofit}")
    implementation("com.squareup.retrofit2:converter-moshi:${retrofit}")

    val okHttp = "4.7.2"
    implementation("com.squareup.okhttp3:okhttp:$okHttp")
    implementation("com.squareup.okhttp3:okhttp-urlconnection:$okHttp")
    implementation("com.squareup.okhttp3:logging-interceptor:$okHttp")
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


task("run") {

}