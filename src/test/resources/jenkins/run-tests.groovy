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
    node {
        git branch: "${params.branchName}", url: 'https://github.com/jermaks/SeleniumCucumberAutomation.git/'
    }
    stages {
        stage('Build') {
            steps {
                echo "Test Echo!"
                sh 'mvn clean test'
            }
        }
    }
}