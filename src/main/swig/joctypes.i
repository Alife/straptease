//use jocstrap Pointers for void *
%typemap(jstype) void * "joc.Pointer<?>"
%typemap(javain) void * "PointerSWIG.getAddress($javainput)"
%typemap(javaout) void * {
    return new joc.Pointer<Object>($jnicall);
  }
  
%define JAVATYPE(swig_type,joc_type)
%typemap(jstype) swig_type * "joc.Pointer<joc_type>"
%typemap(javain) swig_type * "PointerSWIG.getAddress($javainput)"
%typemap(javaout) swig_type * {
    return new joc.Pointer<joc_type>($jnicall);
  }
  
%typemap(jstype) swig_type [] "joc.Pointer<joc_type>"
%typemap(javain) swig_type [] "PointerSWIG.getAddress($javainput)"
%typemap(javaout) swig_type [] {
    return new joc.Pointer<joc_type>($jnicall);
  }
  
%typemap(jstype) swig_type [ANY] "joc.Pointer<joc_type>"
%typemap(javain) swig_type [ANY] "PointerSWIG.getAddress($javainput)"
%typemap(javaout) swig_type [ANY] {
    return new joc.Pointer<joc_type>($jnicall);
  }
%enddef

//Primitive Arrays/Pointers
JAVATYPE(byte, Byte)
JAVATYPE(short, Short)
JAVATYPE(int, Integer)
JAVATYPE(long, Long)
JAVATYPE(double, Double)
JAVATYPE(float, Float)


%define JOCTYPE(swig_type,joc_type)
%ignore swig_type ;
%typemap(jstype) swig_type "joc.Pointer<joc_type>"
%typemap(javain) swig_type "PointerSWIG.getAddress($javainput)"
%typemap(javaout) swig_type {
	return new joc.Pointer<joc_type> ($jnicall);
  }

%typemap(jstype) const swig_type "joc.Pointer<joc_type>"
%typemap(javain) const swig_type "PointerSWIG.getAddress($javainput)"
%typemap(javaout) const swig_type {
	return new joc.Pointer<joc_type>($jnicall);
  }

%typemap(jstype) swig_type * "joc.Pointer<joc_type>"
%typemap(javain) swig_type * "PointerSWIG.getAddress($javainput)"
%typemap(javaout) swig_type * {
	return new joc.Pointer<joc_type> ($jnicall);
  }

%typemap(jstype) swig_type [] "joc.Pointer<joc_type>"
%typemap(javain) swig_type [] "PointerSWIG.getAddress($javainput)"
%typemap(javaout) swig_type [] {
	return new joc.Pointer<joc_type> ($jnicall);
  }
%enddef

//CoreFoundation
JOCTYPE(CFURLRef, obc.__CFURL)
JOCTYPE(CFArrayRef, obc.__CFArray)
JOCTYPE(CFDataRef, obc.__CFData)
JOCTYPE(CFDictionaryRef, obc.__CFDictionary)
JOCTYPE(CFStringRef, obc.__CFString)

//CoreGraphics
JOCTYPE(CGColorRef, obc.CGColor)
JOCTYPE(CGColorSpaceRef, obc.CGColorSpace)
JOCTYPE(CGPoint, obc.CGPoint)
JOCTYPE(CGRect, obc.CGRect)
JOCTYPE(CGSize, obc.CGSize)
JOCTYPE(CGContextRef, obc.CGContext)
JOCTYPE(CGImageRef, obc.CGImage)
JOCTYPE(CGAffineTransform, obc.CGAffineTransform)
JOCTYPE(CGPathRef, obc.CGPath)
JOCTYPE(CGShadingRef, obc.CGShading)
JOCTYPE(CGPDFDocumentRef, obc.CGPDFDocument)
JOCTYPE(CGPDFPageRef, obc.CGPDFPage)


 typedef float CGFloat;
 typedef int uint32_t;
 typedef byte uint8_t;
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
 