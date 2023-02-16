def call() {
  withDockerRegistry(credentialsId: 'JFROG-PLATAFORM', url: 'https://srvextechnology.jfrog.io/artifactory/registry-docker/') {
    sh "docker tag ${env.JOB_BASE_NAME} srvextechnology.jfrog.io/registry-docker/${env.JOB_BASE_NAME}:latest"
    sh "docker push srvextechnology.jfrog.io/registry-docker/${env.JOB_BASE_NAME}:latest"
  }
}