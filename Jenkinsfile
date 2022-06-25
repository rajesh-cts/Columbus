pipeline {
    agent {label 'Win1'} 
      tools {
    maven 'maven-3.8.2' 
  }
    stages {
    	stage('Initialize'){
            steps{
                echo "PATH = ${MAVEN_HOME}/bin:${PATH}"
                echo "MAVEN_HOME = /opt/maven"
            }
        }
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'a65b3bdc-5075-42d3-a05b-06ccc061749a', url: 'https://github.com/rajesh-cts/columbus.git']]])
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install test'
            }
        }
    }
}
