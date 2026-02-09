plugins {
	java
	id("org.springframework.boot") version "4.0.1"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "ru.borodulin"
version = "0.0.1-SNAPSHOT"
description = "Demo project for Spring Boot"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}


repositories {
	maven {
		url = uri("https://artifactory.tcsbank.ru/artifactory/maven-all")
	}
}

dependencies  {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation ("org.springframework.boot:spring-boot-starter-web")
	//implementation("com.fasterxml.jackson.core:jackson-databind")
///	implementation ("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.0")
//	implementation ("com.fasterxml.jackson.core:jackson-core:2.18.0")
//	implementation ("com.fasterxml.jackson.core:jackson-annotations:2.18.0")

}







