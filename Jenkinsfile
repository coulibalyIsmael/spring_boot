pipeline {
    agent any
    stages {
        dir("./maven_learning") {
            stage("Build stage") {
                steps {
                    sh 'mvn clean compile'
                }
            }
        }

        dir("./maven_learning") {
            stage("Test stage") {
                steps {
                    sh 'mvn test'
                }
            }
        }

        dir("./maven_learning") {
            stage("Package stage") {
                steps {
                    sh 'mvn package jar:jar'
                }
            }
        }
    }
}