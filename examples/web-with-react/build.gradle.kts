plugins {
	kotlin("multiplatform") version "1.5.21"
	id("org.jetbrains.compose") version "1.0.0-alpha1"
}

repositories {
	mavenCentral()
	maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
	maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
    google()
}

kotlin {
	js(IR) {
		browser()
		binaries.executable()
	}
	sourceSets {
		val jsMain by getting {
			dependencies {
				implementation(compose.web.core)
				implementation(compose.runtime)
				implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.201-kotlin-1.5.0")
				implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.201-kotlin-1.5.0")
				implementation("org.jetbrains.kotlin-wrappers:kotlin-styled:5.3.0-pre.201-kotlin-1.5.0")
				implementation(npm("react", "17.0.2"))
				implementation(npm("react-dom", "17.0.2"))
				implementation(npm("react-youtube-lite", "1.0.1"))
			}
		}
	}
}
