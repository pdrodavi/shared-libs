def call() {
  echo "Criando a imagem Docker"
  sh "docker build -f src/main/docker/Dockerfile.jvm -t quarkus/first-crud-jvm ."
}
