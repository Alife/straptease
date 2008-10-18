 /* example.i */
 %module SystemConfiguration
 %{
 /* Put header files here or function declarations like below */
 #include <jni.h>
 #include <SystemConfiguration/SystemConfiguration.h>
 
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

%include <SystemConfiguration.h>
 
/* SCDynamicStore APIs */
%include <SCDynamicStore.h>
//%include <SCDynamicStoreKey.h>
//%include <SCDynamicStoreCopySpecific.h>

/* SCPreferences APIs */
%include <SCPreferences.h>
//%include <SCPreferencesPath.h>
//%include <SCPreferencesSetSpecific.h>

/* Schema Definitions (for SCDynamicStore and SCPreferences) */
%include <SCSchemaDefinitions.h>

/* SCNetworkConfiguration APIs */
//%include <SCNetworkConfiguration.h>

/* SCNetworkReachability and SCNetworkConnection APIs */
%include <SCNetwork.h>
%include <SCNetworkReachability.h>
%include <SCNetworkConnection.h>
