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

git url: CFG.${k8s_variables.url},
branch: CFG.${k8s_variables.branch},
credentialsId: CFG.${k8s_variables.credentialsId}
echo "url:${k8s_variables.url}"