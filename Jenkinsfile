pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'hxtome', url: 'git@github.com:hxtoyou/demo3.git']]])
            }
        }
        stage('build code') {
            steps {
               sh 'mvn clean package'
            }
        }
        stage('publish code') {
            steps {
              sh '''cd /var/lib/jenkins/workspace/web_demo_freestyle/target
java -jar demo3-0.0.1-SNAPSHOT.jar --service.name=demo3 --service.port=8080'''
            }
        }
    }
}
