plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "BiomesAPI"

include("NMS:Wrapper")
include("NMS:1.19_R2")
include("NMS:1.19_R3")
include("NMS:1.20_R1")
include("NMS:1.20_R2")
include("NMS:1.20_R3")
include("Kotlin")
include("NMS:1.21_R3")
findProject(":NMS:1.21_R3")?.name = "1.21_R3"
include("NMS:1.21_R3")
findProject(":NMS:1.21_R3")?.name = "1.21_R3"
include("NMS:1.21_R1")
findProject(":NMS:1.21_R1")?.name = "1.21_R1"
