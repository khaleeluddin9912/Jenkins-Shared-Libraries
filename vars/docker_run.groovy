def call(String dockerHubUser, String ImageName, String imageTag) {
    sh "docker run -d ${dockerHubUser}/${ImageName}:${imageTag}"
}
