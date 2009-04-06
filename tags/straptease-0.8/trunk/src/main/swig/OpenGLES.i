 /* example.i */
 %module OpenGLES
 %{
 /* Put header files here or function declarations like below */
 #include <jni.h>
 #include <OpenGLES/ES1/gl.h>
 #include <OpenGLES/ES1/glext.h>

 #include <CoreSurface/CoreSurface.h>
 
 #include <OpenGLES/eglplatform.h>
 #include <OpenGLES/egl.h>
 
 %}
 
 %pragma(java) jniclasscode=%{
  static {
    try {
        System.loadLibrary("straptease");
    } catch (UnsatisfiedLinkError e) {
      throw new RuntimeException(e);
    }
  }
%}
 
 %include "enumtypeunsafe.swg"
 %javaconst(1);
 
%include "joctypes.i"

%include <gl.h>
%include <glext.h>

%include <eglplatform.h>
%include <egl.h>

