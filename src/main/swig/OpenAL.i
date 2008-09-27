 /* example.i */
 %module OpenAL
 %{
 /* Put header files here or function declarations like below */
 #include <jni.h>
 #include <OpenAL/al.h>
 #include <OpenAL/alc.h>

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

%include <al.h>
%include <alc.h>
//%include <OpenGLES/eglplatform.h>
//%include <OpenGLES/egl.h>

