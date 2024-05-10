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
//    gitParameter branchFilter: 'origin/(.*)', defaultValue: 'master', name: 'BRANCH', type: 'PT_BRANCH'
    agent any
    stages {
        stage('Test run') {
            steps {
//                echo "Test Echo!${params.branchName}"
                echo "Test Echo!"
                sh 'mvn clean test'
            }
        }
    }
}