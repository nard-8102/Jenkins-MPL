

def call(String url, String branch) {
    def branch = 'main'
    def url = 'https://github.com/naiveskill/devops.git'

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: "${url}"]]
    ])
}