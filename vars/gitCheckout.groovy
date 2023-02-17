def call(){

    inputBranch = input([
        message: 'Input branch',
        parameters: [
            string(name: 'Input branch')
        ]
    ])

    echo "Branch selecionada: ${inputBranch}"
    echo "Clonando repositório: https://github.com/pdrodavi/app-job-deploy-sb.git"

    git(branch: "${inputBranch}", credentialsId: 'github-token', url: "https://github.com/pdrodavi/app-job-deploy-sb.git")

}
