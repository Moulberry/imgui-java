plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("1.0.0")
}

rootProject.name = "imgui-java"
include("imgui-binding")
include("imgui-binding-natives")
