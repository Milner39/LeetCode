plugins {
  // Declare the application plugin (Gradle’s built-in plugin)
  id("application")
}

subprojects {
  // === Plugins ===

  // Compiles Java
  apply(plugin = "java-library")

  // Adds the `run` task
  apply(plugin = "application")

  // === Plugins ===



  // === Java ===

  // Use specific Java version
  extensions.configure<JavaPluginExtension> {
    toolchain {
      languageVersion.set(JavaLanguageVersion.of(21))
    }
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

  // Set the entry point to all projects
  application {
    mainClass.set("Solution")
  }

  // === Java ===



  // === Dependencies ===

  var libs = rootProject.libs

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

  tasks.withType<Test> {
    useJUnitPlatform()
  }

  // === Testing ===
}



// Store all project `build` dirs under the root `build` dir
allprojects {
  val relPath = project.path.removePrefix(":").replace(":", "/")
  buildDir = File(rootProject.buildDir, relPath)
}