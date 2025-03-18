pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'echo "Stage: Build"'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh 'echo "Stage: Test"'
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    sh 'echo "Stage: Deploy"'
                }
            }
        }
    }
}

