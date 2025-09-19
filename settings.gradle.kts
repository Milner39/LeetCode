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

        // Include as sub-project and set location
        include(projectPath)
        project(projectPath)
          .projectDir = file(dirPath)

      }
  }