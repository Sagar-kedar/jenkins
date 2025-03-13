freeStyleJob('my-freestyle-job') {
    description('This is a sample freestyle job')

    // Configure job tasks
    steps {
        shell('echo "Hello, world!"')
    }
