def call(String credId, String fullImageName) {
  withCredentials([usernamePassword(credentialsId: credId, usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]) {
    sh "docker login -u $dockerHubUser -p $dockerHubPass"
    sh "docker image pull ${fullImageName}:latest"
    // Only tag if needed (optional below)
    // sh "docker image tag ${fullImageName}:latest notes-app:latest"
  }
}
