job('MyPipelineJob') {
    description('This is a pipeline job created with Job DSL')
    steps {
        // Add the pipeline script here if you want to embed it in Job DSL
        pipelineScript("""
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
        """)
    }
}

