/**
 * Common checkout module
if( CFG.'git.url' ) {
  echo "Module Checkout"
  MPLModule('Git Checkout', CFG)
}
else {
  echo "CheckOut Defalut"
  MPLModule('Default Checkout', CFG)
}

checkout ([
  $class: "GitSCM"
  branch: [[name: "${k8s_variables.branch}"]]
  userRemoteConfigs: [[url: "${k8s_variables.url}"]]

])
*/
@Library('mpl@main') _
def variables = load "k8s_variables.groovy"

echo "url:${k8s_variables.url}"