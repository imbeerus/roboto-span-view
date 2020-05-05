# multispan-view
[![API](https://img.shields.io/badge/API-15%2B-orange.svg)](https://android-arsenal.com/api?level=15)
[![License](https://img.shields.io/badge/license-Apache%202-red.svg)](https://www.apache.org/licenses/LICENSE-2.0)
![Android CI](https://github.com/lndmflngs/multispan-view/workflows/Android%20CI/badge.svg?branch=master)
[![](https://jitpack.io/v/lndmflngs/multispan-view.svg)](https://jitpack.io/#lndmflngs/multispan-view)

MultiSpanView with Roboto fonts

<img src="https://github.com/lndmflngs/multispan-view/blob/master/art/1.png?raw=true" width="45%" />

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
        implementation 'com.github.lndmflngs:multispan-view:1.0.0'
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
[1]: https://github.com/lndmflngs/multispan-view/releases/latest
[2]: https://github.com/lndmflngs/compound-text-view
[3]: https://github.com/lndmflngs/multispan-view#usage
[4]: https://github.com/lndmflngs/multispan-view/blob/master/app/src/main/java/com/lockwood/multispandemo/BindingExample.kt
[5]: https://github.com/lndmflngs/compound-text-view/blob/master/app/src/main/java/com/lockwood/compoundemo/fragment/RecyclerFragment.kt#L102-L107
[6]: https://github.com/lndmflngs/compound-text-view/blob/master/app/src/main/java/com/lockwood/compoundemo/fragment/RecyclerFragment.kt#L110-L114
[7]: https://github.com/lndmflngs/compound-text-view/blob/master/app/src/main/java/com/lockwood/compoundemo/fragment/RecyclerFragment.kt#L117-L124
[8]: https://github.com/lndmflngs/multispan-view/blob/master/app/src/main/java/com/lockwood/multispandemo/span/AlignTopSuperscriptSpan.kt
[9]: https://github.com/lndmflngs/multispan-view/blob/master/app/src/main/java/com/lockwood/multispandemo/view/SuperscriptTextView.kt