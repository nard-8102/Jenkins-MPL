/**
 * Checkout for the current SCM

checkout scm
*/
@Library('mpl@main') _

def branch = 'main'
def url = 'https://github.com/naiveskill/devops.git'

node {
    def checkoutModule = load "scmcheckout.groovy"
    checkoutModule.call(url: url, branch: branch)
}
