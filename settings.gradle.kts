rootProject.name = "faculdade"

include("alg-170326")

project(":alg-170326").projectDir = file("./algoritimos/aula-17-03-2026")


// val modulesDir = file("algoritimos")
// algDir.listFiles()
//    ?.filter { it.isDirectory && file("${it.path}/build.gradle.kts").exists() }
//    ?.forEach { dir ->
//        include(dir.name)
//        project(":${dir.name}").projectDir = dir
//    }