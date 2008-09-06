 /* example.i */
 %module CoreGraphics
 %{
 /* Put header files here or function declarations like below */
 #include <jni.h>
 #include <CoreGraphics/CoreGraphics.h>
 
 extern CGContextRef UIGraphicsGetCurrentContext(void);
 
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
 
%include <CoreGraphics/CGBase.h>

%include <CoreGraphics/CGAffineTransform.h>
%include <CoreGraphics/CGBitmapContext.h>
%include <CoreGraphics/CGColor.h>
%include <CoreGraphics/CGColorSpace.h>
%include <CoreGraphics/CGContext.h>
%include <CoreGraphics/CGDataConsumer.h>
%include <CoreGraphics/CGDataProvider.h>
%include <CoreGraphics/CGError.h>
%include <CoreGraphics/CGFont.h>
%include <CoreGraphics/CGFunction.h>
%include <CoreGraphics/CGGeometry.h>
//%include <CoreGraphics/CGGradient.h>
%include <CoreGraphics/CGImage.h>
%include <CoreGraphics/CGLayer.h>
%include <CoreGraphics/CGPDFArray.h>
%include <CoreGraphics/CGPDFContentStream.h>
//%include <CoreGraphics/CGPDFContext.h>
%include <CoreGraphics/CGPDFDictionary.h>
%include <CoreGraphics/CGPDFDocument.h>
%include <CoreGraphics/CGPDFObject.h>
%include <CoreGraphics/CGPDFOperatorTable.h>
%include <CoreGraphics/CGPDFPage.h>
//%include <CoreGraphics/CGPDFScanner.h>
%include <CoreGraphics/CGPDFStream.h>
%include <CoreGraphics/CGPDFString.h>
%include <CoreGraphics/CGPath.h>
%include <CoreGraphics/CGPattern.h>
%include <CoreGraphics/CGShading.h>


//this is not CoreGrahics, but UIKit, its here for convenience reasons only
CGContextRef UIGraphicsGetCurrentContext (
   void
);