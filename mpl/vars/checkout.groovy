// vars/checkout.groovy
def call(Map configMap) {
    def scm = configMap['scm']
    checkout([
        $class: 'GitSCM',
        branches: scm.branches,
        userRemoteConfigs: scm.userRemoteConfigs,
    ])
}