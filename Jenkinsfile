pipeline {
    agent any

 //   tools {
        // Install the Maven version configured as "M3" and add it to the path.
 //       maven "M3"
//    }

    environment {
        EMAIL_TO = 'faten.benguirat@insat.ucar.tn'
        registry='fatenguirat/devops_project'
        registryCredential='dockerhub'
        dockerImage=''
    }

    stages
    {
        stage('Git') {
            steps{
                // Get code from GitHub
                git branch: 'faten', url: 'https://github.com/Fatou99/DevopsProject.git'
            }

        }
        stage('Maven_clean') {
            steps {
                // mvn clean
                 bat "mvn clean"
            }

        }
        stage('Maven_compile') {
            steps {
                //mvn compile
                bat "mvn compile"
            }
        }
        stage('JUnit') {
            steps {
                //mvn test
                bat "mvn test"
            }
        }
        stage('Sonar') {
            steps {
                //mvn sonar
                bat "mvn sonar:sonar -Dsonar.login=e999eb35ace0a2c274d8ab3f6876103e16783d4d -Dsonar.host.url=http://localhost:9000/ -Dsonar.projectKey=DevopsProject"
            }
        }
        stage('Package') {
            steps {
                //mvn deploy
                bat "mvn clean package"
            }
        }
        stage('Nexus') {
            steps {
                //mvn deploy
                bat "mvn deploy -DskipTests"
            }
        }
        stage('Image building'){
            steps{
                //building the docker image
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                        }
            }
        }
        stage('Deploy Image') {
            steps{
                //logging in and pushing image to docker hub
                script {
                    docker.withRegistry( '', registryCredential ) {
                    dockerImage.push()
      }
    }
  }
}
    }
}
