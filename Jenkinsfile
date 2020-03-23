pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'set path="C:\apache-maven-3.6.3\bin"'
                bat 'mvn clean compile'
            }
        }
        
    }
}
