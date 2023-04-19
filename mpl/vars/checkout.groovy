def call(Map configMap) {
  def scmVars = [:]
  def scm = configMap['scm']
  scmVars.url = scm.url
  scmVars.branch = scm.branch

  // Define the checkout step with the specified Git URL and branch
  checkout([$class: 'GitSCM', 
            branches: [[name: "*/${scmVars.branch}"]], 
            userRemoteConfigs: [[url: scmVars.url]]])

  // Return the SCM variables
  echo "scmVars: ${scmVars}"
  return scmVars
}