# NavigationUI

## **Implementation Step-by-Step**

### **Step1:** Take a new project and Refactor your app to support androidx as shown below:

<img src="https://pli.io/2M9zMn.png" />

### **Step2:** Add Navigation Architecture Component suppporting dependency in your app level Gradle:

```Java
def nav_version = "1.0.0-alpha06"

// Navigation components
implementation "android.arch.navigation:navigation-fragment:$nav_version"
implementation "android.arch.navigation:navigation-ui:$nav_version"
```

### **Step3:** Add navigatiion to your project:

1. Click File > Settings (Android Studio > Preferences on Mac), select the Experimental category in the left pane, check Enable Navigation Editor, and then restart Android Studio.

2. In the Project window, right-click on the res directory and select New > Android Resource File. The New Resource File dialog appears.

3. Type a name in the File name field, such as "nav_graph".

4. Select Navigation from the Resource type drop-down list.

5. Click OK. The following occurs:

 - A navigation resource directory is created within the res directory. 
 - A nav_graph.xml file is created within the navigation directory.
 - The nav_graph.xml file opens in the Navigation Editor. This xml file contains your navigation graph.
 
 6. Click the Text tab to toggle to the XML text view. The XML for an empty navigation graph looks like this:
 
 ```xml
<?xml version="1.0" encoding="utf-8"?>
<navigation xmlns:android="http://schemas.android.com/apk/res/android">
  ...
</navigation>
```

7. Click Design to return to the Navigation Editor.

### **Step4:** Design your Fragments and your navigation should look like this:

```xml
<?xml version="1.0" encoding="utf-8"?>
<navigation xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/nav_graph"
    app:startDestination="@id/defaultFragment">

    <fragment
        android:id="@+id/firstFragment"
        android:name="com.example.umangburman.navdrawerwithnavcomponent.FirstFragment"
        android:label="First Fragment"
        tools:layout="@layout/first_fragment" />
    <fragment
        android:id="@+id/secondFragment"
        android:name="com.example.umangburman.navdrawerwithnavcomponent.SecondFragment"
        android:label="Second Fragment"
        tools:layout="@layout/second_fragment" />
    <fragment
        android:id="@+id/thirdFragment"
        android:name="com.example.umangburman.navdrawerwithnavcomponent.ThirdFragment"
        android:label="Third Fragment"
        tools:layout="@layout/third_fragment" />
    <fragment
        android:id="@+id/defaultFragment"
        android:name="com.example.umangburman.navdrawerwithnavcomponent.DefaultFragment"
        android:label="Default Fragment"
        tools:layout="@layout/default_fragment" >
    </fragment>

</navigation>
```


## **Result**

 <img src="https://github.com/lucaslima777/NavigationUI/blob/master/demo/img.png?raw=true" />


# Developed By

* Lucas Lima 
 * :email: e-mail: lucaslimatorre@gmail.com
 
 [![LinkedIn](https://img.shields.io/badge/LinkedIn-LucasLima-blue.svg)](https://www.linkedin.com/in/lucas-lima-torre/)
 

![GitHub issue age](https://img.shields.io/badge/build-android%20studio-brightgreen.svg)



# License

    Copyright 2018 Lucas Lima

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
