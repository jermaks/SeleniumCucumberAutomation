package jenkins

import groovy.transform.Field

@Field
def String branchName = 'master'

pipeline {
//    parameters {
//        choice(
//            name: 'branchName',
//            choices: ['master', 'cucumber'])
//    }
    parameters {
        gitParameter branchFilter: 'origin/(.*)', defaultValue: 'master', name: 'BRANCH', type: 'PT_BRANCH'
    }
    agent any
    stages {
        stage('Build') {
            steps {
                git branch: "${params.BRANCH}", url: "https://github.com/jermaks/SeleniumCucumberAutomation.git/"
                echo "Test Echo! ${params.BRANCH}"
                sh 'mvn clean test'
            }
        }
    }
}