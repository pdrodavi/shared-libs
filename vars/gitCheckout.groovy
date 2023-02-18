def call(){

    inputRepo = input([
        message: 'Input Repository',
        parameters: [
            string(name: 'Input Url Repository Git')
        ]
    ])
    
    inputBranch = input([
        message: 'Input branch',
        parameters: [
            string(name: 'Input branch')
        ]
    ])

    echo "Branch selecionada: ${inputBranch}"
    echo "Clonando repositório: ${inputRepo}"

    git(branch: "${inputBranch}", credentialsId: 'github-token', url: "${inputRepo}")

}
