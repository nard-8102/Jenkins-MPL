/**
 * Checkout for the current SCM

checkout scm
*/
@Library('mpl@main') _

node {
    def checkoutModule = load "checkout.groovy"
    checkoutModule.call(url: 'https://github.com/naiveskill/devops.git', branch: 'main')
}