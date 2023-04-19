@Library('mpl') _

node {
    def checkoutModule = load "checkout.groovy"
    checkoutModule.call(url: 'https://github.com/naiveskill/devops.git', branch: 'main')
}