// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mkurz/namespace-reverse-router-bug/conf/routes
// @DATE:Mon Mar 30 12:51:53 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package router._root_.controllers.javascript {

  // @LINE:1
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "router._root_.controllers.Assets.versioned",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }


}
