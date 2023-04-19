def call(Map configMap) {
  def url = configMap['url']
  def branch = configMap['branch']
  checkout([
    $class: 'GitSCM',
    branches: [[name: "*/${branch}"]],
    userRemoteConfigs: [[url: "${url}"]]
  ])
}