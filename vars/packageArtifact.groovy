def call() {
  echo "Realizando construção do artefato"
  sh "mvn package -Pnative -Dquarkus.native.container-build=true"
}
