// Root project only
plugins {}



// All sub-projects
subprojects {
  apply(plugin = "java")
  apply(plugin = "java-library")

  // Tell Gradle to get dependencies from Maven Central
  repositories {
    mavenCentral()
  }

  dependencies {
    // Testing
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
  }

  tasks.test {
    // Use JUnit for testing
    useJUnitPlatform()
  }


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