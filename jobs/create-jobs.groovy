
// Create a simple Freestyle job
job('example-freestyle-job') {
    description('A simple freestyle job created using Job DSL.')
    steps {
        shell('echo "Hello from the freestyle job!"')
    }
}

// Create a Pipeline job
pipelineJob('example-pipeline-job') {
    description('A simple pipeline job created using Job DSL.')
    definition {
        cps {
            script("""
            pipeline {
                agent any
                stages {
                    stage('Build') {
                        steps {
                            echo 'Building...'
                        }
                    }
                    stage('Test') {
                        steps {
                            echo 'Testing...'
                        }
                    }
                    stage('Deploy') {
                        steps {
                            echo 'Deploying...'
                        }
                    }
                }
            }
            """)
        }
    }
}

