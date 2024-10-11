pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                dir('/Users/nhan.hoang/Documents/nhanhoanganh-katalon-cert'){
                    sh 'docker run -t --rm -v "$(pwd)":/tmp/project katalonstudio/katalon:9-latest-slim katalonc.sh -projectPath=/tmp/project -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/TS_02" -orgID=1655112 -testOpsProjectId=1631721 -apiKey="9706-225fec0f35fb"'
                }
            }
        }
    }
}
