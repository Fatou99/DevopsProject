def pushToNexus() {
    echo "pushing the jar file to Nexus maven-snapshots repo..."
    bat 'mvn clean package -D maven.test.skip=true deploy:deploy-file -D groupId=com.example -D artifactId=DevOpsProject -D version=3.0.0 -D packaging=jar -D repositoryId=deploymentRepo -D url=http://localhost:8081/repository/maven-releases/ -D file=target/DevOpsProjects-0.0.1-SNAPSHOT.jar'

}

def sonarScan() {
    echo "Run sonarQube scan..."
    bat "mvn clean verify sonar:sonar -D sonar.projectKey=pipeline -D maven.test.skip=true  -D sonar.login=sqp_c412d6bb7ea105e99df221b0a1fe27f6d265959a"
}

return this