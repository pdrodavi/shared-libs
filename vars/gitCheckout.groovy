def call(){

    inputBranch = input([
        message: 'Input branch',
        parameters: [
            string(name: 'Input branch')
        ]
    ])

    echo "Branch selecionada: ${inputBranch}"
    echo "Clonando repositório: https://gitlab.com/pedrodavi/app-job-deploy-sb.git"

    git(branch: "${inputBranch}", credentialsId: 'gitlab-token', url: "https://gitlab.com/pedrodavi/app-job-deploy-sb.git")

}
