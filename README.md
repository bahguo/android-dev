# android-dev
## adt-bundle:
- https://dl.google.com/android/adt/adt-bundle-mac-x86_64-20140702.zip
- https://dl.google.com/android/adt/adt-bundle-linux-x86-20140702.zip
- https://dl.google.com/android/adt/adt-bundle-linux-x86_64-20140702.zip
- https://dl.google.com/android/adt/adt-bundle-windows-x86-20140702.zip
- https://dl.google.com/android/adt/adt-bundle-windows-x86_64-20140702.zip

## android studio
Installer:
- https://dl.google.com/dl/android/studio/install/2024.3.2.14/android-studio-2024.3.2.14-cros.deb
- https://dl.google.com/dl/android/studio/install/2025.1.1.9/android-studio-2025.1.1.9-mac.dmg
- https://dl.google.com/dl/android/studio/install/2025.1.1.9/android-studio-2025.1.1.9-mac_arm.dmg
- https://dl.google.com/dl/android/studio/ide-zips/2024.3.2.14/android-studio-2024.3.2.14-linux.tar.gz
- https://dl.google.com/dl/android/studio/install/2025.1.1.19/android-studio-2025.1.1.19-windows.exe
- https://dl.google.com/dl/android/studio/ide-zips/2024.3.2.14/android-studio-2025.1.1.19-windows.zip

Archieves: https://developer.android.com/studio/archive  

## gradle(can be install by android-studio)
gradle: https://services.gradle.org/distributions/gradle-{revision}-all.zip  

## build-tools(can be install by android-studio)
build-tools: https://dl.google.com/android/repository/build-tools_{revision}-windows.zip  

## Android SDK Platform
sdk-platform: https://dl.google.com/android/repository/platform-{num}_{revision}.zip  

## ndk repos(can be install by android-studio)
* direct links
  - windows: https://dl.google.com/android/repository/android-ndk-{revision}-windows-x86_64.zip  
  - linux: https://dl.google.com/android/repository/android-ndk-{revision}-linux-x86_64.zip  
  - darwin: https://dl.google.com/android/repository/android-ndk-{revision}-darwin-x86_64.zip
* webpage
  - latest: https://developer.android.google.cn/ndk/downloads
  - older: https://developer.android.google.cn/ndk/downloads/older_releases
* googlesource url: https://android.googlesource.com/platform/prebuilts/ndk

## ninja
The cmake in android-studio may contains ninja, if you install cmake by your self,  
you may need download at https://github.com/ninja-build/ninja/releases, and copy to directory of cmake.exe

## gradle plugin(can be install by android-studio)
https://dl.google.com/android/studio/plugins/android-gradle/preview/offline-android-gradle-plugin-preview.zip  

## gmaven offline(can be install by android-studio)
https://dl.google.com/android/studio/maven-google-com/stable/offline-gmaven-stable.zip  

## gradle mirror in china
```gradle
buildscript {
    repositories {
        maven { url 'https://maven.aliyun.com/repository/google/' }
        maven { url 'https://maven.aliyun.com/repository/jcenter/'}
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:4.0.1'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }        
}

allprojects {
    repositories {
        maven { url 'https://maven.aliyun.com/repository/google/' }
        maven { url 'https://maven.aliyun.com/repository/jcenter/'}
    }
}
```

## gradle-wrapper.properties
```gradle
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists
distributionUrl=file:///d:/dev/adt/gradle-7.5-bin.zip
```
