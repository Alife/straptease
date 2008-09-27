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
 
%include <CGBase.h>

 %include "joctypes.i"

%include <CGAffineTransform.h>
%include <CGBitmapContext.h>
%include <CGColor.h>
%include <CGColorSpace.h>
%include <CGContext.h>
%include <CGDataConsumer.h>
%include <CGDataProvider.h>
%include <CGError.h>
%include <CGFont.h>
%include <CGFunction.h>
%include <CGGeometry.h>
%include <CGGradient.h>
%include <CGImage.h>
%include <CGLayer.h>
%include <CGPDFArray.h>
%include <CGPDFContentStream.h>
%include <CGPDFContext.h>
%include <CGPDFDictionary.h>
%include <CGPDFDocument.h>
%include <CGPDFObject.h>
%include <CGPDFOperatorTable.h>
%include <CGPDFPage.h>
//%include <CGPDFScanner.h>
%include <CGPDFStream.h>
%include <CGPDFString.h>
%include <CGPath.h>
%include <CGPattern.h>
%include <CGShading.h>


//this is not CoreGrahics, but UIKit, its here for convenience reasons only
CGContextRef UIGraphicsGetCurrentContext (
   void
);