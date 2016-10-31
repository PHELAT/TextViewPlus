# TextViewPlus Library

Just a simple library for Android that provides setting custom font on TextView from xml layout or Java class

## Installation
### Gradle
```groovy
dependencies {
    ...
    compile 'phelat.textview:textviewplus:1.0'
}
```
### Maven
```xml
<dependency>
  <groupId>phelat.textview</groupId>
  <artifactId>textviewplus</artifactId>
  <version>1.0</version>
  <type>pom</type>
</dependency>
```

## Usage
1.  Put your font (.ttf or .otf) in the assets directory of your project
2.  In your layout use the below tag with attribute app:font="" (inside double quotes type your font name)
```xml
<PHELAT.TextView.Plus
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Hello World!"
    android:gravity="center"
    android:textSize="50sp"
    android:layout_marginTop="10dp"
    android:id="@+id/myTextView"
    app:font="Roboto-Black.ttf"/>
```
also you can use TextViewPlus library in your Java class
```java
Plus myTextView = (Plus) findViewById(R.id.myTextView);
myTextView.setFont(context, "Roboto-Black.ttf");
```

## License
```
Copyright 2016 Nouri Mohammad Mahdi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0
    
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
