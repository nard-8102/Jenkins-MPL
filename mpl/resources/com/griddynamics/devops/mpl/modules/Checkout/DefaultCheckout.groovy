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

branch = 'main'
url = 'https://github.com/naiveskill/devops.git'

scmcheckout(url, branch)

echo "branch: ${branch}"
echo "branch: ${url}"