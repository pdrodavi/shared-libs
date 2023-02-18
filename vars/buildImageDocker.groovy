def call() {
  echo "Criando a imagem Docker"
  sh "docker build -f src/main/docker/Dockerfile.native -t quarkus/first-crud ."
}
