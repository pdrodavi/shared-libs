def call(){

    inputBranch = input([
        message: 'Input branch',
        parameters: [
            string(name: 'Input branch')
        ]
    ])

    echo "Branch selecionada: ${inputBranch}"
    echo "Clonando repositório: https://gitlab.com/srvextechnology/app-job-deploy-push-registry.git"

    git(branch: "${inputBranch}", credentialsId: 'GITLAB-USER-SRVEX', url: "https://gitlab.com/srvextechnology/app-job-deploy-push-registry.git")

}