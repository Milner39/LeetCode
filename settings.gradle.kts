rootProject.name = "LeetCode"



// === Add each LeetCode problem as it's own project ===

var solDir = "solutions"

// Look in `./solutions/`
file(solDir).listFiles()
  ?.filter { it.isDirectory }
  ?.forEach { difficultyDir ->

    // Look in `./solutions/{diff}/`
    difficultyDir.listFiles()
      ?.filter { it.isDirectory }
      ?.forEach { problemDir ->

        // Get relative path to each problem dir
        val dirPath = "${solDir}/${difficultyDir.name}/${problemDir.name}"
        var projectPath = "/${dirPath}".replace("/", ":")

        // Include each as sub-project and set location
        include(projectPath)
        project(projectPath)
          .projectDir = file(dirPath)

      }
  }

// NOTE: There cannot be spaces in the project paths, so avoid spaces in dir names