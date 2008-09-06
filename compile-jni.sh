#!/bin/bash

cd target/swig/c

#compile:
/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/arm-apple-darwin9-gcc-4.0.1 -v -c CoreGraphics.c -I /sw/include -I /Developer/SDKs/iPhoneOS.sdk/Versions/iPhoneOS2.0.sdk/include/ -I /Developer/Platforms/iPhoneOS.platform/Developer/usr/lib/gcc/arm-apple-darwin9/4.0.1/include

#link:
/Developer/Platforms/iPhoneOS.platform/Developer/usr/bin/libtool -dynamic -framework CoreGraphics -framework UIKit -lgcc_s.1 -lSystem -o libstraptease.jnilib CoreGraphics.o -v -syslibroot /Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS2.0.sdk/

#sign:
platform=/Developer/Platforms/iPhoneOS.platform
allocate=${platform}/Developer/usr/bin/codesign_allocate
export CODESIGN_ALLOCATE=${allocate}
codesign -vfs "Atoro Code Signing" libstraptease.jnilib
