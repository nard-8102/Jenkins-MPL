class Checkout {
  static def execute(configMap) {
    def gitUrl = configMap['https://github.com/naiveskill/devops.git']
    def branch = configMap['main']
    def credentialsId = configMap['nard8102@hotmail.com']

    return GitStep([$class: 'GitSCM', 
                    branches: [[name: branch]], 
                    userRemoteConfigs: [[url: gitUrl, credentialsId: credentialsId]]])
  }
}