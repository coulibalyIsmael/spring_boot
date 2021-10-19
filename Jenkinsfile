pipeline {
    agent any
    stages {

        stage('Build stage') {
            steps {
                dir('./maven_learning') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Test stage') {
            steps {
                dir('./maven_learning') {
                    sh 'mvn test'
                }
            }
        }


        stage('Package stage') {
            steps {
                dir('./maven_learning') {
                    sh 'mvn package jar:jar'
                }
            }
        }

    }
}