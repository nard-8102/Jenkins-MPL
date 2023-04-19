/**
 * Common checkout module
 */

if( CFG.'git.url' )
  echo "Module Checkout"
  MPLModule('Git Checkout', CFG)
else
  MPLModule('Default Checkout', CFG)
