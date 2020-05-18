# roboto-span-view
[![API](https://img.shields.io/badge/API-15%2B-orange.svg)](https://android-arsenal.com/api?level=15)
[![License](https://img.shields.io/badge/license-Apache%202-red.svg)](https://www.apache.org/licenses/LICENSE-2.0)
![Android CI](https://github.com/lndmflngs/roboto-span-view/workflows/Android%20CI/badge.svg)
[![](https://jitpack.io/v/lndmflngs/roboto-span-view.svg)](https://jitpack.io/#lndmflngs/roboto-span-view)

Multi span TextView with Roboto fonts

<img src="https://github.com/lndmflngs/roboto-span-view/blob/master/art/1.png?raw=true" width="45%" />

## Download
Download the [latest release][1] or grab via Gradle:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
```
dependencies {
        implementation 'com.github.lndmflngs:roboto-span-view:1.0.0'
}
```
## Usage
The simplest way is to use `RobotoSpanView` like a normal `TextView`

```xml
        <com.lockwood.multispan.roboto.RobotoTwoSpanView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:firstRobotoFont="medium"
            app:firstText="Username"
            app:firstSeparator=":"
            app:orientation="vertical"
            app:secondRobotoFont="regular"
            app:secondText="Mr. Fluffypants" />
```
#### Styling
You can make your own spans like a [AlignTopSuperscriptSpan][8] and apply them in your [custom views][9]

For more information see `app` directory

## See also 
* [**compound-text-view**](https://github.com/lndmflngs/compound-text-view) - Change gravity of Image Drawable in TextView 🌌
* [**multispan-view**](https://github.com/lndmflngs/multispan-view) - TextView with power of Spans 💪
* [**font-span-view**](https://github.com/lndmflngs/font-span-view) - Multi span TextView with custom fonts

## Issue Tracking
Found a bug? Have an idea for an improvement? Feel free to [add an issue](../../issues)

## License

```
Copyright (C) 2020 Ivan Zinovyev (https://github.com/lndmflngs)
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
[1]: https://github.com/lndmflngs/roboto-span-view/releases/latest
[3]: https://github.com/lndmflngs/roboto-span-view#usage
[8]: https://github.com/lndmflngs/roboto-span-view/blob/master/app/src/main/java/com/lockwood/robotospandemo/span/AlignTopSuperscriptSpan.kt
[9]: https://github.com/lndmflngs/roboto-span-view/blob/master/app/src/main/java/com/lockwood/robotospandemo/view/SuperscriptTextView.kt
