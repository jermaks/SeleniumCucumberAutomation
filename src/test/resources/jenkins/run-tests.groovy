package jenkins

import groovy.transform.Field

@Field
def String branch = 'master'

pipeline {
    parameters {
        choice(
            name: 'branch',
            choices: ['master', 'cucumber', 'both'])
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