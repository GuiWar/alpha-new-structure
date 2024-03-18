dependencies {
    compileOnly(genesis("script-dependencies"))
    genesisGeneratedCode(withTestDependency = true)
}

description = "alpha-app"

sourceSets {
    main {
        resources {
            srcDirs("src/main/resources", "src/main/genesis")
        }
    }
}

tasks {
    copyDependencies {
        enabled = false
    }
}
