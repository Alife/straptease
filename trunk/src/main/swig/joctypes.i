//use jocstrap Pointers for void *
%typemap(jstype) void * "joc.Pointer<?>"
%typemap(javain) void * "PointerSWIG.getAddress($javainput)"
%typemap(javaout) void * {
    return new joc.Pointer<Object>($jnicall);
  }
  
//use jocstrap Pointers for float *
%typemap(jstype) float * "joc.Pointer<Float>"
%typemap(javain) float * "PointerSWIG.getAddress($javainput)"
%typemap(javaout) float * {
    return new joc.Pointer<Float>($jnicall);
  }


//disabled usage of joc.* Objects, since boxing and unboxing does not work currently
/*  
//use jocstrap CGContext
%typemap(jstype) CGContextRef "joc.Pointer<obc.CGContext>"
%typemap(javain) CGContextRef "PointerSWIG.getAddress($javainput)"
%typemap(javaout) CGContextRef {
    return new joc.Pointer<obc.CGContext>($jnicall);
  }
  
//use jocstrap CGImage
%typemap(jstype) CGImageRef "joc.Pointer<obc.CGImage>"
%typemap(javain) CGImageRef "PointerSWIG.getAddress($javainput)"
%typemap(javaout) CGImageRef {
    return new joc.Pointer<obc.CGImage>($jnicall);
  }

//use jocstrap CGColorSpace
%typemap(jstype) CGColorSpaceRef "joc.Pointer<obc.CGColorSpace>"
%typemap(javain) CGColorSpaceRef "PointerSWIG.getAddress($javainput)"
%typemap(javaout) CGColorSpaceRef {
    return new joc.Pointer<obc.CGColorSpace>($jnicall);
  }
 
//use jocstrap CGRect
%ignore CGRect;
%typemap(jstype) CGRect "obc.CGRect"
%typemap(javain) CGRect "PointerSWIG.getAddress($javainput)"
%typemap(javaout) CGRect {
	obc.CGRect tempRect=new obc.CGRect();
	tempRect.unbox(new joc.Pointer<obc.CGRect>($jnicall));
    return tempRect;
  }

//use jocstrap CGSize
%ignore CGSize;
%typemap(jstype) CGSize "obc.CGSize"
%typemap(javain) CGSize "PointerSWIG.getAddress($javainput)"
%typemap(javaout) CGSize {
	obc.CGSize tempSize=new obc.CGSize();
	tempSize.unbox(new joc.Pointer<obc.CGSize>($jnicall));
    return tempSize;
  }
  
%typemap(jstype) const CGSize "obc.CGSize"
%typemap(javain) const CGSize "PointerSWIG.getAddress($javainput)"
%typemap(javaout) const CGSize {
	obc.CGSize tempSize=new obc.CGSize();
	tempSize.unbox(new joc.Pointer<obc.CGSize>($jnicall));
    return tempSize;
  }
  
  
 //use jocstrap CGPoint
%ignore CGPoint;
%typemap(jstype) CGPoint "obc.CGPoint"
%typemap(javain) CGPoint "PointerSWIG.getAddress($javainput)"
%typemap(javaout) CGPoint {
	obc.CGPoint tempPoint=new obc.CGPoint();
	tempPoint.unbox(new joc.Pointer<obc.CGPoint>($jnicall));
    return tempPoint;
  }
  
 //use jocstrap CGAffineTransform
%ignore CGAffineTransform;
%typemap(jstype) CGAffineTransform "obc.CGAffineTransform"
%typemap(javain) CGAffineTransform "PointerSWIG.getAddress($javainput)"
%typemap(javaout) CGAffineTransform {
	obc.CGAffineTransform tempAffineTransform=new obc.CGAffineTransform();
	tempAffineTransform.unbox(new joc.Pointer<obc.CGAffineTransform>($jnicall));
    return tempAffineTransform;
  }
 */
   
 typedef float CGFloat;
 typedef int uint32_t;
// #define CG_EXTERN extern
// #define CG_INLINE inline
 #define CG_EXTERN_C_BEGIN
 #define CG_EXTERN_C_END
 
 #define AVAILABLE_MAC_OS_X_VERSION_10_1_AND_LATER
 #define AVAILABLE_MAC_OS_X_VERSION_10_2_AND_LATER
 #define AVAILABLE_MAC_OS_X_VERSION_10_3_AND_LATER
 #define AVAILABLE_MAC_OS_X_VERSION_10_4_AND_LATER
 #define AVAILABLE_MAC_OS_X_VERSION_10_5_AND_LATER
 
 #define DEPRECATED_IN_MAC_OS_X_VERSION_10_1_AND_LATER
 #define DEPRECATED_IN_MAC_OS_X_VERSION_10_2_AND_LATER
 #define DEPRECATED_IN_MAC_OS_X_VERSION_10_3_AND_LATER
 #define DEPRECATED_IN_MAC_OS_X_VERSION_10_4_AND_LATER
 #define DEPRECATED_IN_MAC_OS_X_VERSION_10_5_AND_LATER
 
#undef CG_AVAILABLE_STARTING
#define CG_AVAILABLE_STARTING(__MAC_10_0, __IPHONE_2_0)
#undef CG_AVAILABLE_BUT_DEPRECATED
#define CG_AVAILABLE_BUT_DEPRECATED(__MAC_10_0, __MAC_10_5, __IPHONE_NA, __IPHONE_NA);
 