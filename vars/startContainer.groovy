def call() {
  sh "docker run -i --rm --network=bridge --restart=always --publish-all quarkus/first-crud-jvm"
  cleanWs()
}
