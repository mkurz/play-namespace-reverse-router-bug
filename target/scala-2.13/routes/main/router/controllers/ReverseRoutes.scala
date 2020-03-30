// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mkurz/namespace-reverse-router-bug/conf/routes
// @DATE:Mon Mar 30 12:49:33 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package router.controllers {

  // @LINE:1
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
