#!/usr/bin/env groovy
def call() {
    echo "Building jar with $BRANCH_NAME..."
    sh 'mvn package'
}
