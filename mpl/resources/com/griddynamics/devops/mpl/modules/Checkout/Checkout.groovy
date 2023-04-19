@Library('mpl') _

def variables = load "checkout.groovy"

def scm = [
    $class: 'GitSCM',
    userRemoteConfigs: [[url: 'https://github.com/naiveskill/devops.git']],
    branches: [[name: "*/${main}"]]
]

load "checkout.groovy"
checkout.call(scm)
