def call(Map configMap) {
  // Define the checkout step with the specified Git URL and branch
  checkout([$class: 'GitSCM', 
            branches: 'main', 
            userRemoteConfigs: 'https://github.com/naiveskill/devops.git' ])

  // Return the SCM variables
  echo "scmVars: ${scmVars}"
  return scmVars
}