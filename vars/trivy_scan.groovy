def call(){
    sh "trivy fs --exit-code 0 ."
}
