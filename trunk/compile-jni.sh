#!/bin/bash

cd target/swig/c

export SDK=/Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS2.0.sdk

#compile:
/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/arm-apple-darwin9-gcc-4.0.1 -c CoreGraphics.c -c OpenGLES.c -c OpenAL.c -isysroot $SDK -I /sw/include

#link:
/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/libtool -dynamic -framework CoreGraphics -framework UIKit -framework OpenGLES -framework OpenAL -lgcc_s.1 -lSystem -o libstraptease.jnilib CoreGraphics.o OpenGLES.o OpenAL.o -v -syslibroot $SDK

#sign:
platform=/Developer/Platforms/iPhoneOS.platform
allocate=${platform}/Developer/usr/bin/codesign_allocate
export CODESIGN_ALLOCATE=${allocate}
codesign -vfs "Atoro Code Signing" libstraptease.jnilib
