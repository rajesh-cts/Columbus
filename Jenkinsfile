pipeline {
    agent {label 'Win1'} 
     tools {
        maven 'Maven 3.3.9'
        jdk 'jdk-17.0.3.1'
    }
    stages {
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
