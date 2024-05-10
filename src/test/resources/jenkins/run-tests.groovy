package jenkins

import groovy.transform.Field

@Field
def String branchName = 'master'

pipeline {
    parameters {
        choice(
            name: 'branchName',
            choices: ['master', 'cucumber'])
    }
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Test Echo!"
                sh 'mvn clean test'
            }
        }
    }
}