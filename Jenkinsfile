pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                dir('/Users/nhan.hoang/Documents/nhanhoanganh-katalon-cert'){
                    sh 'docker run -t --rm -v "$(pwd)":/tmp/project katalonstudio/katalon katalonc.sh -projectPath=/tmp/project -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/TS_03" -orgID=1655112 -testOpsProjectId=1631721 -apiKey="37bb3e8b-0142-48db-9706-225fec0f35fb"'
                }
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'Reports/**/*.*', fingerprint: true
            junit 'Reports/**/JUnit_Report.xml'
        }
    }
}
