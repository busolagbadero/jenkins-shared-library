
def call() {

    echo 'Building Image...'
    withCredentials([usernamePassword(credentialsId: 'docker-hub-cred', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh 'docker build -t gbaderobusola/busola:tolani-1.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push gbaderobusola/busola:tolani-1.0'
        }
}
