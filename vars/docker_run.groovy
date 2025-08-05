def call(String dockerHubUser, String port, String ImageName, String imageTag) { 
    sh "docker run -d -p ${port} ${dockerHubUser}/${ImageName}:${imageTag}" 
}
