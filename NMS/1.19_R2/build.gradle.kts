plugins {
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.14"
}

dependencies {
    paperweight.paperDevBundle("1.19.3-R0.1-SNAPSHOT")

    compileOnly(project(":NMS:Wrapper"))
}