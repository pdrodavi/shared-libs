def call(){
    git(branch: "main", credentialsId: 'github-token', url: "https://github.com/pdrodavi/app-quarkus-job-deploy.git")
}
