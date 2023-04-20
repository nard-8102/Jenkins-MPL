/**
 * Checkout for the current SCM

checkout scm
*/
// @Library('mpl@main') _
def branch = 'main'
def url = 'https://github.com/naiveskill/devops.git'

node {
    // def checkoutModule = load "checkout.groovy"
    // def checkoutModule = load "${WORKSPACE}/vars/checkout.groovy"
    // checkoutModule.call(url: 'https://github.com/naiveskill/devops.git', branch: 'main')
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: "${url}"]]
    ])
}