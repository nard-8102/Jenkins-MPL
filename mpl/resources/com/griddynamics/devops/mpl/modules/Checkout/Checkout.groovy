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

git url: CFG.'https://github.com/naiveskill/devops.git',
    branch: CFG.'main',
    credentialsId: CFG.'git.credentials'
