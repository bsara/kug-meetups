// import io.gitlab.arturbosch.detekt.Detekt
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile



//----------------------------------------------------------------------------//
// Plugins                                                                    //
//----------------------------------------------------------------------------//

plugins {
  idea
  java

  val kotlinVersion = "1.5.21"
  kotlin("jvm") version kotlinVersion
  kotlin("kapt") version kotlinVersion
  id("org.jetbrains.dokka") version "1.5.0"
}


//----------------------------------------------------------------------------//
// Project Info                                                               //
//----------------------------------------------------------------------------//

group = "org.example"
version = "1.0-SNAPSHOT"

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile>().configureEach {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "11"
    apiVersion = "1.5"
    languageVersion = "1.5"
  }
}

// tasks.withType<Detekt>().configureEach {
//   jvmTarget = "11"
// }


//----------------------------------------------------------------------------//
// Dependencies/Repos                                                         //
//----------------------------------------------------------------------------//

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(platform("org.junit:junit-bom:5.7.2"))


  implementation(kotlin("stdlib-jdk8"))
  implementation(kotlin("reflect"))
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")

  testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
  testImplementation("io.mockk:mockk:1.12.0")
}



//----------------------------------------------------------------------------//
// Tasks                                                                      //
//----------------------------------------------------------------------------//
