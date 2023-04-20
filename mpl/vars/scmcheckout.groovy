def branch = 'main'
def url = 'https://github.com/naiveskill/devops.git'

def call(String url, String branch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: "${url}"]]
    ])
}