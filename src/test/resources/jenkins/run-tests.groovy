package jenkins

import groovy.transform.Field

@Field
def String branch = 'master'

pipeline {
    parameters {
        choice(
                name: 'branch',
                choices: ['master', 'cucumber'],
                description: 'branch: master - testng, cucumber - junit, cucumber')
    }
    agent any
    stages {
        stage('Scm checkout') {
            steps {
                echo "Pulling changes from branch - ${params.branch}"
                script {
                    git url: 'https://github.com/jermaks/SeleniumCucumberAutomation.git/', branch: "${params.branch}"
                }
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('Test run') {
            steps {
                sh 'mvn test'
            }
        }
    }
}