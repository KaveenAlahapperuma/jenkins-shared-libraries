def call(){
    try {
        sh "trivy fs --exit-code 0 ."
    } catch (Exception e) {
        echo "Trivy scan reported vulnerabilities or warnings, but continuing pipeline..."
    }
}
