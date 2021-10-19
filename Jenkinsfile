pipeline {
    agent any
    stages {

        stage('Build stage') {
            dir('./maven_learning') {
                steps {
                    sh 'mvn clean compile'
                }
            }
        }


        stage('Test stage') {
            dir('./maven_learning') {
                steps {
                    sh 'mvn test'
                }
            }

        }


        stage('Package stage') {
            dir('./maven_learning') {
                steps {
                    sh 'mvn package jar:jar'
                }
            }
        }

    }
}