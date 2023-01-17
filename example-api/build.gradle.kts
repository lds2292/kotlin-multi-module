dependencies{
    implementation(project(":example-domain"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.getByName("bootJar"){
    enabled = true
}

