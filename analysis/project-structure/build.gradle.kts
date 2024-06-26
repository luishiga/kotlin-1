plugins {
    kotlin("jvm")
    id("jps-compatible")
}

dependencies {
    implementation(project(":compiler:util"))
    implementation(project(":compiler:psi"))
    implementation(intellijCore())
}

kotlin {
    explicitApi()
}

sourceSets {
    "main" { projectDefault() }
}
