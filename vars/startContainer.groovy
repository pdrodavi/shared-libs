def call() {
  try {
    sh "docker container stop ${env.JOB_BASE_NAME}"
    sh "docker container rm -f ${env.JOB_BASE_NAME}"
  } catch (err) {
    echo err.getMessage()
  }

  sh "docker container create --name=${env.JOB_BASE_NAME} --memory=256MB --memory-reservation=256MB --network=nginx-proxy_default --env-file=${env.WORKSPACE}/.env --restart=always --publish-all srvextechnology.jfrog.io/registry-docker/${env.JOB_BASE_NAME}:latest"

  sh "docker container start ${env.JOB_BASE_NAME}"
  cleanWs()
}