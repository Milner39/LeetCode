// plugins {
//   // Compiling Java
//   id("java-library")

//   // Adds the `run` task
//   id("application")
// }


// java {
//   toolchain {
//     // Use specific Java version
//     languageVersion = JavaLanguageVersion.of(21)
//   }
// }


// // Tell Gradle to use Maven Central for dependencies
// repositories {
//   mavenCentral()
// }

// dependencies {
//   // JUnit for unit tests
//   testImplementation(libs.junit)
//   testRuntimeOnly("org.junit.platform:junit-platform-launcher")
// }


// tasks.named<Test>("test") {
//   // Use JUnit Platform for unit tests.
//   useJUnitPlatform()
// }


// configure<SourceSetContainer> {
//   named("main") {
//     // Gradle will look for main code in:
//     // `./src` instead of `./src/main/java`
//     java.srcDirs("src")
//   }
//   named("test") {
//     // Gradle will look for test code in:
//     // `./test` instead of `./src/test/java`
//     java.srcDirs("test")
//   }
// }



subprojects {
  // === Plugins ===

  // Compiles Java
  apply(plugin = "java-library")

  // Adds the `run` task
  apply(plugin = "application")

  // === Plugins ===



  // === Extensions ===

  // Use specific Java version
  extensions.configure<JavaPluginExtension> {
    toolchain {
      languageVersion.set(JavaLanguageVersion.of(21))
    }
  }

  // === Extensions ===



  // === Dependencies ===

  // Tell Gradle to use Maven Central for dependencies
  repositories {
    mavenCentral()
  }

  dependencies {
    "testImplementation"(libs.junit)
    "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
  }

  // === Dependencies ===



  // === Testing ===

  // ✅ Configure test task
  tasks.withType<Test> {
    useJUnitPlatform()
  }

  // === Testing ===



  configure<SourceSetContainer> {
    named("main") {
      // Gradle will look for main code in:
      // `./src` instead of `./src/main/java`
      java.srcDirs("src")
    }
    named("test") {
      // Gradle will look for test code in:
      // `./test` instead of `./src/test/java`
      java.srcDirs("test")
    }
  }
}