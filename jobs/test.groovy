freestyleJob('MyJob') {
    description('This is a freestyle job created with Job DSL')
    
    steps {
        shell('echo "Stage: Build"')
        shell('echo "Stage: Test"')
        shell('echo "Stage: Deploy"')
    }
}