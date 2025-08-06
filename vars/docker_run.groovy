def call(String port, String imageNameWithUser, String imageTag) {
    sh "docker run -d -p ${port} ${imageNameWithUser}:${imageTag}"
}
