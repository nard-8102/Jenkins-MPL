/**
 * Checkout for the current SCM

checkout scm
*/
/*@Library('mpl@main')

def branch = 'main'
def url = 'https://github.com/naiveskill/devops.git'

node {
    def checkoutModule = load "scmcheckout.groovy"
    checkoutModule.call(url: url, branch: branch)
}
*/

def branch = 'main'
def url = 'https://github.com/naiveskill/devops.git'

def checkout = load "scmcheckout.groovy"
checkout.scmcheckout(url, branch)

echo "branch: ${branch}"
echo "branch: ${url}"