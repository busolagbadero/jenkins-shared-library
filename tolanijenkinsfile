#!/usr/bin/env groovy
@Library('jenkins-shared-library')
def gv
pipeline {
    agent any
    tools {
        maven 'maven-b'
    }

    stages {

        stage('init') {
            steps {
                script {
                    gv = load "script.groovy"
                }
                echo 'loading groovy script'
                
            }
        }
        stage('Build Jar') {
            steps {
                script {
                    buildJar()
                    gv.buildJar()
                }             
            }
        }

        stage('Build Image') {
            steps {
                script {
                    buildImage()
                }
            }
        }
    }

    post {
        always {
            echo 'This will always run, regardless of the pipeline result.'
        }

        success {
            echo 'The pipeline has succeeded!'
        }

        failure {
            echo 'The pipeline has failed.'
        }
    }
}
