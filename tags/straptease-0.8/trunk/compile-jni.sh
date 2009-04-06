#!/bin/bash

export SDK=/Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS2.2.sdk

#compile:
#cd src/main/objectivec
/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/arm-apple-darwin9-gcc-4.0.1 -gfull -ObjC -c src/main/objectivec/EAGLView.m -isysroot $SDK -I /sw/include -o target/swig/c/EAGLView.o

cd target/swig/c
#/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/arm-apple-darwin9-gcc-4.0.1 -gfull -ObjC -c CoreGraphics.c -isysroot $SDK -I /sw/include
/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/arm-apple-darwin9-gcc-4.0.1 -gfull -ObjC -c OpenGLES.c -isysroot $SDK -I /sw/include -I ../../../src/main/headers
#/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/arm-apple-darwin9-gcc-4.0.1 -gfull -ObjC -c OpenAL.c -isysroot $SDK -I /sw/include
#/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/arm-apple-darwin9-gcc-4.0.1 -gfull -ObjC -c SystemConfiguration.c -isysroot $SDK -I /sw/include

#link:
/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/libtool -dynamic -framework Foundation -framework CoreGraphics -framework UIKit -framework QuartzCore -framework OpenGLES -framework OpenAL -framework SystemConfiguration -lgcc_s.1 -lSystem -lobjc -o libstraptease.jnilib EAGLView.o CoreGraphics.o OpenGLES.o OpenAL.o SystemConfiguration.o -v -syslibroot $SDK

#sign:
platform=/Developer/Platforms/iPhoneOS.platform
allocate=${platform}/Developer/usr/bin/codesign_allocate
export CODESIGN_ALLOCATE=${allocate}
codesign -vfs "Atoro Code Signing" libstraptease.jnilib

#extract debugging symbols
dsymutil libstraptease.jnilib