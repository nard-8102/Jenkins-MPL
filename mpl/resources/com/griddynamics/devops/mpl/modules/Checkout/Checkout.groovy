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
*/
@Library('mpl@main') _
def variables = load "k8s_variables.groovy"

git url: CFG.${k8s_variables.url},
  branch: CFG.${k8s_variables.branch},
  credentialsId: CFG.${k8s_variables.credentialsId}
echo "url:${k8s_variables.url}"