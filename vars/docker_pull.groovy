def call(String credId, String imageName) {
  withCredentials([usernamePassword(credentialsId: credId,passwordVariable: 'dockerHubPass',usernameVariable: 'dockerHubUser')]) {

    sh "docker login -u $dockerHubUser -p $dockerHubPass"
    sh "docker image tag ${imageName} ${dockerHubUser}/${imageName}"
    sh "docker image pull ${dockerHubUser}/${fullimageName}:latest"
  }
}
