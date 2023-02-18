def call() {
  sh "docker run -i --rm --memory=256MB --memory-reservation=256MB --network=bridge --restart=always --publish-all ${env.JOB_BASE_NAME}"
  cleanWs()
}
