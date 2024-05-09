package jenkins

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Test Echo!"
                sh 'mvn test -PREGRESSION'
                sh 'mvn test -PSMOKE'
            }
        }
    }
}